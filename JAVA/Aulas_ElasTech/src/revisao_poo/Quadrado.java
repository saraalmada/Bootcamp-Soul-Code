package revisao_poo;

public class Quadrado extends FormaGeometrica{
	private double lado;

	public Quadrado(double lado) {
		this.lado = lado;
	}

	@Override
	public void calcularArea() {
		double area = lado * lado;
		System.out.println("A área do quadrado é " + area);		
	}

}