package br.com.templatemethod;

public class TreinoEmTemporada extends Treino {

	@Override
	public void jogoTreino() {
		
		System.out.println("Jogo Treino com Equipe Junior.");
		
	}

	@Override
	public void preparoFisico() {
		System.out.println("Preparo Fisico Leve.");
		
	}
}
