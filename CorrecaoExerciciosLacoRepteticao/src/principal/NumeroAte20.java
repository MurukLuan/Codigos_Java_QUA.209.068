package principal;

import java.util.Scanner;

public class NumeroAte20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		/*
		 * Faça um programa que imprima na tela os números de 1 a 20, 
		 * um abaixo do outro. Depois modifique o programa para que 
		 * ele mostre os números um ao lado do outro.
		 */
		
		for(int contador = 1; contador < 21; contador++) {
			System.out.println(contador);
		}
		for(int contador = 1; contador < 21; contador++) {
			System.out.print(" " + contador);
		}
		
		sc.close();

	}

}
