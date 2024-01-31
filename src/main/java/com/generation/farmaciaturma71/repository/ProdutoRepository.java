package com.generation.farmaciaturma71.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.generation.farmaciaturma71.model.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
	public List <Produto> findAllByNomeContainingIgnoreCase(@Param("nome") String nome);
	public List <Produto> findAllByPreco(@Param("preco") BigDecimal preco);
	public List <Produto> findAllByMaterial(@Param("material") String material);
	
	

}