package br.com.bridge;

import java.util.HashMap;
import java.util.Map;

public class MainBridgePattern {

	public static void main(String[] args) {

		
		
		GeradorArquivo xml = new GeradorXML(new Compactador());
		xml.gerarArquivo(getDummy());
	
		GeradorArquivo json = new GeradorJson(new Compactador());
		json.gerarArquivo(getDummy());
		
		GeradorArquivo jsonCript = new GeradorJson(new Criptografador());
		jsonCript.gerarArquivo(getDummy());
		
		
		
		
	}

	public static Map<String, String> getDummy() {
		Map<String, String> teste = new HashMap<String, String>() {
			{
				put("nome1", "Renato");
				put("nome2", "Carlos");
				put("nome3", "Sergio");
			}
		};
		
		return teste;
	}
}
