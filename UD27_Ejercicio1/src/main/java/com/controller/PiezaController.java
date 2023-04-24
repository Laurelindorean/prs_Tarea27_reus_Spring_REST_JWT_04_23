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

import com.dto.Pieza;
import com.service.PiezaServiceImpl;

/**
 * @author Palmira
 *
 */
@RestController
@RequestMapping("/api")
public class PiezaController {

	@Autowired
	private PiezaServiceImpl piezaServiceImp;

	@GetMapping("/piezas")
	public List<Pieza> listar() {
		return piezaServiceImp.listar();
	}

	@PostMapping("/piezas")
	public Pieza guardar(@RequestBody Pieza pieza) {
		return piezaServiceImp.guardar(pieza);
	}

	@GetMapping("/piezas/{id}")
	public Pieza piezaXID(@PathVariable(name = "id") int id) {
		Pieza pieza_xid = new Pieza();
		pieza_xid = piezaServiceImp.piezaXID(id);
		return pieza_xid;
	}

	@PutMapping("/piezas/{id}")
	public Pieza actualizarPieza(@PathVariable(name = "id") int id, @RequestBody Pieza pieza) {
		Pieza pieza_sel = new Pieza();
		pieza_sel = piezaServiceImp.piezaXID(id);
		pieza_sel.setNombre(pieza.getNombre());
		return piezaServiceImp.actualizarPieza(pieza_sel);
	}

	@DeleteMapping
	public void eliminarPieza(@PathVariable(name = "id") int id) {
		piezaServiceImp.eliminarPieza(id);
	}

}
