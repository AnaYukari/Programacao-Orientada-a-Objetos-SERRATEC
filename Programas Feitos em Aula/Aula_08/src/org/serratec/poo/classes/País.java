package org.serratec.poo.classes;

public class País {
	private String nome;

	public País(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Override
	public String toString() {
		return  nome;
	}
	
	
}
