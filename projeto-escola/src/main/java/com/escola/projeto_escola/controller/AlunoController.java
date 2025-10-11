package com.escola.projeto_escola.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.escola.projeto_escola.model.Aluno;
import com.escola.projeto_escola.repository.AlunoRepository;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    private final AlunoRepository repo;
    
    public AlunoController(AlunoRepository repo) { this.repo = repo; }

    @GetMapping
    public List<Aluno> listar() { return repo.findAll(); }

    @PostMapping
    public ResponseEntity<Aluno> criar(@RequestBody Aluno a) {
        return ResponseEntity.status(201).body(repo.save(a));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deletar(@PathVariable Long id) {
        repo.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
