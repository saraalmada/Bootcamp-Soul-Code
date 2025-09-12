package aulas_abstracao_interfaces;

public class Gerente extends Funcionario {
	private double novoSalario;
	
	public Gerente(String nome, double salario) {
		super(nome, salario);
	}

	@Override
	public double calcularSalario() {
		this.novoSalario = getSalario() * 1.10;
		return this.novoSalario;
	}

	@Override
	public void exibirInformacoes() {		
		System.out.println("Nome: " + getNome());
		System.out.println("Salário: " + this.novoSalario);
	}

}
