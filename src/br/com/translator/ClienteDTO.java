package br.com.translator;

public class ClienteDTO {
	String nome;

	public ClienteDTO(String nome) {
		super();
		this.nome = nome;
	}

	@Override
	public String toString() {
		return "ClienteDTO [nome=" + nome + "]";
	}	
	
}
