package org.serratec.poo.classes;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Pessoa {
	private String nome;
	private String cpf;
	private LocalDate dataNascimento;
	
	public Pessoa(String nome, String cpf, LocalDate dataNascimento) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	
	public int getIdade() {
		LocalDate dataAtual = LocalDate.now();
		Period periodo = Period.between(dataNascimento, dataAtual);
		return periodo.getYears();
	}

	@Override
	public String toString() {
		DateTimeFormatter df =  DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		return "Nome = " + nome + ", cpf = " + cpf + ", dataNascimento = " + df.format(dataNascimento) + ", Idade = " + getIdade();
	}
	
	
	
	
}
