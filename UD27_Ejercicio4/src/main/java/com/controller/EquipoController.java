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

import com.dto.Equipo;
import com.service.EquipoServiceImpl;

/**
 * @author Palmira
 *
 */
@RestController
@RequestMapping("/api")
public class EquipoController {

	@Autowired
	EquipoServiceImpl equipoServiceImp;

	@GetMapping("/equipos")
	public List<Equipo> listar() {
		return equipoServiceImp.listar();
	}

	@PostMapping("/equipos")
	public Equipo guardar(@RequestBody Equipo equipo) {
		return equipoServiceImp.guardar(equipo);
	}

	@GetMapping("/equipos/{id}")
	public Equipo equipoXID(@PathVariable(name = "id") String id) {
		Equipo equipo_xid = equipoServiceImp.equipoXID(id);
		return equipo_xid;
	}

	@PutMapping("/equipos/{id}")
	public Equipo actualizarEquipo(@PathVariable(name = "id") String id, @RequestBody Equipo equipo) {
		Equipo equipo_sel = equipoServiceImp.equipoXID(id);
		equipo_sel.setNombre(equipo.getNombre());
		equipo_sel.setFacultad(equipo.getFacultad());
		return equipoServiceImp.actualizarEquipo(equipo_sel);
	}

	@DeleteMapping("/equipos/{id}")
	public void eliminarEquipo(@PathVariable(name = "id") String id) {
		equipoServiceImp.eliminarEquipo(id);
	}

}
