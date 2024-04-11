package Aula_3;

import java.util.Scanner;

public class Aula {
	public static void main(String[] args) {
		int num1;
		int num2;
		
	//como fazer a leitura de um número? São 3 passos:
	
	//1- criar um scanner e dar um nome a ele:
		Scanner leitura = new Scanner (System.in);
		
		System.out.println("Digite um número: ");
	//2-fazer a leitura da variável:
		num1 = leitura.nextInt();
		System.out.println("Digite outro número: ");
		num2 = leitura.nextInt();
		leitura.nextLine();
		
		System.out.println(num1);
		System.out.println(num2);
		
	//3- fechar o nosso scanner, para não armazenar dados na memoria:
		leitura.close();
	}

}
