package aulas_encapsulamento;

public class Funcionario {
	private String nome;
	private double salario;
	
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		setSalario(salario);
	}
	
	public String getNome() {
		return nome;
	}
	
	public double getSalario() {
		return salario;
	}
	
	public void setSalario(double valor) {
		if (valor >= 1320) {
			System.out.println("Salário válido!");
			this.salario = valor;
		} else {
			System.out.println("Salário inválido!");
			this.salario = valor;
		}
	}
	
}
