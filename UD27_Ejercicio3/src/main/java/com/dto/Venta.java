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
@Table(name = "venta")
public class Venta {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@ManyToOne
	@JoinColumn(name = "cajero_id")
	Cajero cajero;
	@ManyToOne
	@JoinColumn(name = "producto_id")
	Producto producto;
	@ManyToOne
	@JoinColumn(name = "maquina_id")
	MaquinaRegistradora maquina;

	// Constructores
	public Venta() {

	}

	/**
	 * @param id
	 * @param cajero
	 * @param producto
	 * @param maquina
	 */
	public Venta(int id, Cajero cajero, Producto producto, MaquinaRegistradora maquina) {
		super();
		this.id = id;
		this.cajero = cajero;
		this.producto = producto;
		this.maquina = maquina;
	}

	// Setters y Getters

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
	 * @return the cajero
	 */
	public Cajero getCajero() {
		return cajero;
	}

	/**
	 * @param cajero the cajero to set
	 */
	public void setCajero(Cajero cajero) {
		this.cajero = cajero;
	}

	/**
	 * @return the producto
	 */
	public Producto getProducto() {
		return producto;
	}

	/**
	 * @param producto the producto to set
	 */
	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	/**
	 * @return the maquina
	 */
	public MaquinaRegistradora getMaquina() {
		return maquina;
	}

	/**
	 * @param maquina the maquina to set
	 */
	public void setMaquina(MaquinaRegistradora maquina) {
		this.maquina = maquina;
	}

}
