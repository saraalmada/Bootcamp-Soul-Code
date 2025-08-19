package aulas_java;

public class Aula_01_exercicio {

	public static void main(String[] args) {
		// 1
		String nome = "Sara";
		int idade = 26;
		double altura = 1.60;
		boolean pet = true;
		
		System.out.println("Meu nome é " + nome);
		System.out.println("Tenho " + idade + " anos de idade");
		System.out.println("Tenho " + altura + " metros de altura");
		System.out.println("É " + pet + " que tenho 2 pets");
		
		
		// 2
		int numeroA = 10;
		int numeroB = 21;
		int soma = numeroA + numeroB;
		
		System.out.println("A soma de " + numeroA + " + " + numeroB + " = " + soma);
		
		
		// 3
		// int numero = "teste";
		
		
		// 4
		String part1 = "Meu nome ";
		String part2 = "é Sara ";
		String part3 = "e tenho ";
		String part4 = "26 anos";
		String fraseCompleta = part1 + part2 + part3 + part4;
		
		System.out.println(fraseCompleta);
		
		
		// 5
		int placar = 0;
		
		System.out.println("O placar atual é: " + placar);
		
		placar = 15;
		
		System.out.println("O placar atual é: " + placar);
		
		placar = 30;
		
		System.out.println("O placar atual é: " + placar);
		
	}

}
