package br.com.bridge;

// This is the bridge between Processador and GeradorArquivo class;
public interface Processador {
	public byte[] processar(byte[] bytes);
}
