package revisao_poo;

public class ContaSimples {
	private double saldo;
	
	public ContaSimples(double saldo) {
		this.saldo = saldo;
	}

	public void depositar(double valor) {
		if (valor <= 0) {
			System.out.println("Não é possível depositar esse valor.");
		} else {
			this.saldo += valor;
			System.out.println("Depósito realizado com sucesso.");
		}
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	
}
