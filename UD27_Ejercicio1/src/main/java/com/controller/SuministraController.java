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

import com.dto.Suministra;
import com.service.SuministraServiceImpl;

/**
 * @author Palmira
 *
 */
@RestController
@RequestMapping("/api")
public class SuministraController {

	@Autowired
	SuministraServiceImpl suministraServiceImp;

	@GetMapping("/suministra")
	public List<Suministra> lista() {
		return suministraServiceImp.lista();
	}

	@PostMapping("/suministra")
	public Suministra salvarProveedor(@RequestBody Suministra suministra) {
		return suministraServiceImp.guardar(suministra);
	}

	@GetMapping("/suministra/{codigo}")
	public Suministra proveedorXID(@PathVariable(name = "codigo") int codigo) {
		Suministra suministra_xid = new Suministra();
		suministra_xid = suministraServiceImp.suministraXID(codigo);
		return suministra_xid;
	}

	@PutMapping("/suministra/{codigo}")
	public Suministra actualizarSuministra(@PathVariable(name = "codigo") int codigo,
			@RequestBody Suministra suministra) {
		Suministra suministra_selec = new Suministra();
		suministra_selec = suministraServiceImp.suministraXID(codigo);
		suministra_selec.setPrecio(suministra.getPrecio());
		suministra_selec.setPieza(suministra.getPieza());
		suministra_selec.setProveedor(suministra.getProveedor());
		return suministraServiceImp.actualizarSuministra(suministra_selec);
	}

	@DeleteMapping("/suministra/{codigo}")
	public void eliminarSuministra(@PathVariable(name = "codigo") int codigo) {
		suministraServiceImp.eliminarSuministra(codigo);
	}

}
