/**
 * 
 */
package com.service;

import java.util.List;

import com.dto.Suministra;

/**
 * @author Palmira
 *
 */
public interface ISuministraService {

	// Metodos del CRUD
	public List<Suministra> lista();

	public Suministra guardar(Suministra suministra);

	public Suministra suministraXID(int id);

	public Suministra actualizarSuministra(Suministra suministra);

	public void eliminarSuministra(int id);

}
