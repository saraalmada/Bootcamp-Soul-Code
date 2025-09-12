package aulas_abstracao_interfaces;

public class SmartTvReciclavel implements Controlavel, Reciclavel {

	@Override
	public void reciclar() {
		System.out.println("Tv reciclável");
	}

	@Override
	public void ligar() {
		System.out.println("Televisão ligada");
	}

	@Override
	public void desligar() {
		System.out.println("Televisão desligada");
	}
	
}
