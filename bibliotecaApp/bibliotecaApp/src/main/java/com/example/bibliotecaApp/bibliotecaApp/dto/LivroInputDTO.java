package com.example.bibliotecaApp.bibliotecaApp.dto;

import java.time.LocalDate;

import jakarta.validation.constraints.*;

public class LivroInputDTO {
	
	@NotBlank(message = "É obrigatório um título, não pode ter só espaços")
	@Size(min = 5, max = 100, message = "Deve ter no mínimo 5 caracteres e no máximo 100")
	private String titulo;
	
	@NotNull(message = "Campo obrigatório")
	@Past(message = "Não permitimos autores do futuro!")
	private LocalDate data_publicacao;
	
	@NotBlank
	@Pattern(regexp = "^\\d{13}$", message = "O código deve conter exatamente 13 dígitos numéricos.")
	private String isbn;
	
	@NotNull(message = "Campo obrigatório")
	@Min(value = 10, message = "Número mínimo de páginas é 10")
	@Max(value = 100, message = "Número máximo de páginas é 100")
	private Integer numero_paginas;
	
	@NotNull(message = "Campo obrigatório")
	@DecimalMin(value = "20.00")
	private Double preco;

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
