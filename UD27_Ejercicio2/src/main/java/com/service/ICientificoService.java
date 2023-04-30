/**
 * 
 */
package com.service;

import java.util.List;

import com.dto.Cientifico;

/**
 * @author Palmira
 *
 */
public interface ICientificoService {

	// Metodos del CRUD
	public List<Cientifico> listar();

	public Cientifico guardar(Cientifico cientifico);

	public Cientifico cientificoXID(String id);

	public Cientifico actualizarCientifico(Cientifico cientifico);

	public void eliminarCientifico(String id);

}
