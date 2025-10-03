package com.example.loja.gerenciador_produtos.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.loja.gerenciador_produtos.model.Produto;
import com.example.loja.gerenciador_produtos.repository.ProdutoRepo;

import jakarta.transaction.Transactional;

@Service
public class ProdutoService {
	
	@Autowired
	private ProdutoRepo repository;
	
	@Transactional
	public Produto salvar(Produto produto) {
		return repository.save(produto);
	}
	
	public Optional<Produto> buscarPorId(Integer id){
		return repository.findById(id);
	}
	
	public List<Produto> listarTodos(){
		return repository.findAll();
	}
	
	public void deletar(Integer id) {
		repository.deleteById(id);
	}
}