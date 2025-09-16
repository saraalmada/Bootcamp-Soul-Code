package revisao_poo;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		// 1
//		Aluno aluno1 = new Aluno();
//		Aluno aluno2 = new Aluno();
//
//		aluno1.nome = "Akira";
//		aluno1.idade = 10;
//		aluno2.nome = "Mayuka";
//		aluno2.idade = 5;
//		
//		System.out.println("Nome: " + aluno1.nome + "\nIdade: " + aluno1.idade);
//		System.out.println("----------------");
//		System.out.println("Nome: " + aluno2.nome + "\nIdade: " + aluno2.idade);
		
		
		// 2
//		Livro livro1 = new Livro("Vidas secas", "Graciliano Ramos");
//		Livro livro2 = new Livro("Dom Casmurro", "Machado de Assis");
//		
//		System.out.println("Título: " + livro1.getTitulo() + "\nAutor: " + livro1.getAutor());
//		System.out.println("------------------------");
//		System.out.println("Título: " + livro2.getTitulo() + "\nAutor: " + livro2.getAutor());
		
		
		// 3
//		ContaSimples conta = new ContaSimples(1000);
//		
//		conta.depositar(3000);
//		System.out.println("Saldo atual: R$" + conta.getSaldo());
		
		
		// 4
//		Carro carro = new Carro();
//		Moto moto = new Moto();
//		
//		carro.mover();
//		moto.mover();
		
		
		// 5
//		ArrayList<Funcionario> funcionario = new ArrayList<>();
//		
//		funcionario.add(new Gerente());
//		funcionario.add(new Estagiario());
//		
//		for (Funcionario funcionarios : funcionario) {
//			System.out.println("R$" + funcionarios.calcularSalario());
//		}
		
		
		// 6
//		Quadrado quadrado = new Quadrado(5.8);
//		Circulo circulo = new Circulo(8);
//		
//		quadrado.calcularArea();
//		circulo.calcularArea();
	 	
		
		// 7
//		Televisao tv = new Televisao();
//		Radio radio = new Radio();
//		
//		tv.ligar();
//		tv.desligar();
//		System.out.println("--------------------");
//		radio.ligar();
//		radio.desligar();
		
		
		// 8
//		Calculadora calc = new Calculadora();
//		
//		System.out.println("Soma = " + calc.somar(4, 2));
//		System.out.println("Subtração = " + calc.subtrair(5, 1));
//		System.out.println("Multiplicação = " + calc.multiplicar(5, 1));
//		System.out.println("Divisão = " + calc.dividir(7, 7));
		
		
		// 9
//		Departamento TI = new Departamento("TI");
//		
//		Funcionario func1 = new Funcionario("Sara", TI);
//		Funcionario func2 = new Funcionario("Wilson", TI);
//		
//		System.out.println("Nome: " + func1.getNome() + "\nDepartamento: " + func1.getDepartamento().getNome());
//		System.out.println("------------------");
//		System.out.println("Nome: " + func2.getNome() + "\nDepartamento: " + func2.getDepartamento().getNome());
		
		
		// 10
		List<ContaBancaria> contas = new ArrayList<>();
		
		ContaCorrente contaCorrente1 = new ContaCorrente(123, "Sara", 50);
		ContaCorrente contaCorrente2 = new ContaCorrente(456, "Wilson", 100);

		ContaPoupanca contaPoupanca1 = new ContaPoupanca(789, "Mayuka", 150);
		ContaPoupanca contaPoupanca2 = new ContaPoupanca(012, "Akira", 500);
		
		contas.add(contaCorrente1);
		contas.add(contaCorrente2);
		contas.add(contaPoupanca1);
		contas.add(contaPoupanca2);
		
		System.out.println("----------- DEPÓSITO -----------");
		contaCorrente1.exibirTipoConta();
		contaCorrente1.depositar(0);
		contaCorrente1.depositar(10);
		System.out.println();
		
		System.out.println("\n------------ SAQUE ------------");
		contaCorrente1.exibirTipoConta();
		contaCorrente2.sacar(0); 
		contaCorrente2.sacar(100); 
		contaCorrente2.sacar(400); 
		contaCorrente2.sacar(200); 
		System.out.println();
		
		System.out.println("\n-------- TRANSFERÊNCIA --------");
		contaCorrente1.exibirTipoConta();
		System.out.println("--------------------------------");
		System.out.println("De: Titular: " + contaCorrente1.getTitular() + " | Saldo anterior: R$" + contaCorrente1.getSaldo());
		System.out.println("Para: Titular: " + contaPoupanca1.getTitular() + " | Saldo anterior: R$" + contaPoupanca1.getSaldo());
		System.out.println("--------------------------------");
		contaCorrente1.transferir(contaPoupanca1,20);
		System.out.println("--------------------------------");
		System.out.println("De: Titular: " + contaCorrente1.getTitular() + " | Saldo atual: R$" + contaCorrente1.getSaldo());
		System.out.println("Para: Titular: " + contaPoupanca1.getTitular() + " | Saldo atual: R$" + contaPoupanca1.getSaldo());
		System.out.println("--------------------------------");
		System.out.println();
		
		System.out.println("\n------ RENDIMENTO POUPANÇA -----");
		contaPoupanca1.exibirTipoConta();
		System.out.println("Titular: " + contaPoupanca1.getTitular());
		contaPoupanca1.calcularRendimento();
		System.out.println("\n");
		
		contaPoupanca2.exibirTipoConta();
		System.out.println("Titular: " + contaPoupanca2.getTitular());
		contaPoupanca2.calcularRendimento();
		System.out.println("\n");
		
		System.out.println("\n--------- CONTAS ATIVAS --------");
		for (ContaBancaria conta : contas) {
			conta.exibirTipoConta();
			System.out.println("Titular da conta: " + conta.getTitular());
			System.out.printf("Saldo: R$%.2f\n", conta.getSaldo());
			System.out.println("--------------------------------");
		}
		
	}

}
