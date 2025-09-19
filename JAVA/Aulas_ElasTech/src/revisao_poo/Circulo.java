package revisao_poo;

public class Circulo extends FormaGeometrica {
	private double raio;

	public Circulo(double raio) {
		this.raio = raio;
	}
	
	@Override 
	public void calcularArea() {
		double area = Math.PI * (Math.pow(this.raio, 2));
		System.out.printf("A área do círculo é %.2f", area);		 
	}
}
