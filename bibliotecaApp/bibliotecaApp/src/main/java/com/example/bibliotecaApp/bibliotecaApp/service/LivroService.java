package com.example.bibliotecaApp.bibliotecaApp.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bibliotecaApp.bibliotecaApp.model.Livro;
import com.example.bibliotecaApp.bibliotecaApp.repository.LivroRepo;

import jakarta.transaction.Transactional;

@Service
public class LivroService {
	
	@Autowired
	private LivroRepo repository;
	
	@Transactional
	public Livro salvar(Livro livro) {
		return repository.save(livro);
	}
	
	public Optional<Livro> buscarPorId(Integer id) {
		return repository.findById(id);
	}
	
	public List<Livro> listarTodos() {
		return repository.findAll();
	}
	
	public void deletar(Integer id) {
		repository.deleteById(id);
	}
}