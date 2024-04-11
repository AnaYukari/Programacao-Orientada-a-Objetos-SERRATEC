package org.serratec.poo.principal;

import java.util.ArrayList;
import java.util.List;

import org.serratec.poo.classes.Cidade;
import org.serratec.poo.classes.Contato;
import org.serratec.poo.classes.Endereco;
import org.serratec.poo.classes.Estado;
import org.serratec.poo.classes.Telefone;

public class TestaDados {
	public static void main(String[] args) {
		Contato novoContato = new Contato("Ana Yukari",
							  new Endereco("Estrada do Catete, s/n", "Alto do Catete", "983734-437",
							  new Cidade("Nova Friburgo",
							  new Estado("Rio de Janeiro", "RJ"))));

		novoContato.adicionaTelefone(new Telefone("99722-5004"));
		Telefone tel = new Telefone("99962-5862");
		novoContato.adicionaTelefone(tel);
		
		System.out.println(novoContato);
		
		
		Estado rj = new Estado("Rio de Janeiro", "RJ");
		Cidade friburgo = new Cidade("Nova Fributgo",rj);
		Endereco endereco = new Endereco ("Rua Portugual, 11", "Centro", "27437-342", friburgo);
		Contato contato2 = new Contato ("João Almeida Campos", endereco);
		
		List<Telefone> telefones = new ArrayList<>();
		telefones.add(tel);
		telefones.add(new Telefone("9977-7328"));
		contato2.setTelefones(telefones);
		System.out.println("\n"+contato2);
		
	}
}
