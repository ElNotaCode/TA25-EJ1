package com.crud.spring.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "articulos")
public class Articulo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private Long codigo_articulo;
	@Column(name = "nombre")
	private String nombre;
	@Column(name = "precio")
	private int precio;
	
	@ManyToOne
	@JoinColumn(name="codigo_fabricante")
	private Fabricante fabricante;
	
	public Articulo() {

	}

	public Articulo(Long codigo_articulo, String nombre, int precio, Fabricante fabricante) {
		//super();
		this.codigo_articulo = codigo_articulo;
		this.nombre = nombre;
		this.precio = precio;
		this.fabricante = fabricante;
	}

	public Long getCodigo_articulo() {
		return codigo_articulo;
	}

	public void setCodigo_articulo(Long codigo_articulo) {
		this.codigo_articulo = codigo_articulo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getPrecio() {
		return precio;
	}

	public void setPrecio(int precio) {
		this.precio = precio;
	}

	public Fabricante getFabricante() {
		return fabricante;
	}

	public void setFabricante(Fabricante fabricante) {
		this.fabricante = fabricante;
	}

	@Override
	public String toString() {
		return "Articulo [codigo_articulo=" + codigo_articulo + ", nombre=" + nombre + ", precio=" + precio
				+ ", fabricante=" + fabricante + "]";
	}
	
}
