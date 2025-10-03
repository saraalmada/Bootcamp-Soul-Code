package com.example.bibliotecaApp.bibliotecaApp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bibliotecaApp.bibliotecaApp.model.Livro;
import com.example.bibliotecaApp.bibliotecaApp.service.LivroService;

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
	
	@PostMapping("/addLivro")
	public Livro salvar(@RequestBody Livro livro) {
		System.out.println("Livro: " + livro);
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
