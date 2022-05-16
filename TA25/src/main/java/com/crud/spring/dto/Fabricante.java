package com.crud.spring.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "fabricantes")
public class Fabricante {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private Long codigo_fabricante;
	@Column(name = "nombre")
	private String nombre;
	
	public Fabricante() {

	}
	
	public Fabricante(Long codigo_fabricante, String nombre) {
		this.codigo_fabricante = codigo_fabricante;
		this.nombre = nombre;
	}
	
	public Long getCodigo_fabricante() {
		return codigo_fabricante;
	}
	
	public void setCodigo_fabricante(Long codigo_fabricante) {
		this.codigo_fabricante = codigo_fabricante;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Override
	public String toString() {
		return "Fabricante [codigo_fabricante=" + codigo_fabricante + ", nombre=" + nombre + "]";
	}
	
}
