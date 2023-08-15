package principal;

import java.util.Scanner;

public class MediaAlturas {

	public static void main(String[] args) {
		//Faça um programa que receba a altura de 
		//10 pessoas e mostre a media da altura delas
		Scanner sc = new Scanner(System.in);
		
		double altura = 0;
		double media = 0;
		
		for(int contador = 1; contador < 11; contador++) {
			System.out.println("Digite a altura: ");
			altura = sc.nextDouble();
			media = media + altura;
			//media += altura;
		}
		
		System.out.println("A media das alturas é: " + (media / 10));

	}

}
