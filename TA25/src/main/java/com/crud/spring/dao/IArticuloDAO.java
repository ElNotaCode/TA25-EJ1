package com.crud.spring.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud.spring.dto.Articulo;

public interface IArticuloDAO extends JpaRepository<Articulo, Long>{

}
