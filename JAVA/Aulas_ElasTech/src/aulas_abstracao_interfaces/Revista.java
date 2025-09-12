package aulas_abstracao_interfaces;

public class Revista extends Produto implements Promocional {

	@Override
	public double aplicarDesconto(double valor) {
		double desconto = valor * 0.10;
		valor -= desconto;
		return valor;
	}
	
}