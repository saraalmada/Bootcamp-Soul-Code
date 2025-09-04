package aulas_java_poo;

public class Produto {
	String nome;
	double preco;
	int estoque;
	
	// Constructor 1
	public Produto() {
		this.nome = "Sem nome";
		this.preco = 0.0;
		this.estoque = 0;
	}
	
	// Constructor 2
	public Produto(String nome) {
		this.nome = nome;
		this.preco = 0.0;
		this.estoque = 0;		
	}
	
	// Constructor 3
	public Produto(String nome, double preco, int estoque) {
		this.nome = nome;
		this.preco = preco;
		this.estoque = estoque;
	}
	
	public void exibirDados() {
		System.out.printf("\nProduto: %s \nPreço: R$ %.2f \nEstoque: %d\n", nome, preco, estoque);
	}
	
}
