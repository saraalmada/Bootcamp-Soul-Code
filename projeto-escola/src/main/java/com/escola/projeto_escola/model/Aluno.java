package com.escola.projeto_escola.model;

import jakarta.persistence.*;

@Entity
@Table(name = "alunos")
public class Aluno {
	
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false)
    private String nome;
    
    @Column(unique = true, nullable = false)
    private String matricula;
    
    public Aluno() {}
    
	public Aluno(Long id, String nome, String matricula) {
		this.id = id;
		this.nome = nome;
		this.matricula = matricula;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
    
    
}
