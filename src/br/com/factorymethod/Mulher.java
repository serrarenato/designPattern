package br.com.factorymethod;

public class Mulher extends Pessoa{

		public Mulher(String nome) {
			super(nome,"F");
			System.out.println("Ol� Senhora " + this.getNome());
			
		}
	
}
