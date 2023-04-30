/**
 * 
 */
package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.ICientificoDAO;
import com.dto.Cientifico;

/**
 * @author Palmira
 *
 */
@Service
public class CientificoServiceImpl implements ICientificoService {

	@Autowired
	ICientificoDAO iCientificoDao;

	@Override
	public List<Cientifico> listar() {
		return iCientificoDao.findAll();
	}

	@Override
	public Cientifico guardar(Cientifico cientifico) {
		return iCientificoDao.save(cientifico);
	}

	@Override
	public Cientifico cientificoXID(String id) {
		return iCientificoDao.findById(id).get();
	}

	@Override
	public Cientifico actualizarCientifico(Cientifico cientifico) {
		return iCientificoDao.save(cientifico);
	}

	@Override
	public void eliminarCientifico(String id) {
		iCientificoDao.deleteById(id);
	}

}
