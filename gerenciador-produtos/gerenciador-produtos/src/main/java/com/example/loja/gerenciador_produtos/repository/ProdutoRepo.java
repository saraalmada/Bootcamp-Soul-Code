package com.example.loja.gerenciador_produtos.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.loja.gerenciador_produtos.model.Produto;

public interface ProdutoRepo extends JpaRepository<Produto, Integer> {
	
}
