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
		
		System.out.println("Carro 1: " + c1.cor);
		System.out.println("Carro 2: " + c2.cor);

		// 3
		Calculadora cal1 = new Calculadora();
		
		int num1 = 5;
		int num2 = 8;
		
		System.out.println(cal1); //memória
		System.out.println("Soma = "+ cal1.somar(num1, num2));

	}

}
