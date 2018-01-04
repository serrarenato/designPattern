package br.com.state.conta;

public class Bloqueado implements IContaState {

	private Conta conta;

	public Bloqueado(Conta conta) {
		this.conta = conta;
	}

	@Override
	public void saque(Double valor) {
		System.out.println("Conta bloqueada, saque cancelado, saldo atual " + this.conta.getSaldo());

	}

	@Override
	public void deposito(Double valor) {
		this.conta.putSaldo(valor);
		System.out.println("Foi depositado valor de " + valor + ", saldo atual: " + this.conta.getSaldo());
		if (this.conta.getSaldo() < 0)
			if (this.conta.getSaldo() < -100)
				this.conta.MeuEstado = new Bloqueado(this.conta);
			else
				this.conta.MeuEstado = new SaldoNegativo(this.conta);
		else
			this.conta.MeuEstado = new SaldoPositivo(this.conta);

	}
	@Override
	public String toString() {
		return "Bloqueado";
	}

}
