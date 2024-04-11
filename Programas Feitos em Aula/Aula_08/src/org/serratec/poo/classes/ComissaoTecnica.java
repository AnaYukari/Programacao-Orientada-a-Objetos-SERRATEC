package org.serratec.poo.classes;

public class ComissaoTecnica implements Olimpiadas{
	private String nome;
	private String cargo;
	private País pais;
	private boolean emDiaComAsObrigacoesLegais;
	
	public ComissaoTecnica(String nome, String cargo, País pais) {
		this.nome = nome;
		this.cargo = cargo;
		this.pais = pais;
	}

	public boolean isEmDiaComAsObrigacoesLegais() {
		return emDiaComAsObrigacoesLegais;
	}

	public void setEmDiaComAsObrigacoesLegais(boolean emDiaComAsObrigacoesLegais) {
		this.emDiaComAsObrigacoesLegais = emDiaComAsObrigacoesLegais;
	}

	public String getNome() {
		return nome;
	}

	public String getCargo() {
		return cargo;
	}

	public País getPais() {
		return pais;
	}

	public String toString() {
		return "ComissaoTecnica [nome=" + nome + ", cargo=" + cargo + ", pais=" + pais + ", emDiaComAsObrigacoesLegais="
				+ emDiaComAsObrigacoesLegais + "]";
	}

	public String verificaSituacao() {
		String texto = (emDiaComAsObrigacoesLegais) ? "participará" : "não participará";
		
		return nome + "cujo cargo é" + cargo + texto + "das Olimpíadas.";
		
	}
		
	
	
	
}
