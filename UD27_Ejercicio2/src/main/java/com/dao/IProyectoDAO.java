/**
 * 
 */
package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dto.Proyecto;

/**
 * @author Palmira
 *
 */
public interface IProyectoDAO extends JpaRepository<Proyecto, String> {

}
