package com.generation.farmaciaturma71.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;


@Entity
@Table (name = "tb_categoria")
public class Categoria {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank (message = " A tarja do medicamento é obrigatório! ")
	@Size(min = 3, max = 20, message = "A tarja do medicamento deve conter no mínimo 03 caracteres e no máximo 20 caracteres!")
	private String tarja;
	
	@NotBlank (message = "O laboratorio fabricante do medicamento é obrigatória! ")
	@Size(min = 05, max = 100, message = "Adicione o laboratorio do produto que deve conter no mínimo 05 caracteres e no máximo 100 caracteres!")
	private String laboratorio;
	
	
	@NotBlank (message = "A dosagem do medicamento é obrigatória! ")
	@Size(min = 05, max = 20, message = "Adicione a dosagem do produto que deve conter no mínimo 05 caracteres e no máximo 20 caracteres!")
	private String  dosagem; 
	
	@Size (min = 05, max = 100, message = "Adicione o setor do produto que deve conter no mínimo 05 caracteres e no máximo 100 caracteres!")
	private String setor;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "categoria", cascade = CascadeType.REMOVE)
    @JsonIgnoreProperties("categoria")
    private List<Produto> produto;
	

	public List<Produto> getProduto() {
		return produto;
	}

	public void setProduto(List<Produto> produto) {
		this.produto = produto;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTarja() {
		return tarja;
	}

	public void setTarja(String tarja) {
		this.tarja = tarja;
	}

	public String getLaboratorio() {
		return laboratorio;
	}

	public void setLaboratorio(String laboratorio) {
		this.laboratorio = laboratorio;
	}

	public String getDosagem() {
		return dosagem;
	}

	public void setDosagem(String dosagem) {
		this.dosagem = dosagem;
	}

	public String getSetor() {
		return setor;
	}

	public void setSetor(String setor) {
		this.setor = setor;
	}
	
	
}
