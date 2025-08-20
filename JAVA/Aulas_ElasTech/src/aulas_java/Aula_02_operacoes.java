package aulas_java;

import java.util.Scanner;

public class Aula_02_operacoes {

	public static void main(String[] args) {		
		// Calculadora de Média
		double nota1 = 8.5 , nota2 = 7.0 , nota3 = 9.2;	
		
		double media = (nota1 + nota2 + nota3) / 3;
		System.out.println("A média das notas é: " + media);
		
		// Conversor de Temperatura
		Scanner leitor = new Scanner(System.in);
		System.out.println("Digite a temperatura atual, em F°: ");
		
		double tempF = leitor.nextDouble();
		double tempC = (tempF - 32) * 5 / 9;

		System.out.println("A temperatura de " + tempF + "°F é igual a " + tempC + "°C");
		
		leitor.close();

		// Quociente e Resto
		int dividendo = 25;
		int divisor = 4;
		
		int quociente = dividendo / divisor;
		int resto = dividendo % divisor;
		
		System.out.println("O quociente da divisão é: " + quociente);
        System.out.println("O resto da divisão é: " + resto);

		// Calculadora de Idade Futura
		int anoDeNascimento = 1999;
		int anoAtual = 2025;
		int idade = anoAtual - anoDeNascimento;

		System.out.println("Se agora você tem " + idade + " anos, em 2050 você terá " + (2050 - anoDeNascimento) + " anos");

		// Conversor de Segundos para Minutos
		int totalDeSegundos = 200;
		int minutos = totalDeSegundos / 60;
		int segundosRestantes = totalDeSegundos % 60;

		System.out.println(totalDeSegundos + " segundos correspondem a " + minutos + " minutos e " + segundosRestantes + " segundos");
	}
}
