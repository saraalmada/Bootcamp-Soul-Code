package aulas_encapsulamento;

public class Produto {
	private String nome;
	private double preco;
	private int estoque;
	
	public Produto(String nome, double preco, int estoque) {
		this.nome = nome;
		setPreco(preco);
		setEstoque(estoque);
	}
	
	public void setPreco(double valor) {
		if (valor <= 0) {
			System.out.println("Preço do produto " + nome + " inválido.");
			return;
		} 
		this.preco = valor;
	}
	
	public void setEstoque(int quantidade) {
		if (quantidade <= 0) {
			System.out.println("Valor do estoque do produto " + nome + " inválido.");
			return;
		} 
		this.estoque = quantidade;			
	}
	
	
	
	public String getNome() {
		return nome;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public int getEstoque() {
		return estoque;
	}
	
	public double getValorTotalEmEstoque() {
		return preco * estoque;
	}
	
	
	
	
}
