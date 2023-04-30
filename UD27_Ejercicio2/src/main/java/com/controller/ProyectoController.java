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

import com.dto.Proyecto;
import com.service.ProyectoServiceImpl;

/**
 * @author Palmira
 *
 */
@RestController
@RequestMapping("/api")
public class ProyectoController {

	@Autowired
	ProyectoServiceImpl proyectoServiceImp;

	@GetMapping("/proyecto")
	public List<Proyecto> listar() {
		return proyectoServiceImp.listar();
	}

	@PostMapping("proyecto")
	public Proyecto guardar(@RequestBody Proyecto proyecto) {
		return proyectoServiceImp.guardar(proyecto);
	}

	@GetMapping("/proyecto/{id}")
	public Proyecto proyectoXID(@PathVariable(name = "id") String id) {
		Proyecto proyectoXid = proyectoServiceImp.proyectoXID(id);
		return proyectoXid;
	}

	@PutMapping("/proyecto/{id}")
	public Proyecto actualizarProyecto(@PathVariable(name = "id") String id, @RequestBody Proyecto proyecto) {
		Proyecto proyecto_sel = proyectoServiceImp.proyectoXID(id);
		proyecto_sel.setNombre(proyecto.getNombre());
		proyecto_sel.setHoras(proyecto.getHoras());
		return proyectoServiceImp.actualizarProyecto(proyecto_sel);
	}

	@DeleteMapping("/proyecto/{id}")
	public void eliminarProyecto(@PathVariable(name = "id") String id) {
		proyectoServiceImp.eliminarProyecto(id);
	}

}
