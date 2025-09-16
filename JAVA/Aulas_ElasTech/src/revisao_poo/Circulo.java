package revisao_poo;

public class Circulo extends FormaGeometrica {
	private double raio;

	public Circulo(double raio) {
		this.raio = raio;
	}
	
	@Override 
	public void calcularArea() {
		double area = 2 * Math.PI * this.raio;
		System.out.printf("A área do círculo é %.2f", area);		 
	}
}
