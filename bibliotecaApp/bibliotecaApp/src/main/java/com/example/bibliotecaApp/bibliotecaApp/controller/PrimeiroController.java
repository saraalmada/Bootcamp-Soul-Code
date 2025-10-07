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

import com.example.bibliotecaApp.bibliotecaApp.model.Autor;
import com.example.bibliotecaApp.bibliotecaApp.service.AutorService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/autores")
public class PrimeiroController {
	
	@Autowired
	private AutorService autorService;
	
	@GetMapping("/{id}")
	public Optional<Autor> buscarPorId(@Valid @PathVariable("id") Integer id) {
		return autorService.buscarPorId(id);
	}
	
	@GetMapping()
	public List<Autor> listarTodos() {
		return autorService.listarTodos();
	}
	
	@PostMapping("/addAutor")
	public Autor salvar(@Valid @RequestBody Autor autor) {
		System.out.println("Autor: " + autor);
		autorService.salvar(autor);
		return autor;
	}
	
	@DeleteMapping("/{id}")
	public void deletar(@Valid @PathVariable("id") Integer id) {
		autorService.deletar(id);
	}

	
	@PutMapping("/{id}")
	public void atualizar(@Valid @PathVariable("id") Integer id, @Valid @RequestBody Autor autor) {
		autor.setId(id);
		autorService.salvar(autor);
	}
	
	
}
