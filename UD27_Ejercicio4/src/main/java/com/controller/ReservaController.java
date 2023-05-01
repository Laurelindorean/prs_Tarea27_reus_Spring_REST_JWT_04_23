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

import com.dto.Reserva;
import com.service.ReservaServiceImpl;

/**
 * @author Palmira
 *
 */
@RestController
@RequestMapping("/api")
public class ReservaController {

	@Autowired
	ReservaServiceImpl reservaServiceImp;

	@GetMapping("/reserva")
	public List<Reserva> listar() {
		return reservaServiceImp.listar();
	}

	@PostMapping("/reserva")
	public Reserva guardar(@RequestBody Reserva reserva) {
		return reservaServiceImp.guardar(reserva);
	}

	@GetMapping("/reserva/{id}")
	public Reserva reservaXID(@PathVariable(name = "id") int id) {
		Reserva reservaxid = reservaServiceImp.reservaXID(id);
		return reservaxid;
	}

	@PutMapping("/reserva/{id}")
	public Reserva actualizarReserva(@PathVariable(name = "id") int id, @RequestBody Reserva reserva) {
		Reserva reserva_sel = reservaServiceImp.reservaXID(id);
		reserva_sel.setEquipo(reserva.getEquipo());
		reserva_sel.setInvestigador(reserva.getInvestigador());
		reserva_sel.setComienzo(reserva.getComienzo());
		reserva_sel.setFin(reserva.getFin());
		return reservaServiceImp.actualizarReserva(reserva_sel);
	}

	@DeleteMapping("/reserva/{id}")
	public void eliminarReserva(@PathVariable(name = "id") int id) {
		reservaServiceImp.eliminarReserva(id);
	}

}
