package br.com.bridge;

import java.util.Map;
import java.util.Set;

public class GeradorXML extends GeradorArquivo {

	public GeradorXML(Processador processador) {
		super(processador);
		
	}

	@Override
	public String gerarConteudo(Map<String, String> propriedades) {
		Set<String> chaves = propriedades.keySet();
		String retorno = new String();
		for (String chave : chaves)
			retorno = retorno + "<" + chave + ">" + propriedades.get(chave) + "</" + chave + ">";

		return retorno;
	}

}
