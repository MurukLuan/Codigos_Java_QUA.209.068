package principal;

import java.util.Scanner;

public class Nota {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		/*
		 * Fa�a um programa que pe�a uma nota, entre zero e dez.
		 * Mostre uma mensagem caso o valor seja inv�lido e continue 
		 * pedindo at� que o usu�rio informe um valor v�lido.
		*/
		double nota = 0;
		
		System.out.println("Entre com uma nota entre 0 e 10: ");
		nota = sc.nextDouble();
		
		while(nota <= 0 || nota >= 10) {
			System.out.println("Nota inv�lida. ");
			
			System.out.println("Entre com uma nota entre 0 e 10: ");
			nota = sc.nextDouble();
		}
		
		System.out.println("Not� valida! Valor informado: " + nota);
		
		sc.close();
		

	}

}
