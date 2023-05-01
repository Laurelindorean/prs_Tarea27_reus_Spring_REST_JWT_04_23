/**
 * 
 */
package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dao.IReservaDAO;
import com.dto.Reserva;

/**
 * @author Palmira
 *
 */
@Service
public class ReservaServiceImpl implements IReservaService {

	@Autowired
	IReservaDAO iReservaDao;

	@Override
	public List<Reserva> listar() {
		return iReservaDao.findAll();
	}

	@Override
	public Reserva guardar(Reserva reserva) {
		return iReservaDao.save(reserva);
	}

	@Override
	public Reserva reservaXID(int id) {
		return iReservaDao.findById(id).get();
	}

	@Override
	public Reserva actualizarReserva(Reserva reserva) {
		return iReservaDao.save(reserva);
	}

	@Override
	public void eliminarReserva(int id) {
		iReservaDao.deleteById(id);
	}

}
