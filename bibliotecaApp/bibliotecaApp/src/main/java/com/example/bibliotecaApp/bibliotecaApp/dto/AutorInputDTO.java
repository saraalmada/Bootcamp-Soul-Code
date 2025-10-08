package com.example.bibliotecaApp.bibliotecaApp.dto;

import java.time.LocalDate;

import jakarta.validation.constraints.*;

public class AutorInputDTO {

	@NotBlank(message = "Nome é obrigatório, não pode conter apenas espaços")
	@Size(min = 3, message = "O nome deve ter no mínimo 3 caracteres")
	private String nome;

	@NotNull(message = "A data é obrigatória")
	@Past(message = "A data deve estar no passado!")
	private LocalDate dataNasc;

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
