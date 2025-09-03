package aulas_java_poo;

public class Livro {
	String titulo;
	String autor;
	
	// Constructor 1
	public Livro(String titulo) {
		this.titulo = titulo;
		this.autor = "Desconhecido";
	}
	
	// Constructor 2
	public Livro(String titulo, String autor) {
		this.titulo = titulo;
		this.autor = autor;
	}
	
	public void exibirDados() {
		System.out.println("Título: " + this.titulo 
				+ "\nAutor: " + this.autor
				+ "\n");
	}
}
