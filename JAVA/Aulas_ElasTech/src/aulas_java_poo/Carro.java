package aulas_java_poo;

public class Carro {
	String marca;
	int ano;
	
	public Carro() {
		this.marca = "Desconhecida";
		this.ano = 0;
	}
	
	public void exibirInfo() {
		System.out.println("Marca: " + this.marca + " | Ano: " + this.ano);
	}
}
