/**
 * 
 */
package com.service;

import java.util.List;

import com.dto.Cajero;

/**
 * @author Palmira
 *
 */
public interface ICajeroService {

	// Metodos del CRUD
	public List<Cajero> listar();

	public Cajero guardar(Cajero cajero);

	public Cajero cajeroXID(int id);

	public Cajero actualizarCajero(Cajero cajero);

	public void eliminarCajero(int id);

}
