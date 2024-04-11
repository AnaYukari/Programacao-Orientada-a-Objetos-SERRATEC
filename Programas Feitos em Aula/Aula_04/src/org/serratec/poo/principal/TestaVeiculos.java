package org.serratec.poo.principal;

import org.serratec.poo.classes.Veiculo;

public class TestaVeiculos {
	public static void main(String[] args) {
		Veiculo uno = new Veiculo("Fiat",2008 ,"cse-9056");
		uno.setModelo("1.6");
		uno.setCategoria(" ");
		uno.setCor("Branco");
		System.out.println(uno.getMarca());
		System.out.println(uno);
	}
}
