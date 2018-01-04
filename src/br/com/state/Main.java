package br.com.state;

import br.com.state.conta.Conta;

public class Main {
	public static void main(String[] args) {
		Conta conta  = new Conta(100d);
		conta.deposito(50d);
		conta.saque(200d);
		conta.saque(200d);
		conta.saque(200d);
		conta.deposito(100d);		
	}

}
