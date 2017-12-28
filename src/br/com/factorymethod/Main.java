package br.com.factorymethod;

public class Main {
	public static void main(String[] args) {
		FactoryPessoa factory = new FactoryPessoa();
		Pessoa pessoa = factory.getPessoa("Renato", "M");
		System.out.println(pessoa.getNome());
	}
}
