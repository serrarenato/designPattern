package br.com.strategy;

public class NotaFiscal {
	
	private Imposto imposto;
	
	public double calcularImposto(double valor) {
		return imposto.calcular(valor);
	}

	public Imposto getImposto() {
		return imposto;
	}

	public void setImposto(Imposto imposto) {
		this.imposto = imposto;
	}
}
