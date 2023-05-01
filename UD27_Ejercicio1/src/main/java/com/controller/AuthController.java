/**
 * 
 */
package com.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dao.IUsuarioDAO;
import com.dto.Usuario;
import com.dto.auth.JwtResponse;
import com.dto.auth.LoginRequest;
import com.dto.auth.SignupRequest;
import com.security.jwt.JwtTokenProvider;
import com.security.service.UserDetailsImpl;

/**
 * @author Palmira
 *
 */
@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/api/auth")
public class AuthController {

	private AuthenticationManager authenticationManager;
	private IUsuarioDAO usuarioDAO;
	private PasswordEncoder encoder;
	private JwtTokenProvider jwtUtils;

	public AuthController(AuthenticationManager authenticationManager, IUsuarioDAO usuarioDAO, PasswordEncoder encoder,
			JwtTokenProvider jwtUtils) {
		super();
		this.authenticationManager = authenticationManager;
		this.usuarioDAO = usuarioDAO;
		this.encoder = encoder;
		this.jwtUtils = jwtUtils;
	}

	@PostMapping("/signin")
	public ResponseEntity<?> authenticateUser(@RequestBody LoginRequest loginRequest) {

		Authentication authentication = authenticationManager.authenticate(
				new UsernamePasswordAuthenticationToken(loginRequest.getUsername(), loginRequest.getPassword()));

		SecurityContextHolder.getContext().setAuthentication(authentication);
		String jwt = jwtUtils.generateJwtToken(authentication);

		UserDetailsImpl userDetails = (UserDetailsImpl) authentication.getPrincipal();
		return ResponseEntity.ok(new JwtResponse(jwt, userDetails.getUsername()));
	}

	@PostMapping("/signup")
	public ResponseEntity<?> registerUser(@RequestBody SignupRequest signUpRequest) {

		if (this.usuarioDAO.findByUsername(signUpRequest.getUsername()) != null) {
			return ResponseEntity.badRequest().body("Error: Username is already taken!");
		}

		// Create new user's account
		Usuario user = new Usuario();
		user.setUsername(signUpRequest.getUsername());
		user.setPassword(this.encoder.encode(signUpRequest.getPassword()));
		this.usuarioDAO.save(user);
		return ResponseEntity.ok(null);
	}

}
