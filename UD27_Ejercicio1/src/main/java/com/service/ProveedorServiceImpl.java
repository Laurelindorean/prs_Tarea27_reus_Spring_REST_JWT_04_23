/**
 * 
 */
package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.IProveedorDAO;
import com.dto.Proveedor;

/**
 * @author Palmira
 *
 */
@Service
public class ProveedorServiceImpl implements IProveedorService {

	@Autowired
	private IProveedorDAO iProveedorDAO;

	@Override
	public List<Proveedor> listar() {
		return iProveedorDAO.findAll();
	}

	@Override
	public Proveedor guardar(Proveedor proveedor) {
		return iProveedorDAO.save(proveedor);
	}

	@Override
	public Proveedor proveedorXID(String id) {
		return iProveedorDAO.findById(id).get();
	}

	@Override
	public Proveedor actualizarProveedor(Proveedor proveedor) {
		return iProveedorDAO.save(proveedor);
	}

	@Override
	public void eliminarProveedor(String id) {
		iProveedorDAO.deleteById(id);
	}

}
