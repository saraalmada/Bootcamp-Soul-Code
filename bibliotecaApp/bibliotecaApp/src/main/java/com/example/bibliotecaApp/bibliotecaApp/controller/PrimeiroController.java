package com.example.bibliotecaApp.bibliotecaApp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {
	
	@RequestMapping("/ola" )
	public String ola() {
		return "Ola Spring Boot";
	}
	
}
