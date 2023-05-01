/**
 * 
 */
package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dto.Reserva;

/**
 * @author Palmira
 *
 */
public interface IReservaDAO extends JpaRepository<Reserva, Integer> {

}
