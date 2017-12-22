package br.com.strategy;

public class ImpostoSP implements Imposto{

	@Override
	public double calcular(double valor) {
		
		return valor * 1.2;
	}

}
