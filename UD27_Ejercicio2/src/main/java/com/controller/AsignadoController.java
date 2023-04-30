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

import com.dto.Asignado_a;
import com.service.AsignadoServiceImpl;

/**
 * @author Palmira
 *
 */
@RestController
@RequestMapping("/api")
public class AsignadoController {

	@Autowired
	AsignadoServiceImpl asignadoServiceImp;

	@GetMapping("/asignado_a")
	public List<Asignado_a> listar() {
		return asignadoServiceImp.listar();
	}

	@PostMapping("/asignado_a")
	public Asignado_a guardar(@RequestBody Asignado_a asignado_a) {
		return asignadoServiceImp.guardar(asignado_a);
	}

	@GetMapping("/asignado_a/{id}")
	public Asignado_a asignadoXID(@PathVariable(name = "id") int id) {
		Asignado_a asignadoXid = asignadoServiceImp.asignadoXID(id);
		return asignadoXid;
	}

	@PutMapping("/asignado_a/{id}")
	public Asignado_a actualizarAsignado(@PathVariable(name = "id") int id, @RequestBody Asignado_a asignado_a) {
		Asignado_a asignado_sel = asignadoServiceImp.asignadoXID(id);
		asignado_sel.setCientifico(asignado_a.getCientifico());
		asignado_sel.setProyecto(asignado_sel.getProyecto());
		return asignadoServiceImp.actualizarAsignado(asignado_sel);
	}

	@DeleteMapping("/asignado_a/{id}")
	public void eliminarAsignado(@PathVariable(name = "id") int id) {
		asignadoServiceImp.eliminarAsignado(id);
	}

}
