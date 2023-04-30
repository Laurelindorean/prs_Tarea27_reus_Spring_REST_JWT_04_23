/**
 * 
 */
package com.service;

import static java.util.Collections.emptyList;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.dao.IUsuarioDAO;
import com.dto.Usuario;

/**
 * @author Palmira
 *
 */
@Service
public class UsuarioDetailsServiceImpl implements UserDetailsService {

	@Autowired
	private IUsuarioDAO iUsuarioDAO;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Usuario user = iUsuarioDAO.findByUsername(username);
		if (user == null) {

			throw new UsernameNotFoundException(username);
		}
		return new User(user.getUsername(), user.getPassword(), emptyList());
	}
	
	public List<Usuario> listUsuario(){
		return iUsuarioDAO.findAll();
	}
}
