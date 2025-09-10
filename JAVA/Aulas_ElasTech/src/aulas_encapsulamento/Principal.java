package aulas_encapsulamento;

public class Principal {

	public static void main(String[] args) {
		// 1
//		Funcionario f1 = new Funcionario("Sara", 5000.00);
//		System.out.println(f1.getNome() + ": R$" + f1.getSalario() + "\n");
//		
//		Funcionario f2 = new Funcionario("Akira", 700.00);
//		System.out.println(f2.getNome() + ": R$" + f2.getSalario() + "\n");

		// 2
//		Produto shampoo = new Produto("Shampoo", 29.90, 5);
//		
//		System.out.println("Produto: " + shampoo.getNome() + "\nPreço: R$" + shampoo.getPreco() + "\nValor total em estoque: R$" 
//					+ shampoo.getValorTotalEmEstoque() + "\n");
//		
//		Produto condicionador = new Produto("Condicionador", 35.50, -1);
//
//		System.out.println("Produto: " + condicionador.getNome() + "\nPreço: R$" + condicionador.getPreco() + "\nValor total em estoque: R$" 
//					+ condicionador.getValorTotalEmEstoque() + "\n");
//
//		Produto sabonete = new Produto("Sabonete", -8.75, 3);
//		System.out.println("Produto: " + sabonete.getNome() + "\nPreço: R$" + sabonete.getPreco() + "\nValor total em estoque: R$" 
//					+ sabonete.getValorTotalEmEstoque() + "\n");

		// 3
		Livro l1 = new Livro("A crônicas de Nárnia", "Sara", true);
		
//		l1.Emprestar();
//		System.out.println(l1.getStatus());
//		l1.Emprestar();
//		System.out.println();
//		
//		l1.Devolver();
//		System.out.println(l1.getStatus());
//		l1.Devolver();
//		System.out.println();
		
		Livro l2 = new Livro("O pequeno príncipe", "Antoine de Saint-Exupéry", false);
		
		l2.setDisponivel(false);
		
		l2.Emprestar();
		System.out.println(l2.getStatus());
		
		l2.Devolver();
		System.out.println(l2.getStatus());
		
		
//		l2.Emprestar();
//		System.out.println(l2.getStatus());
		
//		l2.Emprestar();
//		System.out.println();
//
//		l2.Devolver();
//		System.out.println(l2.getStatus());
//		l2.Devolver();
//		System.out.println();

		// 4
//		ControleArCondicionado ar1 = new ControleArCondicionado(false, 18);
//		
//		ar1.aumentarTemperatura();
//		ar1.mostrarStatus();
//		
//		System.out.println();
//		ar1.ligar();
//		ar1.mostrarStatus();
//		
//		System.out.println();
//		ar1.aumentarTemperatura();
//		ar1.diminuirTemperatura();
//		ar1.diminuirTemperatura();
//		ar1.diminuirTemperatura();
//		ar1.mostrarStatus();
//
//		System.out.println();
//		ar1.desligar();
//		ar1.mostrarStatus();
		

	}

}
