package com.example.loja.gerenciador_produtos.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.loja.gerenciador_produtos.model.Produto;
import com.example.loja.gerenciador_produtos.repository.ProdutoRepo;
import com.example.loja.gerenciador_produtos.service.ProdutoService;

import jakarta.websocket.server.PathParam;


@RestController
@RequestMapping("produtos")
public class ProdutoController {
	
	private ProdutoRepo produtorepo;
	
	public ProdutoController(ProdutoRepo produtorepo) {
		this.produtorepo = produtorepo;
	}
	
	@PostMapping
	public Produto salvar(@RequestBody Produto produto) {
		System.out.println("Produto: " + produto );
		var id = UUID.randomUUID().toString();
		produto.setId(null);
		produtorepo.save(produto);
		
		return produto;
	}
	
	@Autowired //Indica que preciso fazer uma DI
	private ProdutoService produtoService;
	
	@GetMapping
	public List<Produto> listarTodos() {
		return produtorepo.findAll();
	}
	
	@GetMapping("/{id}")
	public Produto obterPorId(@PathVariable("id") Integer id) {
		return produtorepo.findById(id).orElse(null);
	}
	

	

}