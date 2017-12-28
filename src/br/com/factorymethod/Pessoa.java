package br.com.factorymethod;

public abstract class Pessoa {
	private String nome;

	public String getNome() {
		return nome;
	}

	public String getSexo() {
		return sexo;
	}

	private String sexo;

	public Pessoa(String nome, String sexo) {
		this.nome = nome;
		this.sexo = sexo;
	}
}
