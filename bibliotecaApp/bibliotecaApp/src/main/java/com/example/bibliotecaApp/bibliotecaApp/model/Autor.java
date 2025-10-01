package com.example.bibliotecaApp.bibliotecaApp.model;

import java.time.LocalDate;

import jakarta.persistence.*;

@Entity
@Table(name = "autores")
public class Autor {

	public Autor(Integer id, String nome, LocalDate dataNasc) {
		this.id = id;
		this.nome = nome;
		this.dataNasc = dataNasc;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(name = "nome", nullable = false, length = 100)
	private String nome;

	@Column(name = "data_nasc", nullable = false)
	private LocalDate dataNasc;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public LocalDate getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(LocalDate dataNasc) {
		this.dataNasc = dataNasc;
	}

}