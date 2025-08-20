package aulas_java;

java.util.*;

public class Aula_03_conversaoTipos {

	public static void main(String[] args) {
		// Soma de Entradas
		String valor1 = "15", valor2 = "25";
		
		int valor3 = Integer.parseInt(valor1);
		int valor4 = Integer.parseInt(valor2);
		
		System.out.println(valor3);
		System.out.println(valor4);
		
		// Calculadora de IMC
		String peso = "78.5";
		String altura = "1.82";
		
		double pesoC = Double.parseDouble(peso);
		double alturaC = Double.parseDouble(altura);
		
		double imc = pesoC / (alturaC * alturaC);
		System.out.printf("Seu IMC é: %.2f" + imc);
		
		// Cadastro Simples
		
		
		// O Erro Proposital
		
		
		// Decisão de Compra
		
	
	}

}
