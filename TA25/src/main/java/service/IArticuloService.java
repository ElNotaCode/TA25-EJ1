package service;

import java.util.List;

import dto.Articulo;

public interface IArticuloService {

	//Metodos Crud
	//Metodos CRUD
	public List<Articulo> listarArticulos(); //Listar todos
	
	public Articulo guardarArticulo(Articulo articulo); //CREATE
	
	public Articulo readArticulo(Long codigo_articulo); //READ
	
	public Articulo actualizarArticulo(Articulo articulo); //UPDATE
	
	public void eliminarArticulo(Long codigo_articulo);//DELETE
	
	
}
