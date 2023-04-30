/**
 * 
 */
package com.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dto.Usuario;
import com.service.UsuarioDetailsServiceImpl;

/**
 * @author Palmira
 *
 */
@RestController
@RequestMapping("/api/usuarios")
public class UsuarioController {

	private UsuarioDetailsServiceImpl usuarioDetailsService;
	
	@GetMapping
	public List<Usuario> listUsuario(){
		return usuarioDetailsService.listUsuario();
	}
}
