/**
 * 
 */
package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.dao.IEquipoDAO;
import com.dto.Equipo;


/**
 * @author Palmira
 *
 */
@Service
public class EquipoServiceImpl implements IEquipoService {

	@Autowired
	IEquipoDAO iEquipoDao;

	@Override
	public List<Equipo> listar() {
		return iEquipoDao.findAll();
	}

	@Override
	public Equipo guardar(Equipo equipo) {
		return iEquipoDao.save(equipo);
	}

	@Override
	public Equipo equipoXID(String id) {
		return iEquipoDao.findById(id).get();
	}

	@Override
	public Equipo actualizarEquipo(Equipo equipo) {
		return iEquipoDao.save(equipo);
	}

	@Override
	public void eliminarEquipo(String id) {
		iEquipoDao.deleteById(id);
	}

}
