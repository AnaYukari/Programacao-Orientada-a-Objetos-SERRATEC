package org.serratec.poo.principal;

import org.serratec.poo.classes.Pessoa;

public class TestaPessoa {
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("Ana Yukari Futigami Pereira", "Feminino",18, 63.5 , 1.66);
		System.out.println(pessoa1);
		pessoa1.ehMaior(); 
		pessoa1.calculaEimprimeIMC();
	}
}
