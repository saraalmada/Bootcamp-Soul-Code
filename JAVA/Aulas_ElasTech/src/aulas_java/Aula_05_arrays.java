package aulas_java;

import java.util.Arrays;

public class Aula_05_arrays {

	public static void main(String[] args) {
		// 1. Criação e Acesso nos Extremos
		String[] lista = new String[5];
		
		lista[0] = "Sara";
		lista[4] = "Almada";
		
		System.out.println(lista[0] + " " + lista[4]);

		
		
		// 2. Modificação de um Valor Central
		int[] valores = {10, 20, 30, 40, 50};
		
		System.out.println(Arrays.toString(valores));
		
		valores[2] = 99;
		
		System.out.println(Arrays.toString(valores));
		
		
		
		// 3. Troca de Valores
		char[] letras = {'A', 'B'};
		System.out.println(Arrays.toString(letras));
		
		char auxiliar = letras[0];
		
		letras[0] = letras[1];
		letras[1] = auxiliar;
		
		System.out.println(Arrays.toString(letras));
		
		
		
		// 4. Acessando com Base no Tamanho
		double[] tamanho = {2.6, 3.7, 4.8, 5.9};
		
		int tamanhoLista = tamanho.length;
		
		System.out.println(tamanhoLista);
		System.out.println(tamanho[tamanhoLista - 1]);
		
		
		
		// 5. Simulação de Cópia Manual
		int[] arrayOriginal = {5, 10, 15};
		int[] arrayCopia = new int[3];
		
		arrayCopia[0] = arrayOriginal[0];
		arrayCopia[1] = arrayOriginal[1];
		arrayCopia[2] = arrayOriginal[2];
		
		System.out.println(Arrays.toString(arrayOriginal));
		System.out.println(Arrays.toString(arrayCopia));
		
		
	}

}
