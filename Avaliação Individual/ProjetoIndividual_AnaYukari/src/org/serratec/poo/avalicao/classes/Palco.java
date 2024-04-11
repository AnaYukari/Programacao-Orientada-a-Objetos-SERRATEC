package org.serratec.poo.avalicao.classes;


import java.util.ArrayList;
import java.util.List;

public class Palco {
	private String nome;
	private int capacidade;
	private List<Evento> eventos = new ArrayList<>();
	
	public Palco(String nome, int capacidade) {
		super();
		this.nome = nome;
		this.capacidade = capacidade;
	}

	public String getNome() {
		return nome;
	}

	public int getCapacidade() {
		return capacidade;
	}
	
	public List<Evento> getEventos() {
		return eventos;
	}

	public void setEventos(List<Evento> eventos) {
		this.eventos = eventos;
	}
	
	public void adicionaEvento (Evento evento) {
		this.eventos.add(evento);
	}
	
	public void mostrarEventos() {
		for (Evento atracao : eventos) {
			System.out.println(atracao + "\n");
		}
	}

//	"Palco " + nome + "\nCapacidade: " + capacidade + mostrarEventos();;
	@Override
	public String toString() {
		return "Palco " + nome + "\nCapacidade: " + capacidade + "\n" + eventos ;
	}
	

	
	
}
