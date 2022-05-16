package com.crud.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.spring.dto.Fabricante;
import com.crud.spring.service.FabricantesServiceImpl;
import com.crud.spring.service.IFabricanteService;

@RestController
@RequestMapping("/api")
public class FabricanteController {
	
	@Autowired
	FabricantesServiceImpl fabricanteServiceImpl;
	
	//Listar
	@GetMapping("/fabricantes")
	public  List<Fabricante> listarFabricantes(){
		return fabricanteServiceImpl.listarFabricantes();
	}
	
	//Create
	@PostMapping("/fabricantes")
	public Fabricante guardarFabricante(@RequestBody Fabricante fabricante) {
		return fabricanteServiceImpl.guardarFabricante(fabricante);
	}
	
	//Read
	@GetMapping("/fabricantes/{codigo_fabricante}")
	public  Fabricante readFabricantes(@PathVariable(name = "codigo_fabricante") Long codigo_fabricante){
		return fabricanteServiceImpl.readFabricante(codigo_fabricante);
	}
	
	//Update
	@PutMapping("/fabricantes/{codigo_fabricante}")
	public Fabricante actualizarFabricante(@PathVariable(name = "codigo_fabricante") Long codigo_fabricante,@RequestBody Fabricante fabricante) {
		
		Fabricante fabricante_seleccionado = new Fabricante();
		Fabricante fabricante_actualizado = new Fabricante();
		
		fabricante_seleccionado = fabricanteServiceImpl.readFabricante(codigo_fabricante);
		
		fabricante_seleccionado.setNombre(fabricante.getNombre());
		
		fabricante_actualizado = fabricanteServiceImpl.actualizarFabricante(fabricante_seleccionado);
		
		return fabricante_actualizado;
		
	}

	//Delete
	@DeleteMapping("/fabricantes/{codigo_fabricante}")
	public void eliminarFabricante(@PathVariable(name = "codigo_fabricante") Long codigo_fabricante) {
		fabricanteServiceImpl.eliminarFabricante(codigo_fabricante);
	}
	
}
