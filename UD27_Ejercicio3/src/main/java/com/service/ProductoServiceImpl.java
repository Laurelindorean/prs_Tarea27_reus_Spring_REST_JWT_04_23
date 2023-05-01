/**
 * 
 */
package com.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.IProductoDAO;
import com.dto.Producto;

/**
 * @author Palmira
 *
 */
@Service
public class ProductoServiceImpl implements IProductoService {

	@Autowired
	IProductoDAO iProductoDao;

	@Override
	public List<Producto> listar() {
		return iProductoDao.findAll();
	}

	@Override
	public Producto guardar(Producto producto) {
		return iProductoDao.save(producto);
	}

	@Override
	public Producto productoXID(int id) {
		return iProductoDao.findById(id).get();
	}

	@Override
	public Producto actualizarProducto(Producto producto) {
		return iProductoDao.save(producto);
	}

	@Override
	public void eliminarProducto(int id) {
		iProductoDao.deleteById(id);
	}
}
