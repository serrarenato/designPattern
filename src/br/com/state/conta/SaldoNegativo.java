package br.com.state.conta;

public class SaldoNegativo implements IContaState {

	private Conta conta;

	public SaldoNegativo(Conta conta) {
		this.conta = conta;
	}

	@Override
	public void saque(Double valor) {
		this.conta.removeSaldo(valor);
		System.out.println("Foi retirado o valor de " + valor + ", saldo atual: " + this.conta.getSaldo());

		if (this.conta.getSaldo() < -100)
			this.conta.MeuEstado = new Bloqueado(this.conta);

	}

	@Override
	public void deposito(Double valor) {
		this.conta.putSaldo(valor);
		System.out.println("Foi depositado valor de " + valor + ", saldo atual: " + this.conta.getSaldo());
		if (this.conta.getSaldo() < 0)
			if (this.conta.getSaldo() < 0)
				this.conta.MeuEstado = new SaldoNegativo(this.conta);
			else
				this.conta.MeuEstado = new SaldoPositivo(this.conta);

	}

	@Override
	public String toString() {
		return "Saldo Negativo";
	}

}
