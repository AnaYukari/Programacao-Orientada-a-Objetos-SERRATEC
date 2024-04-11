package org.serratec.poo.principal;

import java.time.LocalDate;

import org.serratec.poo.classes.Aluno;
import org.serratec.poo.classes.Pessoa;
import org.serratec.poo.classes.Professor;

public class TestaPessoa {
	
	public static void main(String[] args) {
		Pessoa pessoa1 = new Pessoa("Ana Yukari", "126.596.087-92", LocalDate.of(2005, 5, 17));
		System.out.println(pessoa1);

		Aluno aluno1 = new Aluno("Carlinha", "123.456.789.29", LocalDate.of(2004, 11, 24), "29847324");
		System.out.println(aluno1);
		System.out.println("Idade = " + aluno1.getIdade());
		
		Professor professor1 = new Professor("Jacqueline", "232.544.656-87", LocalDate.of(1995, 4, 23), "999275754");
		professor1.setDisciplina("POO");
		System.out.println(professor1);
	
	}
}
