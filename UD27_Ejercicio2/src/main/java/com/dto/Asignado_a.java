/**
 * 
 */
package com.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * @author Palmira
 *
 */
@Entity
@Table(name = "asignado_a")
public class Asignado_a {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@ManyToOne
	@JoinColumn(name = "cientifico_id")
	Cientifico cientifico;

	@ManyToOne
	@JoinColumn(name = "proyecto_id")
	Proyecto proyecto;

	// Constructores
	public Asignado_a() {

	}

	/**
	 * @param id
	 * @param cientifico
	 * @param proyecto
	 */
	public Asignado_a(int id, Cientifico cientifico, Proyecto proyecto) {
		super();
		this.id = id;
		this.cientifico = cientifico;
		this.proyecto = proyecto;
	}

	// Getters y Setters

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the cientifico
	 */
	public Cientifico getCientifico() {
		return cientifico;
	}

	/**
	 * @param cientifico the cientifico to set
	 */
	public void setCientifico(Cientifico cientifico) {
		this.cientifico = cientifico;
	}

	/**
	 * @return the proyecto
	 */
	public Proyecto getProyecto() {
		return proyecto;
	}

	/**
	 * @param proyecto the proyecto to set
	 */
	public void setProyecto(Proyecto proyecto) {
		this.proyecto = proyecto;
	}

}
