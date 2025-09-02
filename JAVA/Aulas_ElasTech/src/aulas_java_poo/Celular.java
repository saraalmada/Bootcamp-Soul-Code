package aulas_java_poo;

public class Celular {
		
	//ATRIBUTOS
	String marca;
	String modelo;
	int memoria;
	boolean ligado;
	
	//MÉTODOS
	public void ligar() {
		ligado = true;
		System.out.println("Celular ligado");
	}
	
	public void desligar() {
		ligado = false;
		System.out.println("Celular desligado");
	}
	
	public String mostrarInfo() {
		String infos = "Marca: " + marca + " | Modelo: " + modelo + " | Memória: " + memoria;
		return infos;
	}
	
	public void enviarMensagem(int numero, String mensagem) {
		System.out.println("Enviando mensagem para: " + numero + " " + mensagem);
	}
	
	public void enviarMensagens(int[] numeros, String mensagem) {
		for (int numero : numeros) {
			System.out.println("Enviando mensagem para: " + numero + " " + mensagem);
		}
	}
	
	public static void main(String[] args) {
		Celular samsungJ5 = new Celular();
		samsungJ5.marca = "Samsung";
		samsungJ5.modelo = "J5";
		samsungJ5.memoria = 32;
		
		Celular iphone11 = new Celular();
		iphone11.marca = "Apple";
		iphone11.modelo = "11";
		iphone11.memoria = 128;
		
		Celular motoG35 = new Celular();
		motoG35.marca = "Motorola";
		motoG35.modelo = "G35";
		motoG35.memoria = 256;
		
		// 1
		System.out.println("\n---Celular 1---");
		System.out.println(samsungJ5.marca);
		System.out.println(samsungJ5.modelo);
		
		System.out.println("\n---Celular 2---");
		System.out.println(iphone11.marca);
		System.out.println(iphone11.modelo);
		
		System.out.println("\n---Celular 3---");
		System.out.println(motoG35.marca);
		System.out.println(motoG35.modelo);
		
		// 2
		System.out.println("\n---Ligar e Desligar---");
		motoG35.ligar();
		System.out.println(motoG35.ligado);
		motoG35.desligar();
		System.out.println(motoG35.ligado);
		
		// 3
		System.out.println("\n-----Informações-----");
		System.out.println(samsungJ5.mostrarInfo());
		System.out.println(iphone11.mostrarInfo());
		System.out.println(motoG35.mostrarInfo());

		// 4
		System.out.println("\n---Envio de mensagem---");
		samsungJ5.enviarMensagem(859884662, "Mensagem enviada com sucesso!");
		
		System.out.println("\n---Envio de mensagens---");
		int[] numeros = {119871651, 549882888, 819877657, 149852478};
		samsungJ5.enviarMensagens(numeros, "Mensagem enviada com sucesso!");
	}
}
