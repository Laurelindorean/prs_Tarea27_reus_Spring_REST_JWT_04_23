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

import com.dto.Cientifico;
import com.service.CientificoServiceImpl;

/**
 * @author Palmira
 *
 */
@RestController
@RequestMapping("/api")
public class CientificoController {

	@Autowired
	CientificoServiceImpl cientificoServiceImp;

	@GetMapping("/cientificos")
	public List<Cientifico> listar() {
		return cientificoServiceImp.listar();
	}

	@PostMapping("/cientificos")
	public Cientifico guardar(@RequestBody Cientifico cientifico) {
		return cientificoServiceImp.guardar(cientifico);
	}

	@GetMapping("/cientificos/{id}")
	public Cientifico cientificoXID(@PathVariable(name = "id") String id) {
		Cientifico cientificoXid = cientificoServiceImp.cientificoXID(id);
		return cientificoXid;
	}

	@PutMapping("/cientificos/{id}")
	public Cientifico actualizarCientifico(@PathVariable(name = "id") String id, @RequestBody Cientifico cientifico) {
		Cientifico cientifico_sel = cientificoServiceImp.cientificoXID(id);
		cientifico_sel.setDni(cientifico.getDni());
		cientifico_sel.setNomApels(cientifico.getNomApels());
		return cientificoServiceImp.actualizarCientifico(cientifico_sel);
	}

	@DeleteMapping("/cientificos/{id}")
	public void eliminarCientifico(@PathVariable(name = "id") String id) {
		cientificoServiceImp.eliminarCientifico(id);

	}
}
