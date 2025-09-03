package aulas_java_poo;

public class Aluno {
	String nome;
	int idade;
	
	public Aluno(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}
	
	public void exibirDados() {
		System.out.println("Aluno: " + this.nome + " | Idade: " + this.idade);
	}

}
