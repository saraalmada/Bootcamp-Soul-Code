package com.example.bibliotecaApp.bibliotecaApp.model;

import jakarta.persistence.*;

@Entity
@Table(name = "editoras")
public class Editora {

	public Editora() {}

	public Editora(Integer id, String nome, String email_contato, String cnpj) {
		this.id = id;
		this.nome = nome;
		this.email_contato = email_contato;
		this.cnpj = cnpj;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name = "nome", nullable = false)
	private String nome;
	
	@Column(name = "email_contato", nullable = false)
	private String email_contato;
	
	@Column(name = "cnpj", nullable = false)
	private String cnpj;

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

	public String getEmail_contato() {
		return email_contato;
	}

	public void setEmail_contato(String email_contato) {
		this.email_contato = email_contato;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
	
	
}
