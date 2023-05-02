/**
 * 
 */
package com.security.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.dao.IUsuarioDAO;
import com.dto.Usuario;

import jakarta.transaction.Transactional;

/**
 * @author Palmira
 *
 */
@Service
public class UserDetailsServiceImpl implements UserDetailsService {

	private IUsuarioDAO usuarioDAO;

	public UserDetailsServiceImpl(IUsuarioDAO usuarioDAO) {
		super();
		this.usuarioDAO = usuarioDAO;
	}

	@Override
	@Transactional
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario userEntity = this.usuarioDAO.findByUsername(username);
		if (userEntity == null) {
			throw new UsernameNotFoundException("User Not Found with username: " + username);
		}
		return UserDetailsImpl.build(userEntity);
	}

}
