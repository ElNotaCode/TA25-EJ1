package service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import dao.IArticuloDAO;
import dto.Articulo;

public class ArticulosServiceImpl implements IArticuloService{

	@Autowired
	IArticuloDAO iArticuloDAO;
	
	@Override
	public List<Articulo> listarArticulos() {
		return iArticuloDAO.findAll();
	}

	@Override
	public Articulo guardarArticulo(Articulo articulo) {
		return iArticuloDAO.save(articulo);
	}

	@Override
	public Articulo readArticulo(Long codigo_articulo) {
		return iArticuloDAO.findById(codigo_articulo).get();
	}

	@Override
	public Articulo actualizarArticulo(Articulo articulo) {
		return iArticuloDAO.save(articulo);
	}

	@Override
	public void eliminarArticulo(Long codigo_articulo) {
		iArticuloDAO.deleteById(codigo_articulo);
	}

}
