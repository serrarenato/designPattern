package br.com.strategy;

public class ImpostoRJ implements Imposto{

	@Override
	public double calcular(double valor) {
		if (valor>1000)
			return valor * 1.2;
		else 
			return valor * 1.1;
	}

}
