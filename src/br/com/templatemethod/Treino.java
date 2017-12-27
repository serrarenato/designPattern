package br.com.templatemethod;
// This is the class main of Template Method

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
