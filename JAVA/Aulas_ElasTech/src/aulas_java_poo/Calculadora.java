package aulas_java_poo;

import java.util.Scanner;

public class Calculadora {
	void somar(double a, double b) {
		double resultado = a + b;
		System.out.println(a + " + " + b + " = " + resultado);
	}
	
	void subtrair(double a, double b) {
		double resultado = a - b;
		System.out.println(a + " - " + b + " = " + resultado);
	}
	
	void multiplicar(double a, double b) {
		double resultado = a * b;
		System.out.println(a + " * " + b + " = " + resultado);
	}
	
	void dividir(double a, double b) {
		if (b != 0) {
			double resultado = a / b;
			System.out.println(a + " / " + b + " = " + resultado);
		} else {
			System.out.println("Não é possível dividir por zero. Por favor, insira um número diferente.");
		}
	}
	
	void mostrarMenu() {
		System.out.println("--- CALCULADORA ---");
        System.out.println("1 - Somar");
        System.out.println("2 - Subtrair");
        System.out.println("3 - Multiplicar");
        System.out.println("4 - Dividir");
        System.out.println("0 - Sair");
        System.out.println("---------------------------");
        System.out.print("Escolha uma opção: ");
	}
	
	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		Calculadora calculadora = new Calculadora();
		
		int opcao;
		
		do {
			calculadora.mostrarMenu();
			opcao = leitor.nextInt();
			
			if (opcao == 0) {
				System.out.println("Saindo...");
				
			} else if (opcao > 0 && opcao <= 4) {
				System.out.println("Digite o primeiro número: ");
				double num1 = leitor.nextDouble();
				System.out.println("Digite o segundo número: ");
				double num2 = leitor.nextDouble();
				
				switch (opcao) {
					case 1:
						calculadora.somar(num1, num2);
						break;
					case 2:
						calculadora.subtrair(num1, num2);
						break;
					case 3:
						calculadora.multiplicar(num1, num2);
						break;
					case 4:
						calculadora.dividir(num1, num2);
						break;
				}
				System.out.println("\n");
				
			} else {
				System.out.println("Opção inválida. Por favor, escolha um número entre 1 e 4, ou 0 para sair.\n");
			}
		} while (opcao != 0);
		
		
		leitor.close();
	}
}
