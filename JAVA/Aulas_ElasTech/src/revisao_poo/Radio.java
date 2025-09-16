package revisao_poo;

public class Radio implements Controlavel {

	@Override
	public void ligar() {
		System.out.println("Radio ligado");
	}

	@Override
	public void desligar() {
		System.out.println("Radio desligado");
	}

}
