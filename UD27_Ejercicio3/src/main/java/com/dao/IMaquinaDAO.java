/**
 * 
 */
package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dto.MaquinaRegistradora;

/**
 * @author Palmira
 *
 */
public interface IMaquinaDAO extends JpaRepository<MaquinaRegistradora, Integer> {

}
