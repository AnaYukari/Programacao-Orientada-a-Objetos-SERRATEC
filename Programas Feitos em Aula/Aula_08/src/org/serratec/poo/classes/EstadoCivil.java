package org.serratec.poo.classes;

public enum EstadoCivil {
	CASADO("C","casado(a)"),
	SOLTEIRO("SO", "solteiro(a)"),
	DIVORCIADO("D", "divorciado(a)"),
	VIUVO("V", "viúvo(a)"),
	SEPARADO("S", "separado(a)");
	
	private String sigla;
	private String descricaoTextual;
	
	private EstadoCivil(String sigla, String descricaoTextual) {
		this.sigla = sigla;
		this.descricaoTextual = descricaoTextual;
	}

	public String getSigla() {
		return sigla;
	}

	public String getDescricaoTextual() {
		return descricaoTextual;
	}
	
	
	
}
