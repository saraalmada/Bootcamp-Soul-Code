package aulas_java;

import java.util.Scanner;

public class Aula_04_loop_desafios {

	public static void main(String[] args) {
		Scanner leitor = new Scanner(System.in);
		
		// 1. Sequência de Fibonacci 
		// É uma série de números inteiros onde cada termo é o resultado da adição dos dois números que o precedem. 
		
//		int comeco0 = 0;
//		int comeco1 = 1;
//		
//		for (int i = 0; i < 15; i++) {
//			System.out.println(comeco0);
//			
//			int seguinte = comeco0 + comeco1;
//			comeco0 = comeco1;
//			comeco1 = seguinte;
//		}
		
		
		
		
		
		// 2. Desenhando um Triângulo de Asteriscos
//		int linhas = 10;
		
//		for (int i = 1; i <= 10; i++) {
//			
//			for (int a = 1; a <= i; a++) {
//				System.out.print("*");
//			}
//			System.out.println();			
//		}
	
		
		
		
		
		// 3. Soma de Compras até Parar
//		double produto = 0;
//		double soma = 0;
//		
//		do {
//            System.out.println("---------------------------");
//            System.out.println("Para finalizar sua compra digite 0.");
//            System.out.print("Digite o valor do produto: ");
//            produto = leitor.nextDouble();
//
//            if (produto != 0) {
//                soma += produto;
//                System.out.println("Valor parcial da compra: R$ " + soma);
//            }
//        } while (produto != 0);
//
//        System.out.println("---------------------------");
//        System.out.println("Compra finalizada!");
//        System.out.println("O valor total da compra é: R$ " + soma);
		
		
		
		
		
		// 4. Adivinhe o Número Secreto
		int numeroSecreto = new java.util.Random().nextInt(100) + 1;
		
		int palpite = 0;
		
		while (palpite != numeroSecreto) {
			System.out.print("Digite seu palpite de 1 a 100: ");
			palpite = leitor.nextInt();
			
			if (palpite < numeroSecreto) {
                System.out.println("Dica: O número secreto é maior que " + palpite);
            } else if (palpite > numeroSecreto) {
                System.out.println("Dica: O número secreto é menor que " + palpite);
            } else {
            	System.out.println("Parabéns! Você acertou!");
            }
		}
//        
        		
		
		
		
		// 5. Verificador de Número Primo
//		System.out.println("Digite um número inteiro positivo: ");
//		int numero = leitor.nextInt();
//		
//		boolean ehPrimo = true; 
//		
//		if (numero <= 1) {
//			ehPrimo = false;
//			
//		} else {
//			
//			for (int i = 2; i <= Math.sqrt(numero); i++) {  
//				
//				if (numero % i == 0) {
//					ehPrimo = false;
//				}
//				
//			}
//			
//		}
//		
//		if (!ehPrimo) {
//			System.out.println(numero + " não é um número primo.");
//		} else {
//			System.out.println(numero + " é um número primo.");
//		}
		
		

		
		
		leitor.close();
	}

}
