package org.serratec.poo.classes;

import java.util.ArrayList;
import java.util.List;

public class Contato {
	private String nome;
	private Endereco endereco;
	private List<Telefone> telefones = new ArrayList<>();
	
	public Contato(String nome, Endereco endereco) {
		this.nome = nome;
		this.endereco = endereco;
	}

	public List<Telefone> getTelefones() {
		return telefones;
	}

	public void setTelefones(List<Telefone> telefones) {
		this.telefones = telefones;
	}

	public String getNome() {
		return nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}
	
	
	public String toString() {
		return "Nome: " + nome + "\n" + endereco + telefones ;
	}


	public void adicionaTelefone(Telefone telefone) {
		this.telefones.add(telefone);
	}
	
	
	 
	
	
}
