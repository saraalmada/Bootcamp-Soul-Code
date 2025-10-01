package com.example.bibliotecaApp.bibliotecaApp.repository;

import com.example.bibliotecaApp.bibliotecaApp.model.*;

import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LivroRepo extends JpaRepository<Livro, Integer> {
	
	Optional<Livro> findById(Integer id);
	List<Livro> findByLivro(Integer id);
	
}