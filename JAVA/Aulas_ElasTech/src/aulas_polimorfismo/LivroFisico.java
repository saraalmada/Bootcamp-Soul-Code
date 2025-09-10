package aulas_polimorfismo;

public class LivroFisico extends Livro {
	
	@Override
	public void aplicarDesconto() {
		System.out.println("Desconto de 5% para livros físicos aplicado.");
	}
	
}
