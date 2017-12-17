package br.com.Fluente;

import java.util.ArrayList;
import java.util.List;

public class Pedido {

	List<Item> itens;
	Cliente cliente;

	Pedido para(String nome) {
		this.cliente = new Cliente(nome);
		return this;
	}

	Pedido com(String descricao, int quantidade) {
		if (itens == null)
			itens = new ArrayList<>();
		itens.add(new Item(descricao, quantidade));
		return this;
	}

	void fechar() {
		System.out.println("Pedido Fechado: " + this);
	}

	@Override
	public String toString() {
		return "Pedido [itens=" + itens + ", cliente=" + cliente + "]";
	}

}
