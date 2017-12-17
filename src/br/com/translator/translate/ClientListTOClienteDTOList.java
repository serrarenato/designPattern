package br.com.translator.translate;

import java.util.ArrayList;
import java.util.List;

import br.com.translator.Cliente;
import br.com.translator.ClienteDTO;
import br.com.translator.base.Translator;

public class ClientListTOClienteDTOList implements Translator<List<ClienteDTO>, List<Cliente>>{
	

	private Translator<ClienteDTO, Cliente> translate = new ClienteTOClienteDTOTranslator();

	@Override
	public List<ClienteDTO> translate(List<Cliente> v) {
		List<ClienteDTO> list = new ArrayList<ClienteDTO> ();
		for (Cliente cliente : v) {
			list.add(translate.translate(cliente));
		}
		return list;
	}

}
