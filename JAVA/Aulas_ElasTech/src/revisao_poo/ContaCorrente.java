package revisao_poo;

public class ContaCorrente extends ContaBancaria {

	public ContaCorrente(int numeroConta, String titular, double saldo) {
		super(numeroConta, titular, saldo);
	}

	@Override
	public void exibirTipoConta() {
		System.out.println("Conta Corrente");
	}
	
	@Override
	public void sacar(double valor) {
		if (valor > 0 && valor <= (getSaldo() + 500)) {
			setSaldo(getSaldo() - valor);
			
			if (getSaldo() >= 0) {
	            System.out.println("Saque realizado com sucesso.");
	        } else {
	            System.out.println("Saque realizado utilizando limite especial.");
	        }
			
		} else {
			System.out.println("Saldo insuficiente para saque.");
		}
		
	}
	
	
	
}
