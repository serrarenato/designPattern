package br.com.factorymethod;

public class Mulher extends Pessoa{

		public Mulher(String nome) {
			super(nome,"F");
			System.out.println("Olá Senhora " + this.getNome());
			
		}
	
}
