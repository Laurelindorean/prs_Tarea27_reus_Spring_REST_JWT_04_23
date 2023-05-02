/**
 * 
 */
package com.security.service;

import java.util.Collection;
import java.util.Objects;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.dto.Usuario;
import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * @author Palmira
 *
 */
public class UserDetailsImpl implements UserDetails {

	private static final long serialVersionUID = -4243254012422075300L;
	private String username;
	@JsonIgnore
	private String password;
	private String name;

	private Collection<? extends GrantedAuthority> authorities;

	public UserDetailsImpl(String username, String password) {
		this.username = username;
		this.password = password;

	}

	public static UserDetailsImpl build(Usuario user) {
		/*
		 * Mi Usertb no tiene roles, así que no es necesario hacer esta parte
		 * List<GrantedAuthority> authorities = user.getRoles().stream() .map(role ->
		 * new
		 * SimpleGrantedAuthority(role.getName().name())).collect(Collectors.toList());
		 */
		return new UserDetailsImpl(user.getUsername(), user.getPassword());
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}

	@Override
	public String getPassword() {
		return password;
	}

	@Override
	public String getUsername() {
		return username;
	}

	public String getName() {
		return name;
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o)
			return true;
		if (o == null || getClass() != o.getClass())
			return false;
		UserDetailsImpl user = (UserDetailsImpl) o;
		return Objects.equals(this.username, user.username);
	}

}
