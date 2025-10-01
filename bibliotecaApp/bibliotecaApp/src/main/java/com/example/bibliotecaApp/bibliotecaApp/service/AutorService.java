package com.example.bibliotecaApp.bibliotecaApp.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bibliotecaApp.bibliotecaApp.model.Autor;
import com.example.bibliotecaApp.bibliotecaApp.repository.AutorRepo;

import jakarta.transaction.Transactional;

@Service
public class AutorService {
	@Autowired
	private AutorRepo repository;
	
	@Transactional
	public Autor salvar(Autor autor) {
		return repository.save(autor);
	}
	
	public Optional<Autor> buscarPorId(Integer id){
		return repository.findById(id);
	}
	
	public List<Autor> listarTodos(){
		return repository.findAll();
	}
	
	public void deletar(Integer id) {
		repository.deleteById(id);
	}
}