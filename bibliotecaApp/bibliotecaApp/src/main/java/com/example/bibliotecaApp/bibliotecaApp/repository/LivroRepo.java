package com.example.bibliotecaApp.bibliotecaApp.repository;

import com.example.bibliotecaApp.bibliotecaApp.model.*;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepo extends JpaRepository<Livro, Integer> {
	
	
}