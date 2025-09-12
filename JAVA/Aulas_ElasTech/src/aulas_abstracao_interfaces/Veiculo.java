package aulas_abstracao_interfaces;

public abstract class Veiculo {
	private String marca;
	private String modelo;
	
	public abstract void acelerar();

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
}