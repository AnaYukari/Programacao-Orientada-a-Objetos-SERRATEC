package org.serratec.poo.classes;

public class Atleta implements Olimpiadas  {
	private String nome;
	private EstadoCivil estadoCivil;
	private double peso;
	private String modalidade;
	private País país;
	
	public Atleta(String nome, String modalidade, País país) {
		this.nome = nome;
		this.modalidade = modalidade;
		this.país = país;
	}

	public String getModalidade() {
		return modalidade;
	}

	public String getNome() {
		return nome;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public País getPaís() {
		return país;
	}
	
	public String verificaSituacao() {
		boolean podeParticipar = false;
		
		if((peso > 90.0) && (modalidade.equalsIgnoreCase("peso pesado")) ) {
			podeParticipar = true ;
		}else if (((peso > 60) &&(peso <= 90.0)) && (modalidade.equalsIgnoreCase("peso medio")) ) {
			podeParticipar = true ;
		}
		
		return (podeParticipar) ? "Poderá participar.\n" : "Não poderá participar.\n";
	}

	public EstadoCivil getEstadoCivil() {
		return estadoCivil;
	}

	public void setEstadoCivil(EstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	@Override
	public String toString() {
		return "Atleta: " + nome + ", estadoCivil=" + estadoCivil.getDescricaoTextual() + ", peso=" + peso + ", modalidade=" + modalidade
				+ ", país=" + país;
	}

	
	
}
