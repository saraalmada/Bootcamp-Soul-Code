package aulas_java;

public class Aula_03_conversaoTipos {

	public static void main(String[] args) {
		// Soma de Entradas
		String valor1 = "15", valor2 = "25";
		
		int valor3 = Integer.parseInt(valor1);
		int valor4 = Integer.parseInt(valor2);
		
		System.out.println("Primeiro valor: " + valor3);
		System.out.println("Segundo valor: " + valor4);
		
		// Calculadora de IMC
		String peso = "78.5";
		String altura = "1.82";
		
		double pesoC = Double.parseDouble(peso);
		double alturaC = Double.parseDouble(altura);
		
		double imc = pesoC / (alturaC * alturaC);
		System.out.printf("Seu IMC é: %.2f%n", imc);
		
		
		// Cadastro Simples
		String nome = "Sara";
		String idade = "26";
		String salario = "3200.50";
		
		int minhaIdade = Integer.parseInt(idade);
		double salarioImaginario = Double.parseDouble(salario);
		String apresentacao = String.format("O usuário %s, de %d anos, tem um salário de R$ %.2f", nome, minhaIdade, salarioImaginario);
		
		System.out.println(apresentacao);
		
		// O Erro Proposital
//		String numeroInvalido = "123z";
//		
//		int numeroInv = Integer.parseInt(numeroInvalido);
//		//Exception in thread "main" java.lang.NumberFormatException: For input string: "123z"
		
		// Decisão de Compra
		String saldoConta = "500.75";
		String precoProduto = "499.99";
		String temCredito = "true";
		
		double saldo = Double.parseDouble(saldoConta);
		double preco = Double.parseDouble(precoProduto);
		boolean credito = Boolean.parseBoolean(temCredito);
		
		System.out.println("Saldo na conta: R$" + saldo);
		System.out.println("Preço do produto: R$" + preco);
		System.out.println("Tem crédito? " + credito);
	
	}

}
