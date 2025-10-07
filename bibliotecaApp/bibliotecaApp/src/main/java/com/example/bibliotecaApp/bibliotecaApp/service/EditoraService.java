package com.example.bibliotecaApp.bibliotecaApp.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bibliotecaApp.bibliotecaApp.model.Editora;
import com.example.bibliotecaApp.bibliotecaApp.repository.EditoraRepo;

import jakarta.transaction.Transactional;

@Service
public class EditoraService {
	
	@Autowired
	private EditoraRepo repository;
	
	@Transactional
	public Editora salvar(Editora editora) {
		return repository.save(editora);
	}
	
	public Optional<Editora> buscarPorId(Integer id){
		return repository.findById(id);
	}
	
	public List<Editora> listarTodos(){
		return repository.findAll();
	}
	
	public void deletar(Integer id) {
		repository.deleteById(id);
	}
}