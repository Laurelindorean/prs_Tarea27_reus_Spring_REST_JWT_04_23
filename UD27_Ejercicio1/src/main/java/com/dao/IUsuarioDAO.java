/**
 * 
 */
package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dto.Usuario;

/**
 * @author Palmira
 *
 */
public interface IUsuarioDAO extends JpaRepository<Usuario, Long> {

	public Usuario findByUsername(String username);
}
