package br.com.factorymethod;

public class Homem extends Pessoa{
	public Homem(String nome) {
		super(nome,"M");
		System.out.println("Olá Senhor " + this.getNome());
		
	}
}
