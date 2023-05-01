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
@Table(name = "facultad")
public class Facultad {

	@Id
	private int codigo;
	private String nombre;

	@OneToMany
	@JoinColumn(name = "facultad_id")
	private List<Equipo> equipo;

	@OneToMany
	@JoinColumn(name = "facultad_id")
	private List<Investigador> investigador;

	// Constructores
	public Facultad() {

	}

	/**
	 * @param codigo
	 * @param nombre
	 * @param equipo
	 * @param investigador
	 */
	public Facultad(int codigo, String nombre, List<Equipo> equipo, List<Investigador> investigador) {
		super();
		this.codigo = codigo;
		this.nombre = nombre;
		this.equipo = equipo;
		this.investigador = investigador;
	}

	// Getters y Setters
	/**
	 * @return the codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
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
	 * @return the equipo
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Equipo")
	public List<Equipo> getEquipo() {
		return equipo;
	}

	/**
	 * @param equipo the equipo to set
	 */
	public void setEquipo(List<Equipo> equipo) {
		this.equipo = equipo;
	}

	/**
	 * @return the investigador
	 */
	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Investigador")
	public List<Investigador> getInvestigador() {
		return investigador;
	}

	/**
	 * @param investigador the investigador to set
	 */
	public void setInvestigador(List<Investigador> investigador) {
		this.investigador = investigador;
	}

}
