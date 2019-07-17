package edu.pe.unsch.entities;
// Generated 16/07/2019 11:31:21 PM by Hibernate Tools 5.1.10.Final

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Imagen generated by hbm2java
 */
@Entity
@Table(name = "imagen", catalog = "ecommerceremate")
public class Imagen implements java.io.Serializable {

	private Integer id;
	private Producto producto;
	private String nombre;
	private Integer prioridad;

	public Imagen() {
	}

	public Imagen(Producto producto, String nombre, Integer prioridad) {
		this.producto = producto;
		this.nombre = nombre;
		this.prioridad = prioridad;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)

	@Column(name = "id", unique = true, nullable = false)
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "idproducto")
	public Producto getProducto() {
		return this.producto;
	}

	public void setProducto(Producto producto) {
		this.producto = producto;
	}

	@Column(name = "nombre", length = 80)
	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "prioridad")
	public Integer getPrioridad() {
		return this.prioridad;
	}

	public void setPrioridad(Integer prioridad) {
		this.prioridad = prioridad;
	}

}
