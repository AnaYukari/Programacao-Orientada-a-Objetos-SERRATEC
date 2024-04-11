package org.serratec.poo.classes;

import java.time.LocalDate;

public class Treinador implements Olimpiadas{
	private String nome;
	private LocalDate dataValidadeCREF;
	private País pais;
	
	public Treinador(String nome, LocalDate dataValidadeCREF, País pais) {
		this.nome = nome;
		this.dataValidadeCREF = dataValidadeCREF;
		this.pais = pais;
	}
	
	
	public String getNome() {
		return nome;
	}

	public LocalDate getDataValidadeCREF() {
		return dataValidadeCREF;
	}

	public País getPais() {
		return pais;
	}

	public String toString() {
		return "Treinador [nome=" + nome + ", dataValidadeCREF=" + dataValidadeCREF + ", pais=" + pais + "]";
	}

	@Override
	public String verificaSituacao() {
		LocalDate hoje  = LocalDate.now();
		String texto = (dataValidadeCREF.isAfter(hoje)) ? "participará" : "não participará";
		return nome + " " + texto + "das Olimpíadas";
	}
	
	
	
	
	
}
