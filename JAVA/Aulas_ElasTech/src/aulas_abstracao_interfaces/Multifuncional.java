package aulas_abstracao_interfaces;

public class Multifuncional implements Imprimivel, Digitalizavel {

	@Override
	public String digitalizar() {
		return "Imprimindo documento...";
	}

	@Override
	public String imprimir() {
		return "Digitalizando documento...";
	}

}
