package org.serratec.poo.main;

import org.serratec.poo.classes.Livro;
import org.serratec.poo.classes.Opcao;
import org.serratec.poo.classes.Operacao;

public class TestaInterface {
	public static void main(String[] args) {
		Livro livro1 = new Livro("Sarah J. Maas", "Trono de Vidro", 60.00);
		Livro livro2 = new Livro("Sarah J. Maas", "Corte de Espinhos e Rosas", 60.00);
		
		Operacao operacao1 = new Operacao();
		operacao1.setLivro(livro1);
		operacao1.vender();
		
		Operacao operacao2 = new Operacao();
		operacao2.setLivro(livro2);
		operacao2.emprestar();
		
		System.out.println(operacao1);
		System.out.println(operacao2);
		
		livro2.reajuste(35);
		operacao2.emprestar();
		System.out.println(operacao2);
		
		
		
	}

}
