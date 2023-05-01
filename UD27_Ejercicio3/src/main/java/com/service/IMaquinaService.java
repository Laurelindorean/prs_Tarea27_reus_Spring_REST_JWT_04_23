/**
 * 
 */
package com.service;

import java.util.List;

import com.dto.MaquinaRegistradora;

/**
 * @author Palmira
 *
 */
public interface IMaquinaService {

	// Metodos del CRUD
	public List<MaquinaRegistradora> listar();

	public MaquinaRegistradora guardar(MaquinaRegistradora maquina);

	public MaquinaRegistradora maquinaXID(int id);

	public MaquinaRegistradora actualizarMaquina(MaquinaRegistradora maquina);

	public void eliminarMaquina(int id);

}
