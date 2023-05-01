/**
 * 
 */
package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dto.Proveedor;
import com.service.ProveedorServiceImpl;

/**
 * @author Palmira
 *
 */
@RestController
@RequestMapping("/api")
public class ProveedorController {
	@Autowired
	ProveedorServiceImpl proveedorServiceImp;

	@GetMapping("/proveedores")
	public List<Proveedor> listarProveedor() {
		return proveedorServiceImp.listar();
	}

	@PostMapping("/proveedores")
	public Proveedor salvarProveedor(@RequestBody Proveedor proveedor) {
		return proveedorServiceImp.guardar(proveedor);
	}

	@GetMapping("/proveedores/{id}")
	public Proveedor proveedorXID(@PathVariable(name = "id") String id) {
		Proveedor proveedor_xid = new Proveedor();
		proveedor_xid = proveedorServiceImp.proveedorXID(id);
		return proveedor_xid;
	}

	@PutMapping("/proveedores/{id}")
	public Proveedor actualizarProveedor(@PathVariable(name = "id") String id, @RequestBody Proveedor proveedor) {
		Proveedor proveedor_selec = new Proveedor();
		proveedor_selec = proveedorServiceImp.proveedorXID(id);
		proveedor_selec.setNombre(proveedor.getNombre());
		return proveedorServiceImp.actualizarProveedor(proveedor_selec);
	}

	@DeleteMapping("/proveedores/{id}")
	public void eliminarProveedor(@PathVariable(name = "id") String id) {
		proveedorServiceImp.eliminarProveedor(id);
	}

}
