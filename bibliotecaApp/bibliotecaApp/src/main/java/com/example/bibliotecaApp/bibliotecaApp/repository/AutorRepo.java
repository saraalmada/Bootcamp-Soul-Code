package com.example.bibliotecaApp.bibliotecaApp.repository;

import com.example.bibliotecaApp.bibliotecaApp.model.*;

import java.util.*;

import org.springframework.data.jpa.repository.JpaRepository;


public interface AutorRepo extends JpaRepository<Autor, Integer>{
	
	Optional<Autor> findById(Integer id);
	List<Autor> findByAutor(Integer id);

}