package br.com.builder;

public class Main {
	public static void main(String[] args) {
		Pizza pizza = new Pizza.Builder(10).build();
		System.out.println(pizza.toString());
		
		Pizza pizza2 = new Pizza.Builder(10).bacon().build();
		System.out.println(pizza2.toString());
	}
}
