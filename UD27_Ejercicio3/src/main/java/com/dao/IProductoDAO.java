/**
 * 
 */
package com.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dto.Producto;

/**
 * @author Palmira
 *
 */
public interface IProductoDAO extends JpaRepository<Producto, Integer>{

}
