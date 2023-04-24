/**
 * 
 */
package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.ISuministraDAO;
import com.dto.Suministra;

/**
 * @author Palmira
 *
 */
@Service
public class SuministraServiceImpl implements ISuministraService {

	@Autowired
	private ISuministraDAO isuministraDAO;

	@Override
	public List<Suministra> lista() {
		return isuministraDAO.findAll();
	}

	@Override
	public Suministra guardar(Suministra suministra) {
		return isuministraDAO.save(suministra);
	}

	@Override
	public Suministra suministraXID(int id) {
		return isuministraDAO.findById(id).get();
	}

	@Override
	public Suministra actualizarSuministra(Suministra suministra) {
		return isuministraDAO.save(suministra);
	}

	@Override
	public void eliminarSuministra(int id) {
		isuministraDAO.deleteById(id);
	}

}
