package aulas_java;

import java.util.Arrays;
import java.util.Scanner;

public class Aula_07_matriz {

	public static void main(String[] args) {
		// 1. Crie uma matriz 2x2 de números inteiros, preencha com valores fixos e exiba todos os elementos da matriz na tela.

//		int[][] valores = {{1,2},{3,4}};
//		
//		for (int[] valor: valores) {
//				System.out.println(Arrays.toString(valor));
//		}
		
		
		// 2. Solicite que o usuário digite 9 números e preencha uma matriz 3x3 com eles. Depois, exiba a matriz.
		Scanner leitor = new Scanner(System.in);
		
//		int[][] lista = new int [3][3];
//		
//		for (int i = 0; i < lista.length; i++) {
//			
//			for (int j = 0; j < lista[i].length; j++) {
//				System.out.print("Digite um número: ");
//				lista[i][j] = leitor.nextInt();
//			}
//		}
//		
//		for (int i = 0; i < lista.length; i++) {
//			
//			for (int j = 0; j < lista[i].length; j++) {
//				System.out.print(lista[i][j] + " ");
//			}
//			System.out.println();
//		}
		
		
		// 3. Crie uma matriz 2x3 de números inteiros e exiba a soma de todos os seus elementos.
		int[][] soma = {{10,20,30},
						{40,50,60}};
		
		int resultado = 0;
		
		for (int i = 0; i < soma.length; i++) {
			for (int j = 0; j < soma[i].length; j++) {
				resultado += soma[i][j];
			}
		}
		
		System.out.println("A soma de todos os elementos é " + resultado);
		
		
		// 4. Crie uma matriz 3x3 com valores inteiros e encontre o maior número presente nela.
		int[][] maiorNum = new int[3][3];
		int maior = Integer.MIN_VALUE;
		
		for (int i = 0; i < maiorNum.length; i++) {
			for (int j = 0; j < maiorNum[i].length; j++) {
				System.out.print("Digite um número: ");
				int num = leitor.nextInt();
				 
				if (num > maior) {
					maior = num;
				}
			}
		}
		System.out.println("O maior número da matriz é " + maior);
		
		
		// 5. Crie uma matriz 2x3. Em seguida, crie uma segunda matriz 3x2 e preencha-a com o valores da primeira matriz, mas com as linhas e colunas 
		// invertidas (o que era linha na primeira vira coluna na segunda). Imprima a matriz transposta.
		
		
		
		// 6.Crie um array de 5 números inteiros e exiba todos os valores usando um foreach.
		
		// 7.Crie um ArrayList de números inteiros, adicione 5 valores e calcule a soma usando um foreach.
		
		// 8.Crie um ArrayList com nomes de alunos e verifique, usando foreach, se um determinado nome está na lista.
		
		// 9. Crie uma matriz 2x3 com valores inteiros e exiba todos os valores utilizando dois foreach.
		
		// 10.Crie um ArrayList com números inteiros e conte quantos são pares usando foreach.

		
		
		
		leitor.close();
	}

}
