package aulas_abstracao_interfaces;

public class Livro extends Produto implements Promocional {
	
	@Override
	public double aplicarDesconto(double valor) {
		double desconto = valor * 0.20;
		valor -= desconto;
		return valor;
	}

}