package com.crud.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.spring.dto.Fabricante;

public interface IFabricanteDAO extends JpaRepository<Fabricante, Long>{

}
