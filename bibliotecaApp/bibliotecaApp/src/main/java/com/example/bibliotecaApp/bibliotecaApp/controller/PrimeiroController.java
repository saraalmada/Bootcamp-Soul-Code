package com.example.bibliotecaApp.bibliotecaApp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.bibliotecaApp.bibliotecaApp.dto.AutorInputDTO;
import com.example.bibliotecaApp.bibliotecaApp.model.Autor;
import com.example.bibliotecaApp.bibliotecaApp.service.AutorService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/autores")
public class PrimeiroController {
	
	@Autowired
	private AutorService autorService;
	
	@GetMapping("/{id}")
	public Optional<Autor> buscarPorId(@PathVariable("id") Integer id) {
		return autorService.buscarPorId(id);
	}
	
	@GetMapping()
	public List<Autor> listarTodos() {
		return autorService.listarTodos();
	}
	
	@PostMapping("/addautores")
	public Autor salvar(@Valid @RequestBody AutorInputDTO autorInputDTO) {
		Autor autor = new Autor();
		autor.setNome(autorInputDTO.getNome());
		autor.setDataNasc(autorInputDTO.getDataNasc());
		System.out.println("Autor: " + autorInputDTO);
		autorService.salvar(autor);
		return autor;
	}
	
	@DeleteMapping("/{id}")
	public void deletar(@PathVariable("id") Integer id) {
		autorService.deletar(id);
	}

	
	@PutMapping("/{id}")
	public void atualizar(@Valid @PathVariable("id") Integer id, @Valid @RequestBody Autor autor) {
		autor.setId(id);
		autorService.salvar(autor);
	}
	
	
}
