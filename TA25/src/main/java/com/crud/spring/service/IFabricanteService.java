package com.crud.spring.service;

import java.util.List;

import com.crud.spring.dto.Fabricante;

public interface IFabricanteService {

	//Metodos CRUD
	public List<Fabricante> listarFabricantes(); //Listar todos
	
	public Fabricante guardarFabricante(Fabricante fabricante); //CREATE
	
	public Fabricante readFabricante(Long codigo_fabricante); //READ
	
	public Fabricante actualizarFabricante(Fabricante fabricante); //UPDATE
	
	public void eliminarFabricante(Long codigo_fabricante);//DELETE
	
}
