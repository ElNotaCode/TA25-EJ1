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

import com.crud.spring.dto.Articulo;
import com.crud.spring.service.ArticulosServiceImpl;

@RestController
@RequestMapping("/api")
public class ArticuloController {
	
	@Autowired
	ArticulosServiceImpl articulosServiceImpl;
	
	//Listar
	@GetMapping("/articulos")
	public List<Articulo> listarArticulos(){
		return articulosServiceImpl.listarArticulos();
	}
	
	//Create
	@PostMapping("/articulos")
	public Articulo guardarArticulo(@RequestBody Articulo articulo) {
		return articulosServiceImpl.guardarArticulo(articulo);
	}
	
	//Read
	@GetMapping("/articulos/{codigo_articulo}")
	public Articulo readArticulo(@PathVariable(name="codigo_articulo") Long codigo_articulo) {
		return articulosServiceImpl.readArticulo(codigo_articulo);
	}
	
	//Update
	@PutMapping("/articulos/{codigo_articulo}")
	public Articulo actualizarFabricante(@PathVariable(name = "codigo_articulo") Long codigo_articulo,@RequestBody Articulo articulo) {
		
		Articulo articulo_seleccionado = new Articulo();
		Articulo articulo_actualizado = new Articulo();
		
		articulo_seleccionado.setNombre(articulo.getNombre());
		articulo_seleccionado.setPrecio(articulo.getPrecio());
		articulo_seleccionado.setFabricante(articulo.getFabricante());
		
		articulo_actualizado = articulosServiceImpl.actualizarArticulo(articulo_seleccionado);
		
		return articulo_actualizado;
	}
	
	//Delete
	@DeleteMapping("/articulos/{codigo_articulo}")
	public void eliminarArticulo(@PathVariable(name="codigo_articulo") Long codigo_articulo) {
		articulosServiceImpl.eliminarArticulo(codigo_articulo);
	}

}
