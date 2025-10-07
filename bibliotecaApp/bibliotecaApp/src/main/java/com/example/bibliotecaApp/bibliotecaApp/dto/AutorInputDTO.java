package com.example.bibliotecaApp.bibliotecaApp.dto;

import java.time.LocalDate;

import jakarta.validation.constraints.*;

public class AutorInputDTO {

	@NotBlank(message = "É obrigatório um nome e não pode ter só espaços")
	@Size(min = 3, message = "Deve ter no mínimo 3 caracteres")
	private String nome;

	@NotNull(message = "Campo invalido")
	@Past(message = "Não permitimos autores do futuro!")
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
