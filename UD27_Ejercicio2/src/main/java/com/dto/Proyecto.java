/**
 * 
 */
package com.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
@Table(name = "proyecto")
public class Proyecto {

	@Id
	private String id;
	private String nombre;
	private int horas;
	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "proyecto_id")
	private List<Asignado_a> asignado;

	// Constructores
	public Proyecto() {

	}

	/**
	 * @param id
	 * @param nombre
	 * @param horas
	 * @param asignado
	 */
	public Proyecto(String id, String nombre, int horas, List<Asignado_a> asignado) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.horas = horas;
		this.asignado = asignado;
	}

	// Getters y Setters

	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
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
	 * @return the horas
	 */
	public int getHoras() {
		return horas;
	}

	/**
	 * @param horas the horas to set
	 */
	public void setHoras(int horas) {
		this.horas = horas;
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
