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

import com.dto.Investigador;
import com.service.InvestigadorServiceImpl;

/**
 * @author Palmira
 *
 */
@RestController
@RequestMapping("/api")
public class InvestigadorController {

	@Autowired
	InvestigadorServiceImpl investigadorServiceImp;

	@GetMapping("/investigadores")
	public List<Investigador> listar() {
		return investigadorServiceImp.listar();
	}

	@PostMapping("/investigadores")
	public Investigador guardar(@RequestBody Investigador inves) {
		return investigadorServiceImp.guardar(inves);
	}

	@GetMapping("/investigadores/{id}")
	public Investigador investigadorXID(@PathVariable(name = "id") String id) {
		Investigador inves_xid = investigadorServiceImp.investigadorXID(id);
		return inves_xid;
	}

	@PutMapping("/investigadores/{id}")
	public Investigador acualizarInvestigador(@PathVariable(name = "id") String id, @RequestBody Investigador inves) {
		Investigador inves_sel = investigadorServiceImp.investigadorXID(id);
		inves_sel.setNomApels(inves.getNomApels());
		inves_sel.setFacultad(inves.getFacultad());
		return investigadorServiceImp.acualizarInvestigador(inves_sel);
	}

	@DeleteMapping("/investigadores/{id}")
	public void eliminarInvestigador(@PathVariable(name = "id") String id) {
		investigadorServiceImp.eliminarInvestigador(id);
	}

}
