/**
 * 
 */
package com.service;

import java.util.List;

import com.dto.Proveedor;

/**
 * @author Palmira
 *
 */
public interface IProveedorService {

	// Metodos del CRUD
	public List<Proveedor> listar();

	public Proveedor guardar(Proveedor proveedor);

	public Proveedor proveedorXID(String id);

	public Proveedor actualizarProveedor(Proveedor proveedor);

	public void eliminarProveedor(String id);

}
