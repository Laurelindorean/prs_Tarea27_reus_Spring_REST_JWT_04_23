/**
 * 
 */
package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.IVentaDAO;
import com.dto.Venta;

/**
 * @author Palmira
 *
 */
@Service
public class VentaServiceImpl implements IVentaService {

	@Autowired
	IVentaDAO iVentaDao;

	@Override
	public List<Venta> listar() {
		return iVentaDao.findAll();
	}

	@Override
	public Venta guardar(Venta venta) {
		return iVentaDao.save(venta);
	}

	@Override
	public Venta ventaXID(int id) {
		return iVentaDao.findById(id).get();
	}

	@Override
	public Venta actualizarVenta(Venta venta) {
		return iVentaDao.save(venta);
	}

	@Override
	public void eliminarVenta(int id) {
		iVentaDao.deleteById(id);
	}

}
