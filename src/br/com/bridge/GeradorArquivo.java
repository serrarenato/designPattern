package br.com.bridge;

import java.util.Map;

public abstract class GeradorArquivo {
	Processador processador;

	public void gerarArquivo(Map<String, String> propriedades) {
		String conteudo = gerarConteudo(propriedades);
		byte[] bytes = conteudo.getBytes();
		bytes = processador.processar(bytes);
		// operations to save a file.
		System.out.println("Gravando conteudo Orignal: " + conteudo);
		System.out.println("Gravando conteudo Alterado: " + new String(bytes));
	}

	public GeradorArquivo(Processador processador) {
		this.processador = processador;
	}

	public abstract String gerarConteudo(Map<String, String> propriedades);
}
