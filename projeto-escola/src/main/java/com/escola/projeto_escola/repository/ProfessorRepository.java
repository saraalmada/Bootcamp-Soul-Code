package com.escola.projeto_escola.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.escola.projeto_escola.model.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {

}
