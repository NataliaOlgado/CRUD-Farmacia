package com.generation.farmaciaturma71.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.farmaciaturma71.model.Categoria;


public interface CategoriaRepository extends JpaRepository< Categoria, Long> {
	
	public List<Categoria> findAllByTarjaContainingIgnoreCase (@Param("Tarja")String tipo);

}
