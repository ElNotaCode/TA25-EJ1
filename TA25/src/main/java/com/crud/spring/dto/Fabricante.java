package com.crud.spring.dto;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "fabricantes")
public class Fabricante {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)//busca ultimo valor e incrementa desde id final de db
	private Long codigo_fabricante;
	@Column(name = "nombre")
	private String nombre;
	
	@OneToMany
	@JoinColumn(name="codigo_articulo")
	private List<Articulo> articulo;
	
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

	@JsonIgnore
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "Articulo")
	public List<Articulo> getArticulo() {
		return articulo;
	}

	public void setArticulo(List<Articulo> articulo) {
		this.articulo = articulo;
	}

	@Override
	public String toString() {
		return "Fabricante [codigo_fabricante=" + codigo_fabricante + ", nombre=" + nombre + ", articulo=" + articulo
				+ "]";
	}
	
}
