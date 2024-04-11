package org.serratec.poo.classes;

public class Produto implements Opcao {
	private String nome;
	private double valor;
	private String status;
	
	public Produto(String nome, double valor) {
		this.nome = nome;
		this.valor = valor;
	}
	
	
	public String getStatus() {
		return status;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}

	
	
	@Override
	public String toString() {
		return "\nProduto: " + nome + "\nValor: R$" + valor + "\nStatus: " + status;
	}


	public void emprestar() {
		status = "Emprestado";
	}
	public void vender() {
		status = "Vendido";
		
		
	}
}
