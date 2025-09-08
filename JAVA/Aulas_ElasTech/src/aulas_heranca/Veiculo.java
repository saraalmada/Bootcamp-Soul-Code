package aulas_heranca;

public class Veiculo {
	private String marca;
	private int ano;
	
	public Veiculo(String marca, int ano) {
		this.marca = marca;
		this.ano = ano;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}
	
	public void acelerar() {
		System.out.println("Acelerando");
	}
	
	public void mostrarInfo() {
		System.out.println("Marca: " + this.marca 
		+ "\nAno: " + this.ano 
		+ "\n");
	}
}
