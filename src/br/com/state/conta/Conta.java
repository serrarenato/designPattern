package br.com.state.conta;

public class Conta {
	private Double saldo = 0d;

	public Double getSaldo() {
		return saldo;
	}

	protected void putSaldo(Double saldo) {
		this.saldo += saldo;
	}

	protected void removeSaldo(Double saldo) {
		this.saldo -= saldo;
	}

	public IContaState MeuEstado;

	public Conta() {
		this.saldo = 0d;
	}

	public Conta(Double valor) {
		this.MeuEstado = new SaldoPositivo(this);
		this.deposito(valor);
	}

	public void deposito(Double valor) {
		this.MeuEstado.deposito(valor);
		System.out.println("Estado da conta: " + this.MeuEstado.toString());
	}

	public void saque(Double valor) {
		this.MeuEstado.saque(valor);
		System.out.println("Estado da conta: " + this.MeuEstado.toString());
	}
}
