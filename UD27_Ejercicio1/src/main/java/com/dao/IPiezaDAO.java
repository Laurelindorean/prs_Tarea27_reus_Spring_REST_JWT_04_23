/**
 * 
 */
package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dto.Pieza;

/**
 * @author Palmira
 *
 */
public interface IPiezaDAO extends JpaRepository<Pieza, Integer>{

}
