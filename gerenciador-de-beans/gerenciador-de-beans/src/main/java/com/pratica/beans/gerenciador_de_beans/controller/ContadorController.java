package com.pratica.beans.gerenciador_de_beans.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pratica.beans.gerenciador_de_beans.service.ContadorService;

@RestController
public class ContadorController {

	@Autowired
	private final ContadorService contadorService;
	
	public ContadorController(ContadorService contadorService) {
		this.contadorService = contadorService;
	}
	
	@GetMapping("/contador")
	public int incrementar() {
		return contadorService.incrementar();
	}

}
