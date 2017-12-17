package br.com.Fluente;

public class Item {
	String descricao;
	Integer quantidade;

	public Item(String descricao, Integer quantidade) {
		super();
		this.descricao = descricao;
		this.quantidade = quantidade;
	}

	@Override
	public String toString() {
		return "Item [descricao=" + descricao + ", quantidade=" + quantidade + "]";
	}

}
