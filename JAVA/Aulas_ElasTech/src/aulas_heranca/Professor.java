package aulas_heranca;

public class Professor extends Pessoa {

	public Professor(String nome, int idade, String cpf) {
		super(nome, idade, cpf);
	}
	
	public void ensinar() {
		System.out.println("Ensinando.");
	}
	
}
