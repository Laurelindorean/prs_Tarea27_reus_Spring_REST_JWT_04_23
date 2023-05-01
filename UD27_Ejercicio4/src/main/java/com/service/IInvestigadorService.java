/**
 * 
 */
package com.service;

import java.util.List;

import com.dto.Investigador;

/**
 * @author Palmira
 *
 */
public interface IInvestigadorService {

	// Metodos del CRUD
	public List<Investigador> listar();

	public Investigador guardar(Investigador inves);

	public Investigador investigadorXID(String id);

	public Investigador acualizarInvestigador(Investigador inves);

	public void eliminarInvestigador(String id);

}
