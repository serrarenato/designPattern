package br.com.Fluente;

public class Main {
	public static void main(String[] args) {
		new Pedido().para("Renato").com("batata", 4).com("lapis", 9).fechar();
		new Pedido().para("Jutira").com("rabanada", 4).com("lapis", 9).fechar();
		
		System.out.println(new Data("27/11/2017").avancarDias(5).toString());
		System.out.println(new Data("27/10/2017").avancarDias(15).toString());
	}
}
