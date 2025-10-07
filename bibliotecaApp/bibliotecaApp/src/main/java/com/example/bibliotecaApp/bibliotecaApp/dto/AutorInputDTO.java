package com.example.bibliotecaApp.bibliotecaApp.dto;

import java.time.LocalDate;

import jakarta.validation.constraints.*;

public class AutorInputDTO {

	@NotEmpty
	@NotNull(message = "Não pode ter o nome nulo")
	private String nome;

	@NotNull(message = "Campo invalido")
	@Past(message = "Data deve ser no passado.")
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
