package com.example.loja.gerenciador_produtos.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Produto")
public class Produto {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    
    @Column
	private String nome;
    
    @Column
    private Double preco;

    @Column
    private Integer quantidade_estoque;

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

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public Integer getQuantidadeEstoque() {
		return quantidade_estoque;
	}

	public void setQuantidadeEstoque(Integer quantidade_estoque) {
		this.quantidade_estoque = quantidade_estoque;
	}

	@Override
	public String toString() {
		return "Produto [id=" + id + ", nome=" + nome + ", qtde=" + quantidade_estoque + ", preco=" + preco + "]";
	}
    
    
}