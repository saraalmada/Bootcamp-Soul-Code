package aulas_heranca;

public class Professor extends Pessoa {

	public Professor(String nome, int idade) {
		super(nome, idade);
		
	}
	
	public void ensinar() {
		System.out.println("Ensinando.");
	}
	
}
