package com.pratica.beans.gerenciador_de_beans.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.pratica.beans.gerenciador_de_beans.service.CalculadoraService;

@RestController
public class CalculadoraController {
	
	@Autowired
	private final CalculadoraService calculadoraService;
	
	public CalculadoraController(CalculadoraService calculadoraService) {
        this.calculadoraService = calculadoraService;
    }
	
	@GetMapping("/somar/{a}/{b}")
	public int somar(@PathVariable int a, @PathVariable int b) {
		return calculadoraService.somar(a, b);
	}
	
}
