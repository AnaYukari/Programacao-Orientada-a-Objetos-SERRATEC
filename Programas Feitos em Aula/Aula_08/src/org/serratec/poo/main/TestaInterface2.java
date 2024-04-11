package org.serratec.poo.main;

import java.util.ArrayList;
import java.util.List;

import org.serratec.poo.classes.Livro;
import org.serratec.poo.classes.Opcao;
import org.serratec.poo.classes.Operacao;
import org.serratec.poo.classes.Produto;

public class TestaInterface2 {
	public static void main(String[] args) {
		List<Opcao> acoes = new ArrayList<>();
		
		Livro livro1 = new Livro("Sarah J. Maas", "Trono de Vidro", 60.00);
		Operacao operacao1 = new Operacao();
		operacao1.setLivro(livro1);
		
		Livro livro2 = new Livro("Sarah J. Maas", "Corte de Espinhos e Rosas", 60.00);
		Operacao operacao2 = new Operacao();
		operacao2.setLivro(livro2);
		
		Produto produto1 = new Produto("Teclado", 150.00);
		
		Produto produto2 = new Produto("Mouse", 80.50);

		acoes.add(operacao2);
		acoes.add(operacao1);
		acoes.add(produto1);
		acoes.add(produto2);
		
		for(Opcao opcao : acoes) {
			opcao.vender();
			System.out.println(opcao);
		}
	}
}
