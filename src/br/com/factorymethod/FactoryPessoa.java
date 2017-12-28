package br.com.factorymethod;

public class FactoryPessoa {
	public Pessoa getPessoa(String nome, String sexo) {
		Pessoa pessoa = null;
		if (sexo.equals("M"))
			pessoa = new Homem(nome);
		if (sexo.equals("F"))
			pessoa = new Mulher(nome);
		return pessoa;
	}
}
