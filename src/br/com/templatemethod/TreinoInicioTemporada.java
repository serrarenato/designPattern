package br.com.templatemethod;

public class TreinoInicioTemporada extends Treino {

	@Override
	public void jogoTreino() {
		
		System.out.println("Jogo Treino com Equipe Reserva.");
		
	}

	@Override
	public void preparoFisico() {
		System.out.println("Preparo Fisico Intenso.");
		
	}
	
	@Override
	public void treinoTatico() {
		System.out.println("treino tatico intenso");
	}
}
