/**
 * 
 */
package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.ICajeroDAO;
import com.dto.Cajero;

/**
 * @author Palmira
 *
 */
@Service
public class CajeroServiceImpl implements ICajeroService {

	@Autowired
	ICajeroDAO iCajeroDao;

	@Override
	public List<Cajero> listar() {
		return iCajeroDao.findAll();
	}

	@Override
	public Cajero guardar(Cajero cajero) {
		return iCajeroDao.save(cajero);
	}

	@Override
	public Cajero cajeroXID(int id) {
		return iCajeroDao.findById(id).get();
	}

	@Override
	public Cajero actualizarCajero(Cajero cajero) {
		return iCajeroDao.save(cajero);
	}

	@Override
	public void eliminarCajero(int id) {
		iCajeroDao.deleteById(id);
	}

}
