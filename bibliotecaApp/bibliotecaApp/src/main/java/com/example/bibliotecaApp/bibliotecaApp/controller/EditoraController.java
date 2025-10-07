package com.example.bibliotecaApp.bibliotecaApp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.bibliotecaApp.bibliotecaApp.dto.EditoraInputDTO;
import com.example.bibliotecaApp.bibliotecaApp.model.Editora;
import com.example.bibliotecaApp.bibliotecaApp.service.EditoraService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/editoras")
public class EditoraController {
	
	@Autowired
	private EditoraService editoraService;
	
	@GetMapping("/{id}")
	public Optional<Editora> buscarPorId(@PathVariable("id") Integer id) {
		return editoraService.buscarPorId(id);
	}
	
	@GetMapping()
	public List<Editora> listarTodos() {
		return editoraService.listarTodos();
	}
	
	@PostMapping("/editoras")
	public Editora salvar(@Valid @RequestBody EditoraInputDTO editoraInputDTO) {
		Editora editora = new Editora();
		editora.setNome(editoraInputDTO.getNome());
		editora.setEmail_contato(editoraInputDTO.getEmail_contato());
		editora.setCnpj(editoraInputDTO.getCnpj());
		System.out.println("Editora: " + editoraInputDTO);
		editoraService.salvar(editora);
		return editora;
	}
	
	@DeleteMapping("/{id}")
	public void deletar(@PathVariable("id") Integer id) {
		editoraService.deletar(id);
	}

	@PutMapping("/{id}")
	public void atualizar(@PathVariable("id") Integer id, @RequestBody Editora editora) {
		editora.setId(id);
		editoraService.salvar(editora);
	}
}
