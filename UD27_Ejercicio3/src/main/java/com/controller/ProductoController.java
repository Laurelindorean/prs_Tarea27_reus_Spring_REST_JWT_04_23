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

import com.dto.Producto;
import com.service.ProductoServiceImpl;

/**
 * @author Palmira
 *
 */
@RestController
@RequestMapping("/api")
public class ProductoController {

	@Autowired
	ProductoServiceImpl productoServiceImp;

	@GetMapping("/productos")
	public List<Producto> listar() {
		return productoServiceImp.listar();
	}

	@PostMapping("/productos")
	public Producto guardar(@RequestBody Producto producto) {
		return productoServiceImp.guardar(producto);
	}

	@GetMapping("/productos/{id}")
	public Producto productoXID(@PathVariable(name = "id") int id) {
		Producto productoxid = productoServiceImp.productoXID(id);
		return productoxid;
	}

	@PutMapping("/productos/{id}")
	public Producto actualizarProducto(@PathVariable(name = "id") int id, @RequestBody Producto producto) {
		Producto producto_sel = productoServiceImp.productoXID(id);
		producto_sel.setNombre(producto.getNombre());
		producto_sel.setPrecio(producto.getPrecio());
		return productoServiceImp.actualizarProducto(producto_sel);
	}

	@DeleteMapping("/productos/{id}")
	public void eliminarProducto(@PathVariable(name = "id") int id) {
		productoServiceImp.eliminarProducto(id);
	}

}
