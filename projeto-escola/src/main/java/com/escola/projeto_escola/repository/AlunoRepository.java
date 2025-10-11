package com.escola.projeto_escola.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.escola.projeto_escola.model.Aluno;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {

}
