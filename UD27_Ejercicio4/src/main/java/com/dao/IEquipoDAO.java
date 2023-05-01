/**
 * 
 */
package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dto.Equipo;

/**
 * @author Palmira
 *
 */
public interface IEquipoDAO extends JpaRepository<Equipo, String> {

}
