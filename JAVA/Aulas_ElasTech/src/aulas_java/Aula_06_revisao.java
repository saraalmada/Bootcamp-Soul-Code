package aulas_java;

import java.util.Scanner;

public class Aula_06_revisao {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		// Exercício 1 – Declaração e uso de variáveis 
		String nome = "Sara";
		int idade = 26;
		double altura = 1.60;
		
		// Exercício 2 – Operações Aritméticas 
		System.out.println("Digite o primeiro número inteiro: ");
		int n1 = leitor.nextInt();
		
		System.out.println("Digite o segundo número inteiro: ");
		int n2 = leitor.nextInt();
		
		int soma = n1 + n2;
		int subtracao = n1 - n2;
		int multiplicacao = n1 * n2;
		int divisao = n1 / n2;
		
		System.out.println("Soma = " + soma + "; "
						+ "Subtração = " + subtracao + "; "
						+ "Multiplicação = " + multiplicacao + "; "
						+ "Divisão = " + divisao + ";");
		
		// Exercício 3 – Condicional IF/ELSE
		System.out.println("Digite sua idade: ");
		int suaIdade = leitor.nextInt();
		
		if (suaIdade >= 18) {
			System.out.println("Você é maior de idade");
		} else {
			System.out.println("Você é menor de idade");
		}
		
		// Exercício 4 – Switch 
		System.out.println("Digite um número de 1 a 7: ");
		int diaDaSemana = leitor.nextInt();
		
		switch (diaDaSemana){
		case 1:
			System.out.println("Domingo");
			break;
		case 2:
			System.out.println("Segunda-feira");
			break;
		case 3:
			System.out.println("Terça-feira");
			break;
		case 4:
			System.out.println("Quarta-feira");
			break;
		case 5:
			System.out.println("Quinta-feira");
			break;
		case 6:
			System.out.println("Sexta-feira");
			break;
		case 7:
			System.out.println("Sábado");
			break;
		}
		
		// Exercício 5 – Loop FOR 
		for (int i = 1; i <= 20; ) {
			
		}
		

		
		
		
		
	}

}
