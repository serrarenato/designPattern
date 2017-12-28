package br.com.templatemethod;

// This is the class main of Template Method
// This pattern is good to refactory, when you have a big class with a lot of conditional, then we would split in subclasses let the orinal class with a TemplateMethod.
// This pattern avoid duplicate lines too.

public abstract class Treino {
	public final void treinoDiario() {
		preparoFisico();
		relax30min();
		jogoTreino();
		relax30min();
		treinoTatico();
	}

	public abstract void jogoTreino();

	private final void relax30min() {
		System.out.println("Descansando");

	}

	public abstract void preparoFisico();

	public void treinoTatico() {
		System.out.println("treino tatico");
	}

}
