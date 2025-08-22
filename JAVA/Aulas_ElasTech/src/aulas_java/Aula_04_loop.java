package aulas_java;

import java.util.Scanner;

public class Aula_04_loop {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		// 1. A Tabuada Personalizada
//		System.out.print("Digite um número inteiro: ");
//		int numero = leitor.nextInt();
//		
//		for(int i = 1; i <=10; i++) {
//			int resultado = numero * i;
//			System.out.println(numero + " x " + i + " = " + resultado);
//		}
		
		
		
		// 2. Soma dos Números Pares
//		int somaPares = 0;
//		
//		for(int i = 0; i < 101; i += 2) {
//			somaPares += i;
//		}
//		
//		System.out.println("A soma dos números pares de 1 a 100 é: " + somaPares);
		
		
		
		// 3. Validação de Entrada
//		int idade;
//		do {
//			System.out.println("Digite sua idade: ");
//			idade = leitor.nextInt(); 
//			if (idade < 0 || idade > 100) {
//		        System.out.println("Idade inválida, tente novamente!");
//		    }
//		} while (idade < 0 || idade > 100);
		
		
		
		// 4. Contagem regressiva de 10 a 1 (while)
//		int i = 10;
//		while (i >= 1) {
//			System.out.println(i);
//			i--;
//		}
		
		
		
		// 5. Somar números até que o usuário digite 0 (do-while)
		int n = 0;
		int soma = 0;
		
		do {
			System.out.println("--------------------------- "
					+ "\nPara finalizar digite 0. "
					+ "\nDigite um número para somar: ");
			n = leitor.nextInt();
			soma +=  n;
		} while (n != 0);
		
		System.out.println("A soma total é: " + soma);
		
		
		
		
		
		leitor.close();
	}

}
