package org.serratec.poo.classes;

public class Pessoa {
	private String nome;
	private String genero;
	private int idade;
	private double peso;
	private double altura;
	
	public Pessoa(String nome, String genero, int idade, double peso, double altura) {
		this.nome = nome;
		this.genero = genero;
		this.idade = idade;
		this.peso = peso;
		this.altura = altura;
	}

	public String getNome() {
		return nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return " Informações da Pessoa:\nNome = " + nome + "\nGênero = " + genero + "\nIdade = " + idade + "\nPeso = " + peso + "\nAltura = "
				+ altura;
	}
	
	public void ehMaior () {
		if (idade >= 18) {
			System.out.println("Essa pessoa é maior de idade.");
			return;
		}
		System.out.println("Essa pessoa não é maior de idade.");
	}
	public void calculaEimprimeIMC () {
		double imc;
		imc = peso/(altura*altura);
		if (imc >= 40.0) {
			System.out.printf("O IMC dessa pessoa é: %.2f - Obesidade Grau 3.",imc);
		}else if(imc >= 35.0) {
			System.out.printf("O IMC dessa pessoa é: %.2f - Obesidade Grau 2.",imc);
		}else if(imc >= 30.0) {
			System.out.printf("O IMC dessa pessoa é: %.2f -  Obesidade Grau 1.",imc);
		}else if(imc >= 25.0) {
			System.out.printf("O IMC dessa pessoa é: %.2f - Pré-obesidade.",imc);
		}else if(imc >= 18.5) {
			System.out.printf("O IMC dessa pessoa é: %.2f - Peso Normal.",imc);
		}
//		IMC = Peso dividido pela altura ao quadrado ( peso/altura²) 
//		Entre 18.5 e 24.9 - Peso normal ;
//		Entre 25.0 e 29.9 - Pré-obesidade ;
//		Entre 30.0 e 34.9 - Obesidade Grau 1 ;
//		Entre 35.0 e 39.9 - Obesidade Grau 2 ;
//		Acima de 40 - Obesidade Grau 3
	}
	
}
