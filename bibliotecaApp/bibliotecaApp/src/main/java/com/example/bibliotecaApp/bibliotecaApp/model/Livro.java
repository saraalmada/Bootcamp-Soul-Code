package com.example.bibliotecaApp.bibliotecaApp.model;

import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
@Table(name = "livros")

public class Livro {
	
	public Livro(Integer id, String titulo, LocalDate data_publicacao, Integer codAutor) {
		this.id = id;
		this.titulo = titulo;
		this.data_publicacao = data_publicacao;
		this.codAutor = codAutor;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "titulo", nullable = false, length = 100)
	private String titulo;
	
	@Column(name = "data_publicacao")
	private LocalDate data_publicacao;
	
	@Column(name = "codigo_autor")
	private Integer codAutor;

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

	public Integer getCodAutor() {
		return codAutor;
	}

	public void setCodAutor(Integer codAutor) {
		this.codAutor = codAutor;
	}
	
}