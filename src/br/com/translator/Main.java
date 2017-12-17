package br.com.translator;

import java.util.ArrayList;
import java.util.List;
import br.com.translator.base.*;

import br.com.translator.translate.ClientListTOClienteDTOList;

public class Main {
	static Translator<List<ClienteDTO>, List<Cliente>> clientListTOClienteDTOList = new ClientListTOClienteDTOList();
	public static void main(String... args) {
		//Convert a list of Clients in list of ClientsDTO
		List<Cliente>  dummyListClients = dummyClients();
		System.out.println(dummyListClients);
		// Using translator
		List<ClienteDTO> listClienteDTO = clientListTOClienteDTOList.translate(dummyListClients);
		System.out.println(listClienteDTO);
	}

	public static List<Cliente> dummyClients() {
		List<Cliente> listClients = new ArrayList<Cliente>() {
			{
				add(new Cliente("renato"));
				add(new Cliente("joao"));
			}
		};
		return listClients;
	}
	
}
