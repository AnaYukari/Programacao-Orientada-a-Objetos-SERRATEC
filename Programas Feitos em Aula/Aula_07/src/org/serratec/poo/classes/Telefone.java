package org.serratec.poo.classes;

public class Telefone {
	private String numero;

	public Telefone(String numero) {
		this.numero = numero;
	}

	public String getNumero() {
		return numero;
	}
	
	

	public void setNumero(String numero) {
		this.numero = numero;
	}

	@Override
	public String toString() {
		return "\nTelefone: " + numero;
	}
	
	
	
	
}
