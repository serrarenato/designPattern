package br.com.bridge;

public class Compactador implements Processador {

	@Override
	public byte[] processar(byte[] bytes) {
		System.out.println("Compactando o arquivo");
		byte[] bytesCompactados = new byte[bytes.length];
		for (int x = 0; x < bytes.length; x = x + 2) {
			bytesCompactados[x] = bytes[x];

		}
		return bytesCompactados;
	}

}
