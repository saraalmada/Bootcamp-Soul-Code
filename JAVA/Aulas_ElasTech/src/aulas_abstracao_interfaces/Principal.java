package aulas_abstracao_interfaces;

import java.util.ArrayList;

public class Principal {

	public static void main(String[] args) {
		// 1
//		Animal cachorro = new Cachorro();
//		Animal gato = new Gato();
//		
//		cachorro.emitirSom();
//		gato.emitirSom();
		
		// 2
//		Televisao tv = new Televisao();
//		Radio radio = new Radio();
//		
//		tv.ligar();
//		tv.desligar();
//		System.out.println("----------------");
//		
//		radio.ligar();
//		radio.desligar();
		
		// 3
//		SmartCarro carro = new SmartCarro();
//		
//		carro.conectarWifi();
//		carro.acelerar();
		
		// 4
//		Livro livro = new Livro();
//		Revista revista = new Revista();
//		
//		System.out.println("Livro com desconto: R$" + livro.aplicarDesconto(45.00));
//		System.out.println("Revista com desconto: R$" + revista.aplicarDesconto(19.90));
		
		// 5
//		ArrayList<Animal> animais = new ArrayList<>();
//		
//		animais.add(new Cachorro());
//		animais.add(new Gato());
//		animais.add(new Passaro());
//		
//		for (Animal keylla : animais) {
//			keylla.emitirSom();
//		}
		
		// 6
//		SmartTvReciclavel tv = new SmartTvReciclavel();
//		
//		tv.reciclar();
//		tv.ligar();
//		tv.desligar();
		
		// 7
//		Multifuncional impressora = new Multifuncional();
//		
//		System.out.println(impressora.digitalizar());
//		System.out.println(impressora.imprimir());
		
		// 8
//		Gerente gerente = new Gerente("Juliana", 20000);
//		Vendedor vendedor = new Vendedor("Keylla", 100);
//		
//		gerente.exibirInformacoes();
//		System.out.println("-----------------");
//		vendedor.exibirInformacoes();
		
		// 9
        Cliente cliente = new Cliente();
        Administrador admin = new Administrador();

        System.out.println(cliente.login("sara", "errado"));
        System.out.println(cliente.login("sara", "@123"));
        cliente.logout();
        
        System.out.println();
        System.out.println(admin.login("sara", "123@"));
        System.out.println(admin.login("admin", "123@"));
        admin.logout();

		
		
		
		
		
		
		
	}

}
