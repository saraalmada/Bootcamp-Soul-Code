package aulas_abstracao_interfaces;

public class Vendedor extends Funcionario {
	private double novoSalario;
	
	public Vendedor(String nome, double salario) {
		super(nome, salario);
	}

	@Override
	public double calcularSalario() {
		this.novoSalario = getSalario() * 1.05;
		return this.novoSalario;
	}

	@Override
	public void exibirInformacoes() {		
		calcularSalario();
		System.out.println("Nome: " + getNome());
		System.out.println("Salário: " + this.novoSalario);
	}

}
