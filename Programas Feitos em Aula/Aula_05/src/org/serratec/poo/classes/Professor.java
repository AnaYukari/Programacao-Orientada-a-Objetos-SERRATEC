package org.serratec.poo.classes;

import java.time.LocalDate;

public class Professor extends Pessoa {

	private String disciplina;
	private String contato;
	
	public Professor(String nome, String cpf, LocalDate dataNascimento, String contato) {
		super(nome, cpf, dataNascimento);
		this.contato = contato;
	}
	
	public String getDisciplina() {
		return disciplina;
	}
	public void setDisciplina(String disciplina) {
		this.disciplina = disciplina;
	}
	public String getContato() {
		return contato;
	}
	public void setContato(String contato) {
		this.contato = contato;
	}


	public String toString() {
		return super.toString()+ String.format(", Disciplina = "+ disciplina + ", Contato = "+ contato);
	}
	
	
}
