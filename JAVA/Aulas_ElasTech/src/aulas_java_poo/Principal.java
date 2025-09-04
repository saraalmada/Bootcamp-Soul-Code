package aulas_java_poo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		// 1
//		Carro c1 = new Carro();
//		
//		c1.exibirInfo();
		
		// 2
//		Aluno a1 = new Aluno("Akira", 3);
//		Aluno a2 = new Aluno("Mayuka", 1);
//		
//		a1.exibirDados();
//		a2.exibirDados();
		
		// 3
//		Livro l1 = new Livro("O pequeno príncipe");
//		Livro l2 = new Livro("Vidas secas", "Graciliano Ramos");
//		
//		l1.exibirDados();
//		l2.exibirDados();
		
		// 4
//		Produto p1 = new Produto();
//		Produto p2 = new Produto("Protetor solar");
//		Produto p3 = new Produto("Hidratante facial", 89.90, 9);
//		
//		p1.exibirDados();
//		p2.exibirDados();
//		p3.exibirDados();
		
		// 5
//		Filme f1 = new Filme("O Castelo Animado", "Hayao Miyazaki", 2004);
//		
//		f1.mostrarDetalhes();
		
		// 6
		Scanner leitor = new Scanner(System.in);
		
		System.out.print("Digite o nome do aluno: ");
		String nome = leitor.next();		
		
		AlunoDesafio a1 = new AlunoDesafio(nome);
		
		a1.adicionarNota(1, 7.5);
		a1.adicionarNota(2, 6.0);
		a1.adicionarNota(3, 9.2);
		a1.adicionarNota(4, 5.8);
		
		a1.verificarStatus();
		
		System.out.print("Digite o nome do aluno: ");
		String nome2 = leitor.next();
		
		AlunoDesafio a2 = new AlunoDesafio(nome2);
		
		a2.adicionarNota(1, 6.7);
		a2.adicionarNota(2, 4.0);
		a2.adicionarNota(3, 9.2);
		a2.adicionarNota(4, 5.8);
		
		a2.verificarStatus();
		
		
		
	}

}
