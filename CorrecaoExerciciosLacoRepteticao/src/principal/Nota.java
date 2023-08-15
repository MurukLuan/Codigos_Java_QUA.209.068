package principal;

import java.util.Scanner;

public class Nota {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		/*
		 * Faça um programa que peça uma nota, entre zero e dez.
		 * Mostre uma mensagem caso o valor seja inválido e continue 
		 * pedindo até que o usuário informe um valor válido.
		*/
		double nota = 0;
		
		System.out.println("Entre com uma nota entre 0 e 10: ");
		nota = sc.nextDouble();
		
		while(nota <= 0 || nota >= 10) {
			System.out.println("Nota inválida. ");
			
			System.out.println("Entre com uma nota entre 0 e 10: ");
			nota = sc.nextDouble();
		}
		
		System.out.println("Notá valida! Valor informado: " + nota);
		
		sc.close();
		

	}

}
