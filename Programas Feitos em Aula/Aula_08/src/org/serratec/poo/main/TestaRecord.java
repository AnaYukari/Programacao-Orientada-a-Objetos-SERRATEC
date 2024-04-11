package org.serratec.poo.main;

import org.serratec.poo.classes.País;
import org.serratec.poo.classes.Presidente;

public class TestaRecord {
	public static void main(String[] args) {
		Presidente presidente1 = new Presidente("Lula",new País ("Brasil"), 2024);
		System.out.println(presidente1);
	}
}
