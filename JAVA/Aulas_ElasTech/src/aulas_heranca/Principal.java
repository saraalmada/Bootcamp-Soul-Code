package aulas_heranca;

public class Principal {

	public static void main(String[] args) {
		// 1 e 3
//		Carro c1 = new Carro("Toyota", 2020, 4);
//		System.out.println("Marca: " + c1.getMarca() + "\nAno: " + c1.getAno() + "\nPortas: " + c1.getPortas());
		
		// 2
//		Aluno a1 = new Aluno("Sara", 26, 12345);
//		System.out.println("Nome: " + a1.getNome() + "\nIdade: " + a1.getIdade() + "\nMatrícula: " + a1.getMatricula());
		
		// 4
//		Cachorro c1 = new Cachorro();
//		c1.emitirSom();
		
		// 5
//		Gerente g1 = new Gerente();
//		Funcionario f1 = new Funcionario();
//				
//		System.out.println(g1.trabalhar());
//		System.out.println(f1.trabalhar());
		
		// 6
//		Carro c1 = new Carro("Toyota", 2020, 4);
//		Moto m1 = new Moto("Yamaha", 2023);
//		
//		c1.acelerar();
//		m1.acelerar();
		
		// 7
		Professor p1 = new Professor("Keylla", 40);
		Aluno a1 = new Aluno("Juliana", 30, 123);
		
		p1.ensinar();
		a1.estudar();
	}

}
