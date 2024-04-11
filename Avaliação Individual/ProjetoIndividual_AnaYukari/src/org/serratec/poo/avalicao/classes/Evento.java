package org.serratec.poo.avalicao.classes;

public class Evento {
	private String data;
	private String horario;
	private String artista;
	

	
	public Evento(String data, String horario, String artista ) {
		this.data = data;
		this.horario = horario;
		this.artista = artista;
	}

	public String getData() {
		return data;
	}

	public String getHorario() {
		return horario;
	}

	public String getArtista() {
		return artista;
	}
	
	
	
	@Override
	public String toString() {
		return  "\n" + data + " - " + horario + " - " + artista;
	}
	
	
	
	
}
