package org.serratec.poo.classes;

public class Cidade {
	private String nomeCidade;
	private Estado estado;
	
	public Cidade(String nomeCidade, Estado estado) {
		this.nomeCidade = nomeCidade;
		this.estado = estado;
	}
	
	public String getNomeCidade() {
		return nomeCidade;
	}
	public Estado getEstado() {
		return estado;
	}

	
	public String toString() {
		return  nomeCidade + " " + estado;
	}
	
	
	
	
	
	
	
	
	
	
}
