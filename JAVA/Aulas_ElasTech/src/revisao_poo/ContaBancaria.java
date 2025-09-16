package revisao_poo;

public abstract class ContaBancaria implements OperacoesBancarias {
	private int numeroConta;
	private String titular;
	private double saldo;
	
	public ContaBancaria(int numeroConta, String titular, double saldo) {
		this.numeroConta = numeroConta;
		this.titular = titular;
		this.saldo = saldo;
	}
	
	public abstract void exibirTipoConta();
	
	public int getNumeroConta() {
		return numeroConta;
	}

	public void setNumeroConta(int numeroConta) {
		this.numeroConta = numeroConta;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	@Override
	public void depositar(double valor) {
		if (valor > 0) {
			this.saldo += valor;
			System.out.println("Depósito realizado com sucesso.");
		} else {
			System.out.println("Valor para depósito não permitido.");
		}
	}
	
	private void depositarInterno(double valor) {
	    setSaldo(getSaldo() + valor); 
	}

	@Override
	public void sacar(double valor) {
		if (valor > 0 && valor <= this.saldo) {
			saldo -= valor;
			System.out.println("Saque realizado com sucesso.");
		} else {
			System.out.println("Saldo insuficiente para saque.");
		}
		
	}
	
	private void sacarInterno(double valor) {
		setSaldo(getSaldo() - valor); 
	}

	@Override
	public void transferir(ContaBancaria destino, double valor) {
		if (valor > 0 && valor <= this.saldo) {
			sacarInterno(valor);
			destino.depositarInterno(valor);
			System.out.println("Transferência realizada com sucesso.");
		} else {
			System.out.println("Saldo insuficiente para transferência.");
		}
		
	}
	
	

	
}
