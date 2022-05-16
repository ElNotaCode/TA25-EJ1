package dao;

import org.springframework.data.jpa.repository.JpaRepository;

import dto.Articulo;

public interface ArticuloDao extends JpaRepository<Articulo, Long>{

}
