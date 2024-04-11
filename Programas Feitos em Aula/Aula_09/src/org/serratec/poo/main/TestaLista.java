package org.serratec.poo.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaLista {
	public static void main(String[] args) {
		List<String> linguagens = new ArrayList<>();
		linguagens.add("Java");
		linguagens.add("JavaScript");
		linguagens.add("Python");
		linguagens.add("C++");
		linguagens.add("Portuguol");
		linguagens.add("Cobol");
		linguagens.add("Dellphi");
		
		for (String item : linguagens) {
			System.out.println(item);	
		}
		
		System.out.println("Tamanho da lista " + linguagens.size() + "\n");
		
		linguagens.addFirst("Lua");
		
		for (String item : linguagens) {
			System.out.println(item);	
		}
		
		System.out.println("Tamanho da lista " + linguagens.size() + "\n");
		
		Collections.sort(linguagens);
		
		for (String item : linguagens) {
			System.out.println(item);
		}
	}
}
