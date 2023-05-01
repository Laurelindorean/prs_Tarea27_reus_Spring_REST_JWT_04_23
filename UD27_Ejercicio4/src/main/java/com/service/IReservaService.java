/**
 * 
 */
package com.service;

import java.util.List;

import com.dto.Reserva;

/**
 * @author Palmira
 *
 */
public interface IReservaService {

	// Metodos del CRUD
	public List<Reserva> listar();

	public Reserva guardar(Reserva reserva);

	public Reserva reservaXID(int id);

	public Reserva actualizarReserva(Reserva reserva);

	public void eliminarReserva(int id);

}
