package aulas_java_poo;

public class Filme {
	private String titulo;
	private String diretor;
	private int anoLancamento;
	
	// Constructor 
	public Filme(String titulo, String diretor, int anoLancamento) {
		this.titulo = titulo;
		this.diretor = diretor;
		this.anoLancamento = anoLancamento;	
	}
	
	public void mostrarDetalhes() {
		System.out.printf("Título: %s\nDiretor: %s\nAno de Lançamento: %d", titulo, diretor, anoLancamento);
	}
	
}
