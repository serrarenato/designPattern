package br.com.templatemethod;

public class Main {
	public static void main(String[] args) {
		Treino treinoInicio = new TreinoInicioTemporada();
		treinoInicio.treinoDiario();
		System.out.println("******************************");
		Treino treinoMeio = new TreinoEmTemporada();
		treinoMeio.treinoDiario();
	}
}
