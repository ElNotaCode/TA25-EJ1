package com.crud.spring.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.crud.spring.dao.IFabricanteDAO;
import com.crud.spring.dto.Fabricante;

public class FabricantesServiceImpl implements IFabricanteService {

	@Autowired
	IFabricanteDAO iFabricanteDAO;
	
	@Override
	public List<Fabricante> listarFabricantes() {
		return iFabricanteDAO.findAll();
	}

	@Override
	public Fabricante guardarFabricante(Fabricante fabricante) {
		return iFabricanteDAO.save(fabricante);
	}

	@Override
	public Fabricante readFabricante(Long codigo_fabricante) {
		return iFabricanteDAO.findById(codigo_fabricante).get();
	}

	@Override
	public Fabricante actualizarFabricante(Fabricante fabricante) {
		return iFabricanteDAO.save(fabricante);
	}

	@Override
	public void eliminarFabricante(Long codigo_fabricante) {
		iFabricanteDAO.deleteById(codigo_fabricante);
	}

}
