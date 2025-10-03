package com.example.bibliotecaApp.bibliotecaApp.model;

import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
@Table(name = "livros")
public class Livro {
	
	public Livro() {};
	
	public Livro(Integer id, String titulo, LocalDate data_publicacao, Integer codigo_autor) {		
		this.id = id;
		this.titulo = titulo;
		this.data_publicacao = data_publicacao;
		this.codigo_autor = codigo_autor;
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


}