package revisao_poo;

public interface OperacoesBancarias {
	public void depositar(double valor);
	public void sacar(double valor);
	public void transferir(ContaBancaria destino, double valor);
}
