package aulas_encapsulamento;

public class Livro {
	private String titulo, autor;
	private boolean disponivel;
	
	public Livro(String titulo, String autor, boolean disponivel) {
		this.titulo = titulo;
		this.autor = autor;
		this.disponivel = disponivel;
		}
	
	public void Emprestar() {
		if (this.disponivel) {
			disponivel = false;
			System.out.println("Livro emprestado com sucesso!");
		} else {
			System.out.println("Livro não disponível.");
		}
	}
	
	public void Devolver() {
		if (!this.disponivel) {
			disponivel = true;
			System.out.println("Livro devolvido com sucesso!");
		} else {
			System.out.println("Livro não pode ser devolvido, pois está disponível.");
		}
	}
	
	public String getStatus() {
		String status;
		if (this.disponivel) {
			status = "Status: Disponível";
		} else {
			status = "Status: Emprestado";
		}
		return status;
	}
}
