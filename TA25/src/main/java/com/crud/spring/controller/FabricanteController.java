package com.crud.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud.spring.dto.Fabricante;
import com.crud.spring.service.FabricantesServiceImpl;

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
	
	//Read
	
	//Update

	//Delete
	
}
