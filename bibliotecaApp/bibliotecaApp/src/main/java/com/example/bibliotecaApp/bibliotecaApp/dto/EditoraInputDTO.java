package com.example.bibliotecaApp.bibliotecaApp.dto;

import jakarta.validation.constraints.*;

public class EditoraInputDTO {
	
	@NotBlank
	@Size(min=3, max=80)
	private String nome;
	
	@NotBlank
	@Email
	private String email_contato;
	
	@NotBlank(message = "O CNPJ é obrigatório")
	@Pattern(
		    regexp = "\\d{2}\\.\\d{3}\\.\\d{3}/\\d{4}-\\d{2}",
		    message = "Formato inválido. Use o formato: 00.000.000/0000-00")
	private String cnpj;

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
