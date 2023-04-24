/**
 * 
 */
package com.service;

import java.util.List;

import com.dto.Pieza;

/**
 * @author Palmira
 *
 */
public interface IPiezaService {

	// Metodos del CRUD
	public List<Pieza> listar();

	public Pieza guardar(Pieza pieza);

	public Pieza piezaXID(int id);

	public Pieza actualizarPieza(Pieza pieza);

	public void eliminarPieza(int id);

}
