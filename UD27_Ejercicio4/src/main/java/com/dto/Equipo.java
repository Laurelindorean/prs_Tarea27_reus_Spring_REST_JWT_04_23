/**
 * 
 */
package com.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 * @author Palmira
 *
 */
@Entity
@Table(name = "equipos")
public class Equipo {

	@Id
	@Column(name = "num_serie")
	private String numSerie;

	private String nombre;

	@OneToMany
	@JoinColumn(name = "equipo_id")
	private List<Reserva> reserva;

	@ManyToOne
	@JoinColumn(name = "facultad_id")
	Facultad facultad;

	// Constructores
	public Equipo() {

	}

	/**
	 * @param numSerie
	 * @param nombre
	 * @param reserva
	 * @param facultad
	 */
	public Equipo(String numSerie, String nombre, List<Reserva> reserva, Facultad facultad) {
		super();
		this.numSerie = numSerie;
		this.nombre = nombre;
		this.reserva = reserva;
		this.facultad = facultad;
	}

	// Setters y Getters
	/**
	 * @return the numSerie
	 */
	public String getNumSerie() {
		return numSerie;
	}

	/**
	 * @param numSerie the numSerie to set
	 */
	public void setNumSerie(String numSerie) {
		this.numSerie = numSerie;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the reserva
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Reserva")
	public List<Reserva> getReserva() {
		return reserva;
	}

	/**
	 * @param reserva the reserva to set
	 */
	public void setReserva(List<Reserva> reserva) {
		this.reserva = reserva;
	}

	/**
	 * @return the facultad
	 */
	public Facultad getFacultad() {
		return facultad;
	}

	/**
	 * @param facultad the facultad to set
	 */
	public void setFacultad(Facultad facultad) {
		this.facultad = facultad;
	}

}
