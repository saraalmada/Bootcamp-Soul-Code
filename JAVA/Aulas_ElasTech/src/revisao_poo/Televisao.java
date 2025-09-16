package revisao_poo;

public class Televisao implements Controlavel {

	@Override
	public void ligar() {
		System.out.println("Televisão ligada");
	}

	@Override
	public void desligar() {
		System.out.println("Televisão desligada");
	}

}
