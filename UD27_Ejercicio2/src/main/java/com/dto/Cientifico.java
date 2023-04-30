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
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 * @author Palmira
 *
 */
@Entity
@Table(name = "cientificos")
public class Cientifico {

	@Id
	private String dni;
	@Column(name = "nom_apels")
	private String nomApels;

	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "cientifico_id")
	private List<Asignado_a> asignado;

	// Constructores
	public Cientifico() {

	}

	/**
	 * @param dni
	 * @param nomApels
	 * @param asignado
	 */
	public Cientifico(String dni, String nomApels, List<Asignado_a> asignado) {
		super();
		this.dni = dni;
		this.nomApels = nomApels;
		this.asignado = asignado;
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
	 * @return the asignado
	 */
	@JsonIgnore
	public List<Asignado_a> getAsignado() {
		return asignado;
	}

	/**
	 * @param asignado the asignado to set
	 */
	public void setAsignado(List<Asignado_a> asignado) {
		this.asignado = asignado;
	}

}
