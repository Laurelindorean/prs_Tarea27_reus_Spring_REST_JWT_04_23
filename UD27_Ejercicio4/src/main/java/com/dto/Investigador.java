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
@Table(name = "investigadores")
public class Investigador {

	@Id
	private String dni;
	@Column(name = "nom_apels")
	private String nomApels;

	@ManyToOne
	@JoinColumn(name = "facultad_id")
	Facultad facultad;

	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "investigador_id")
	private List<Reserva> reserva;

	// Constructores
	public Investigador() {

	}

	/**
	 * @param dni
	 * @param nomApels
	 * @param facultad
	 * @param reserva
	 */
	public Investigador(String dni, String nomApels, Facultad facultad, List<Reserva> reserva) {
		super();
		this.dni = dni;
		this.nomApels = nomApels;
		this.facultad = facultad;
		this.reserva = reserva;
	}

	// Getters y Setters

	/**
	 * @return the dni
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * @param dni the dni to set
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}

	/**
	 * @return the nomApels
	 */
	public String getNomApels() {
		return nomApels;
	}

	/**
	 * @param nomApels the nomApels to set
	 */
	public void setNomApels(String nomApels) {
		this.nomApels = nomApels;
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

	/**
	 * @return the reserva
	 */
	@JsonIgnore
	public List<Reserva> getReserva() {
		return reserva;
	}

	/**
	 * @param reserva the reserva to set
	 */
	public void setReserva(List<Reserva> reserva) {
		this.reserva = reserva;
	}

}
