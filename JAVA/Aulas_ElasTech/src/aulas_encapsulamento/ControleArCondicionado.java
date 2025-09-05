package aulas_encapsulamento;

public class ControleArCondicionado {
	private boolean ligado;
	private int temperatura;
	
	public ControleArCondicionado(boolean ligado, int temperatura) {
		this.ligado = ligado;
		this.temperatura = temperatura;
	}
	
	public void ligar() {
		this.ligado = true;
	}
	
	public void desligar() {
		this.ligado = false;
	}
	
	public void aumentarTemperatura() {
		if (this.ligado) {
			if (this.temperatura < 30) {
				this.temperatura++;
				System.out.println("Temperatura ajustada para " + this.temperatura + "°C");
			} else {
				System.out.println("Temperatura máxima atingida.");
			}
		} else {
			System.out.println("Não é possível ajustar a temperatura. O ar condicionado está desligado.");
		}
	}
	
	public void diminuirTemperatura() {
		if (this.ligado) {
			if (this.temperatura > 17) {
				this.temperatura--;
				System.out.println("Temperatura ajustada para " + this.temperatura + "°C");
			} else {
				System.out.println("Temperatura mínima atingida.");
			}
		} else {
			System.out.println("Não é possível ajustar a temperatura. O ar condicionado está desligado.");
		}
	}
	
	public void mostrarStatus() {
		if (this.ligado) {
			System.out.println("O ar condicionado está ligado e com uma temperatura de " + this.temperatura + "°C");
		} else {
			System.out.println("O ar está desligado.");
		}
		
	}
}
