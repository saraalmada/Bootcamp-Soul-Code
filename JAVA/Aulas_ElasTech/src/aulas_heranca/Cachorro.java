package aulas_heranca;

public class Cachorro extends Animal {
	
	@Override
	public void emitirSom() {
		super.emitirSom();
		System.out.println("Miau");
	}
}
