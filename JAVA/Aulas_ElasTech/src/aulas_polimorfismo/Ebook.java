package aulas_polimorfismo;

public class Ebook extends Livro {
	
	@Override
	public void aplicarDesconto() {
		System.out.println("Desconto de 15% para ebooks aplicado.");
	}
	
}
