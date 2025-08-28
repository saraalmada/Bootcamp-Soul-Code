package aulas_java;

import java.util.ArrayList;

public class Aula_05_arrayList {

	public static void main(String[] args) {
		// 1. Verificação de Presença na Lista
		ArrayList<String> nomes = new ArrayList<>();
		
		nomes.add("Alice");
		nomes.add("Fernanda");
		nomes.add("Camila");
		
		System.out.println(nomes.contains("Camila"));
		System.out.println(nomes.contains("Barbara"));
		
		
		
		// 2. Remoção por Objeto e Verificação de Tamanho
//		ArrayList<Integer> numeros = new ArrayList<>();
//		
//		numeros.add(10);
//		numeros.add(20);
//		numeros.add(30);
//		
//		System.out.println(numeros);
//		System.out.println(numeros.size());
//		
//		numeros.remove(Integer.valueOf(20));
//		
//		System.out.println(numeros);
//		System.out.println(numeros.size());
		
		
		
		// 3. Encontrando a Posição de um Elemento
//		ArrayList<String> estacoesDoAno = new ArrayList<>();
//		
//		estacoesDoAno.add("Primavera");
//		estacoesDoAno.add("Verão");
//		estacoesDoAno.add("Outono");
//		estacoesDoAno.add("Inverno");
//
//		System.out.println(estacoesDoAno.indexOf("Outono"));
//		
//		System.out.println(estacoesDoAno.indexOf("Geada"));
		
		
		
		// 4. Limpando a Lista
//		ArrayList<Double> valores = new ArrayList<>();
//		
//		valores.add(7.8);
//		valores.add(8.9);
//		valores.add(10.0);
//		
//		System.out.println(valores);
//		
//		System.out.println(valores.isEmpty());
//		
//		valores.clear();
//		
//		System.out.println(valores);
//		
//		System.out.println(valores.isEmpty());
		
		

		// 5. Substituindo um Convidado
		ArrayList<String> listaDeConvidados = new ArrayList<>();
		
		listaDeConvidados.add("Beatriz");
		listaDeConvidados.add("Ana");
		listaDeConvidados.add("Juliana");
		
		System.out.println(listaDeConvidados);
		
		listaDeConvidados.set(1, "Mariana");
		
		System.out.println(listaDeConvidados);

	}

}
