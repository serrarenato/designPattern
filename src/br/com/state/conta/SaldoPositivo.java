package br.com.state.conta;

public class SaldoPositivo implements IContaState {

	private Conta conta;

	public SaldoPositivo(Conta conta) {
		this.conta = conta;
	}

	@Override
	public void saque(Double valor) {
		this.conta.removeSaldo(valor);
		System.out.println("Foi retirado o valor de " + valor + ", saldo atual: " + this.conta.getSaldo());
		if (this.conta.getSaldo() < 0)
			if (this.conta.getSaldo() < -100)
				this.conta.MeuEstado = new Bloqueado(this.conta);
			else
				this.conta.MeuEstado = new SaldoNegativo(this.conta);

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

	}

	@Override
	public String toString() {
		return "Saldo Positivo";
	}

}
