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

import com.dto.Cajero;
import com.service.CajeroServiceImpl;

/**
 * @author Palmira
 *
 */
@RestController
@RequestMapping("/api")
public class CajeroController {

	@Autowired
	CajeroServiceImpl cajeroServiceImp;

	@GetMapping("/cajeros")
	public List<Cajero> listar() {
		return cajeroServiceImp.listar();
	}

	@PostMapping("/cajeros")
	public Cajero guardar(@RequestBody Cajero cajero) {
		return cajeroServiceImp.guardar(cajero);
	}

	@GetMapping("/cajeros/{id}")
	public Cajero cajeroXID(@PathVariable(name = "id") int id) {
		Cajero cajeroxid = cajeroServiceImp.cajeroXID(id);
		return cajeroxid;
	}

	@PutMapping("/cajeros/{id}")
	public Cajero actualizarCajero(@PathVariable(name = "id") int id, @RequestBody Cajero cajero) {
		Cajero cajero_sel = cajeroServiceImp.cajeroXID(id);
		cajero_sel.setNomApels(cajero.getNomApels());
		return cajeroServiceImp.actualizarCajero(cajero_sel);
	}

	@DeleteMapping("/cajeros/{id}")
	public void eliminarCajero(@PathVariable(name = "id") int id) {
		cajeroServiceImp.eliminarCajero(id);
	}

}
