/**
 * 
 */
package com.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

/**
 * @author Palmira
 *
 */
@Entity
@Table(name = "maquinas_registradoras")
public class MaquinaRegistradora {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	private int piso;

	@OneToMany(fetch = FetchType.LAZY)
	@JoinColumn(name = "producto_id")
	private List<Venta> venta;

	// Constructores
	public MaquinaRegistradora() {

	}

	/**
	 * @param codigo
	 * @param piso
	 * @param venta
	 */
	public MaquinaRegistradora(int codigo, int piso, List<Venta> venta) {
		super();
		this.codigo = codigo;
		this.piso = piso;
		this.venta = venta;
	}

	// Setters y Getters
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
	 * @return the piso
	 */
	public int getPiso() {
		return piso;
	}

	/**
	 * @param piso the piso to set
	 */
	public void setPiso(int piso) {
		this.piso = piso;
	}

	/**
	 * @return the venta
	 */
	@JsonIgnore
	public List<Venta> getVenta() {
		return venta;
	}

	/**
	 * @param venta the venta to set
	 */
	public void setVenta(List<Venta> venta) {
		this.venta = venta;
	}

}
