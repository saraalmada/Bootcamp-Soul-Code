package com.example.bibliotecaApp.bibliotecaApp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.bibliotecaApp.bibliotecaApp.dto.LivroInputDTO;
import com.example.bibliotecaApp.bibliotecaApp.model.Livro;
import com.example.bibliotecaApp.bibliotecaApp.service.LivroService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/livros")
public class LivroController {
	
	@Autowired
	private LivroService livroService;
	
	@GetMapping("/{id}")
	public Optional<Livro> buscarPorId(@PathVariable("id") Integer id) {
		return livroService.buscarPorId(id);
	}
	
	@GetMapping()
	public List<Livro> listarTodos() {
		return livroService.listarTodos();
	}
	
	@PostMapping("/livros")
	public Livro salvar(@Valid @RequestBody LivroInputDTO livroInputDTO) {
		Livro livro = new Livro();
		livro.setTitulo(livroInputDTO.getTitulo());
		livro.setData_publicacao(livroInputDTO.getData_publicacao());
		livro.setIsbn(livroInputDTO.getIsbn());
		livro.setNumero_paginas(livroInputDTO.getNumero_paginas());
		livro.setPreco(livroInputDTO.getPreco());
		System.out.println("Livro: " + livroInputDTO);
		livroService.salvar(livro);
		return livro;
	}
	
	@DeleteMapping("/{id}")
	public void deletar(@PathVariable("id") Integer id) {
		livroService.deletar(id);
	}

	@PutMapping("/{id}")
	public void atualizar(@PathVariable("id") Integer id, @RequestBody Livro livro) {
		livro.setId(id);
		livroService.salvar(livro);
	}
}
