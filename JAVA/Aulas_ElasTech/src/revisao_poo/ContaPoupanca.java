package revisao_poo;

public class ContaPoupanca extends ContaBancaria {

	public ContaPoupanca(int numeroConta, String titular, double saldo) {
		super(numeroConta, titular, saldo);
	}

	@Override
	public void exibirTipoConta() {
		System.out.println("Conta Poupança");
	}
	
	public void calcularRendimento() {
		double rendimento = getSaldo() * 0.02;
		setSaldo(getSaldo() + rendimento);
		System.out.printf("Sua conta rendeu R$%.2f", rendimento);
	}

}
