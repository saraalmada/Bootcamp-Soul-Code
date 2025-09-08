package aulas_heranca;

public class Principal {

	public static void main(String[] args) {
		// 1, 3, 6 e 10
		Carro carro = new Carro("Toyota", 2020, 4);
		Moto moto = new Moto("Yamaha", 2023, 250);
		Veiculo bicicleta = new Veiculo("Caloi", 2025);
		
		System.out.println("Marca: " + carro.getMarca() 
						+ "\nAno: " + carro.getAno() 
						+ "\nPortas: " + carro.getPortas() 
						+ "\n");
		
		System.out.println("Marca: " + moto.getMarca() 
						+ "\nAno: " + moto.getAno() 
						+ "\nCilindradas: " + moto.getCilindradas() + "cc"
						+ "\n");
		
		carro.acelerar();
		moto.acelerar();
		
		System.out.println();
		carro.mostrarInfo();
		moto.mostrarInfo();
		bicicleta.mostrarInfo();
		
		// 2, 7 e 9
//		Aluno aluno = new Aluno("Sara", 26, "056.123.543-28", 12345);
//		Professor professor = new Professor("Keylla", 40, "823.453.216-05");
//		
//		System.out.println("Nome: " + aluno.getNome() 
//						+ "\nIdade: " + aluno.getIdade() 
//						+ "\nCPF: " + aluno.getCpf() 
//						+ "\nMatrícula: " + aluno.getMatricula() 
//						+ "\n");
//		
//		System.out.println("Nome: " + professor.getNome() 
//						+ "\nIdade: " + professor.getIdade() 
//						+ "\nCPF: " + professor.getCpf() 
//						+ "\n");
//		
//		aluno.estudar();
//		professor.ensinar();
//		
//		// Erro porque cpf é private
//		// aluno.cpf = "000";
//		aluno.setCpf("123.456.789-10");
//		
//		System.out.println("\nNovo CPF do aluno: " + aluno.getCpf());
		
		// 4
//		Animal animal = new Animal();
//		Cachorro cachorro = new Cachorro();
//		
//		animal.emitirSom();
//		System.out.println();
//		
//		cachorro.emitirSom();
		
		// 5
//		Gerente g1 = new Gerente();
//		Funcionario f1 = new Funcionario();
//				
//		System.out.println(g1.trabalhar() + "\n");
//		System.out.println(f1.trabalhar());
		
		// 8
//		ContaCorrente c1 = new ContaCorrente(5480.59);
//		
//		System.out.println("Saldo: R$" + c1.getSaldoInicial());
		
	}

}
