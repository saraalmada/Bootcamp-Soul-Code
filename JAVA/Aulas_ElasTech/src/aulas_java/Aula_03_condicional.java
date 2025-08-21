package aulas_java;

import java.util.Scanner;

public class Aula_03_condicional {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		// Aprovação do Aluno
		System.out.print("Digite a nota: ");
		double nota = leitor.nextDouble();
		
		if (nota >= 7) {
			System.out.println("Aprovado!");
		} else {
			System.out.println("Reprovado!");
		}
		
		
		//Positivo, Negativo ou Zero
		System.out.print("Digite um número: ");
		int numero = leitor.nextInt();
		
		if (numero > 0) {
			System.out.println(numero + " é um número positivo.");
		} else if (numero == 0) {
			System.out.println("Número zero.");
		} else {
			System.out.println(numero + " é um número negativo");
		}
		
		
		//Calculadora de Desconto
		double compra = 190.00;
		
		if (compra >= 200) {
			double desconto = 0.15;
			double compraComDesconto = compra - (compra * desconto);
			System.out.println("Você ganhou " + (desconto * 100) + "% de desconto na sua compra! \nO valor final da sua compra é: R$" + compraComDesconto);
		} else {
			System.out.println("O valor final da sua compra é: R$" + compra);
		}
		
		
		//Categoria por Idade
		System.out.print("Digite sua idade: ");
		int idade = leitor.nextInt();
		
		if (idade <= 0) {
			System.out.println("Idade inválida.");
		} else if(idade <= 12) {
			System.out.println("Criança");
		} else if (idade <= 17) {
			System.out.println("Adolescente");
		} else if (idade <= 59) {
			System.out.println("Adulto");
		} else {
			System.out.println("Idoso");
		}
		
		
		//Login Simples
		String usuarioCorreto = "admin";
		String senhaCorreta   = "java123";
		
		System.out.print("Usuário: ");
		String usuarioDigitado = leitor.next();
		
		System.out.print("Senha: ");
		String senhaDigitada = leitor.next();
		
		if ((senhaCorreta.equals(senhaDigitada)) && (usuarioCorreto.equals(usuarioDigitado))) {
			System.out.println("Login bem-sucedido!");
		} else {
			System.out.println("Usuário ou senha inválidos.");
		}
		
		
		leitor.close();

	}

}
