package br.com.bridge;

public class Criptografador implements Processador {

	@Override
	public byte[] processar(byte[] bytes) {
		System.out.println("Criptografando o arquivo");
		byte[] bytesCriptografado= new byte[bytes.length] ;
		int x = 0;
		for (byte b : bytes) {
			byte a = (byte) (b * 2);
			bytesCriptografado[x] = a;
			x++;
		}
		return bytesCriptografado;
	}

}
