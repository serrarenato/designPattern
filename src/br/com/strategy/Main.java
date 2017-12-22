package br.com.strategy;

public class Main {
	public static void main(String[] args) {
		NotaFiscal nf = new NotaFiscal();
		Imposto imposto = new ImpostoSP();
		nf.setImposto(imposto);
		System.out.println("SP: imposto:" + nf.calcularImposto(300));
		imposto = new ImpostoRJ();
		nf.setImposto(imposto);
		System.out.println("RJ: imposto:" + nf.calcularImposto(300));
	}
}
