/**
 * 
 */
package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.IPiezaDAO;
import com.dto.Pieza;

/**
 * @author Palmira
 *
 */
@Service
public class PiezaServiceImpl implements IPiezaService {

	@Autowired
	private IPiezaDAO iPiezaDAO;

	@Override
	public List<Pieza> listar() {
		return iPiezaDAO.findAll();
	}

	@Override
	public Pieza guardar(Pieza pieza) {
		return iPiezaDAO.save(pieza);
	}

	@Override
	public Pieza piezaXID(int id) {
		return iPiezaDAO.findById(id).get();
	}

	@Override
	public Pieza actualizarPieza(Pieza pieza) {
		return iPiezaDAO.save(pieza);
	}

	@Override
	public void eliminarPieza(int id) {
		iPiezaDAO.deleteById(id);
	}

}
