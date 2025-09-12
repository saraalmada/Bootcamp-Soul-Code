package aulas_abstracao_interfaces;

public class SmartCarro extends Veiculo implements Conectavel {

	@Override
	public void acelerar() {
		System.out.println("Carro acelerando");
	}

	@Override
	public void conectarWifi() {
		System.out.println("Wifi conectado");
	}
	
}
