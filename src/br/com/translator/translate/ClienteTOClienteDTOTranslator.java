package br.com.translator.translate;

import br.com.translator.Cliente;
import br.com.translator.ClienteDTO;
import br.com.translator.base.Translator;

public class ClienteTOClienteDTOTranslator implements Translator<ClienteDTO, Cliente>{

	@Override
	public ClienteDTO translate(Cliente v) {
		return new ClienteDTO(v.getNome());
	}

}
