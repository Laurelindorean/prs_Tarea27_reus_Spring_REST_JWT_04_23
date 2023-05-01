/**
 * 
 */
package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dto.Venta;

/**
 * @author Palmira
 *
 */
public interface IVentaDAO extends JpaRepository<Venta, Integer>{

}
