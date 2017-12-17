package br.com.builder;

public class Pizza {
	private int tamanho;
	private boolean queijo;
	private boolean tomate;
	private boolean bacon;

	private Pizza(int tamanho, boolean queijo, boolean tomate, boolean bacon) {
		super();
		this.tamanho = tamanho;
		this.queijo = queijo;
		this.tomate = tomate;
		this.bacon = bacon;
	}

	public static class Builder {
		private final int tamanho;
		// opcional
		private boolean queijo = true;
		private boolean tomate = false;
		private boolean bacon = false;

		public Builder(int tamanho) {
			this.tamanho = tamanho;
		}

		public Builder tomate() {
			tomate = true;
			return this;
		}

		public Builder queijo() {
			queijo = true;
			return this;
		}

		public Builder bacon() {
			bacon = true;
			return this;
		}

		public Pizza build() {
			return new Pizza(tamanho, queijo, tomate, bacon);
		}

	}

	@Override
	public String toString() {
		return "Builder [tamanho=" + tamanho + ", queijo=" + queijo + ", tomate=" + tomate + ", bacon=" + bacon + "]";
	}

}
