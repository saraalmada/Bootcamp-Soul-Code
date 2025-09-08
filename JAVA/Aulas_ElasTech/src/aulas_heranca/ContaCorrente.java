package aulas_heranca;

public class ContaCorrente extends ContaBancaria {

	// O construtor precisa ser declarado, pois existe um construtor em ContaCorrente, caso contrário não roda o programa
	public ContaCorrente(double saldoInicial) {
		super(saldoInicial);
	}

}