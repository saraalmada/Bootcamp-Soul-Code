package com.pratica.beans.gerenciador_de_beans.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TarefasController {

	private List<String> tarefas;
	
	public TarefasController(List<String> tarefas) {
		this.tarefas = tarefas;
	}
	
	@GetMapping("/tarefas")
	public List<String> tarefasIniciais() {
		return tarefas;
	}
	
}
