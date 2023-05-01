/**
 * 
 */
package com.service;

import java.util.List;

import com.dto.Equipo;

/**
 * @author Palmira
 *
 */
public interface IEquipoService {

	// Metodos del CRUD
	public List<Equipo> listar();

	public Equipo guardar(Equipo equipo);

	public Equipo equipoXID(String id);

	public Equipo actualizarEquipo(Equipo equipo);

	public void eliminarEquipo(String id);

}
