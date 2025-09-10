package aulas_polimorfismo;

public class Principal {

	public static void main(String[] args) {
		// 1
//		Carro carro = new Carro();
//		Moto moto = new Moto();
//		
//		carro.acelerar();
//		moto.acelerar();
		
		// 2
//		Oficina oficina = new Oficina();
//		Carro carro = new Carro();
//		Moto moto = new Moto();
//		
//		oficina.manutencao(carro);
//		oficina.manutencao(moto);
		
		// 3
//		Circulo circulo = new Circulo();
//		Quadrado quadrado = new Quadrado();
//		
//		circulo.desenhar();
//		quadrado.desenhar();
		
		// 4
//		PainelDeDesenho painel = new PainelDeDesenho();
//		
//		painel.desenharForma(circulo);
//		painel.desenharForma(quadrado);
		
		// 5
		CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
		Ebook ebook = new Ebook();
		LivroFisico livro = new LivroFisico();
		
		carrinho.adicionarLivro(ebook);
		carrinho.adicionarLivro(livro);
		
	}

}
