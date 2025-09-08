package aulas_heranca;

public class Moto extends  Veiculo {
	private int cilindradas;
	
	public Moto(String marca, int ano, int cilindradas) {
		super(marca, ano);
		this.cilindradas = cilindradas;
	}

	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}
	
	@Override
	public void mostrarInfo() {
		System.out.println("Marca: " + getMarca() 
						+ "\nAno: " + getAno() 
						+ "\nCilindradas: " + this.cilindradas + "cc"
						+ "\n");
	}
	
}
