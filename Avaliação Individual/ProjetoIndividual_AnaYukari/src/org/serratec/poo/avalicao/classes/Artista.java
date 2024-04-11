package org.serratec.poo.avalicao.classes;

public abstract class Artista {
	private String nome;
	private generoMusical genero;
	private double cache;
	
	public Artista(String nome, generoMusical genero, double cache) {
		this.nome = nome;
		this.genero = genero;
		this.cache = cache;
	}
	public String getNomeArtista() {
		return nome;
	}
	public void setNomeArtista(String nomeArtista) {
		this.nome = nomeArtista;
	}
	public generoMusical getGenero() {
		return genero;
	}
	public void setGenero(generoMusical genero) {
		this.genero = genero;
	}
	public double getCahce() {
		return cache;
	}
	public void setCahce(double cache) {
		this.cache = cache;
	}
	@Override
	public String toString() {
		return "Artista [nomeArtista=" + nome + ", genero=" + genero + ", cahce=" + cache + "]";
	}
	
	
}
