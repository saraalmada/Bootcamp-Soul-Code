package aulas_java_poo;

public class AlunoDesafio {
	private String nome;
	private double[] notas;
	
	// Constructor
	public AlunoDesafio(String nome) {
		this.nome = nome;
		this.notas = new double[4];
	}
	
	public void adicionarNota(int bimestre, double nota) {
		if (bimestre >= 1 && bimestre <= 4 && nota >= 0 && nota <=10) {
			notas[bimestre - 1] = nota;
		} else {
			System.out.println("Bimestre ou nota inválidos! Informe um bimestre de 1 a 4 e uma nota de 0 a 10.");
		}
	}
	
	public double calcularMedia() {
		double soma = 0;

		for (double nota : notas) {
			soma += nota;
		}
		
		return soma / notas.length;
	}
	
	public void verificarStatus() {
		double media = calcularMedia();
		if (media >= 7.0) {
			System.out.println(this.nome + " foi aprovado(a)! Média: " + media);
		} else {
			System.out.println(this.nome + " foi reprovado(a)! Média: " + media);
		}
	}
}
