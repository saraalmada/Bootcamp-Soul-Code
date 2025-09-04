package aulas_instancia;

public class Principal {

	public static void main(String[] args) {
		// 1
		Pessoa p1 = new Pessoa();
		
		p1.nome = "Sara";
		p1.idade = 26;
		
		System.out.println(p1.nome + " tem " + p1.idade + " anos");
		
		// 2
		Carro c1 = new Carro();
		Carro c2 = new Carro();
		
		c1.cor = "azul";
		c2.cor = "preto";
		
		System.out.println("\nCarro 1: " + c1.cor);
		System.out.println("Carro 2: " + c2.cor);

		// 3
		Calculadora cal1 = new Calculadora();
		
		int num1 = 5;
		int num2 = 8;
		
		System.out.println("\n" + cal1); //memória
		System.out.println("Soma = "+ cal1.somar(num1, num2));
		
		// 4
		Aluno a1 = new Aluno("Sara", "ADS");
		Aluno a2 = new Aluno("Wilson", "Design");
		
		System.out.println("\nNome: " + a1.nome + "\nCurso: " + a1.curso);
		System.out.println("\nNome: " + a2.nome + "\nCurso: " + a2.curso);
		
		// 5
		Produto produto1 = new Produto();
		
		produto1.setPreco(12.50);
		
		System.out.println("\nPreço do produto: R$ " + produto1.getPreco());

		
	

	}

}
