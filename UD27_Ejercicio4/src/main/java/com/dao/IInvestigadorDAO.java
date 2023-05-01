/**
 * 
 */
package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dto.Investigador;

/**
 * @author Palmira
 *
 */
public interface IInvestigadorDAO extends JpaRepository<Investigador, String> {

}
