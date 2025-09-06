package aulas_heranca;

public class Gerente extends Funcionario {
	
	@Override
	public String trabalhar() {
		super.trabalhar();
		return "Gerenciando";
	}
}
