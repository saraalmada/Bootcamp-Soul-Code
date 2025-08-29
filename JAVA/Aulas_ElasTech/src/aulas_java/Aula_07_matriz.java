package aulas_java;

import java.util.*;

public class Aula_07_matriz {

	public static void main(String[] args) {
		// 1. Crie uma matriz 2x2 de números inteiros, preencha com valores fixos e exiba todos os elementos da matriz na tela.

//		int[][] valores = {
//				{1,2},
//				{3,4}
//				};
//		
//		for (int[] valor: valores) {
//				System.out.println(Arrays.toString(valor));
//		}
		
		
		// 2. Solicite que o usuário digite 9 números e preencha uma matriz 3x3 com eles. Depois, exiba a matriz.
		Scanner leitor = new Scanner(System.in);
		
//		int[][] valores = new int[3][3];
//		
//		for(int i = 0; i < 3; i++) {
//			System.out.println();
//			for(int j = 0; j < 3; j++) {
//				System.out.printf("Digite o valor da linha %d, coluna %d: ", i, j);
//				valores[i][j] = leitor.nextInt();
//			}
//		}
//		
//		for(int[] valor: valores) {
//			System.out.println(Arrays.toString(valor));
//		}
		
		
		// 3. Crie uma matriz 2x3 de números inteiros e exiba a soma de todos os seus elementos.
//		int[][] numeros = {
//				{10,20,30},
//				{40,50,60}
//				};
//		
//		int soma = 0;
//		
//		for(int i=0;i<2;i++) {
//			for(int j=0;j<3;j++) {
//				soma += numeros[i][j];
//			}
//		}
//		
//		for(int[] linha: numeros) {
//			for(int numero: linha) {
//				soma += numero;
//			}
//		}
//		
//		System.out.println("Soma total = " + soma);
		
		
		// 4. Crie uma matriz 3x3 com valores inteiros e encontre o maior número presente nela.
//		int[][] maiorNum = {
//				{1,10,3}, 
//				{4,5,6},
//				{7,8,9}
//				};
//		
//		int maior = Integer.MIN_VALUE;
//		
//		for (int i = 0; i < maiorNum.length; i++) {
//			for (int j = 0; j < maiorNum[i].length; j++) {
//				System.out.print("Digite um número: ");
//				int num = leitor.nextInt();
//				 
//				if (num > maior) {
//					maior = num;
//				}
//			}
//		}
//		System.out.println("O maior número da matriz é " + maior);
		
		
		// 5. Crie uma matriz 2x3. Em seguida, crie uma segunda matriz 3x2 e preencha-a com o valores da primeira matriz, mas com as linhas e colunas 
		// invertidas (o que era linha na primeira vira coluna na segunda). Imprima a matriz transposta.
		
//		int[][] original = { 
//				{1,2,3},
//				{4,5,6}};
//		
//		int[][] transposta = new int[3][2];
//		
//		for(int i=0;i<2;i++) {
//			for(int j=0;j<3;j++) {
//				transposta[j][i] = original[i][j];
//			}
//		}
//		
//		
//		for(int[] saida: original) {
//			System.out.print(Arrays.toString(saida) + "\t");
//			System.out.println();
//		}
//		System.out.println("----------");
//		
//		for(int[] saida: transposta) {
//			System.out.print(Arrays.toString(saida) + "\t");
//			System.out.println();
//		}
		
		// 6.Crie um array de 5 números inteiros e exiba todos os valores usando um foreach.
//		int[] numeros = {10, 20, 30, 40, 50};
//		
//		System.out.println("Valores do array: ");
//		
//		for (int numero: numeros) {
//			System.out.println(numero);
//		}
		
		// 7.Crie um ArrayList de números inteiros, adicione 5 valores e calcule a soma usando um foreach.
		ArrayList<Integer> numeros = new ArrayList<>();
		
		numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);
        numeros.add(50);

        int soma = 0;
		
		for (int numero: numeros) {
			soma += numero;
		}
		
		System.out.println(numeros);
		
		// 8.Crie um ArrayList com nomes de alunos e verifique, usando foreach, se um determinado nome está na lista.
		
		// 9. Crie uma matriz 2x3 com valores inteiros e exiba todos os valores utilizando dois foreach.
		
		// 10.Crie um ArrayList com números inteiros e conte quantos são pares usando foreach.

		
		
		
		leitor.close();
	}

}
