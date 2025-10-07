package com.example.bibliotecaApp.bibliotecaApp.model;

import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
@Table(name = "livros")
public class Livro {
	
	public Livro() {};

	public Livro(Integer id, String titulo, LocalDate data_publicacao, Integer codigo_autor, String isbn,
			Integer numero_paginas, Double preco) {
		this.id = id;
		this.titulo = titulo;
		this.data_publicacao = data_publicacao;
		this.codigo_autor = codigo_autor;
		this.isbn = isbn;
		this.numero_paginas = numero_paginas;
		this.preco = preco;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "titulo", nullable = false)
	private String titulo;
	
	@Column(name = "data_publicacao", nullable = false)
	private LocalDate data_publicacao;
	
	@Column(name = "codigo_autor", nullable = false)
	private Integer codigo_autor;
	
	@Column(name = "isbn", nullable = false)
	private String isbn;
	
	@Column(name = "numero_paginas", nullable = false)
	private Integer numero_paginas;
	
	@Column(name = "preco", nullable = false)
	private Double preco;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public LocalDate getData_publicacao() {
		return data_publicacao;
	}

	public void setData_publicacao(LocalDate data_publicacao) {
		this.data_publicacao = data_publicacao;
	}

	public Integer getCodigo_autor() {
		return codigo_autor;
	}

	public void setCodigo_autor(Integer codigo_autor) {
		this.codigo_autor = codigo_autor;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public Integer getNumero_paginas() {
		return numero_paginas;
	}

	public void setNumero_paginas(Integer numero_paginas) {
		this.numero_paginas = numero_paginas;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}


}