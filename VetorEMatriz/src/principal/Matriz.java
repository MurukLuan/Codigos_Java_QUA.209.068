package principal;

import java.util.Scanner;

public class Matriz {

	public static void main(String[] args) {
		//uma matriz � um vetor multidimnsional
		//geralmente trabalhamos com 2 dimens�es
		// linha e coluna, parece uma tabela
		
		// os 2 ultimos abre e fecha colchetes s�o
		//para indicar coluna e linha
		//no exemplo abaixo temos uma matriz 3 x 3
		int[][] numeros = new int[3][3];
		
		/*int contador = 10;
		
		for(int i = 0; i < numeros.length; i++) {
			for(int j = 0; j < numeros.length; j++) {
				numeros[i][j] = contador;
				System.out.print(numeros[i][j] + "\t");
				contador++;
			}
			System.out.println();
		}*/
		System.out.print((numeros[0][0] = 10) +"\t" );
		System.out.print((numeros[0][1] = 11) +"\t" );
		System.out.print((numeros[0][2] = 12) +"\t" );
		System.out.println();
		System.out.print((numeros[1][0] = 13) +"\t" );
		System.out.print((numeros[1][1] = 14) +"\t" );
		System.out.print((numeros[1][2] = 15) +"\t" );
		System.out.println();
		System.out.print((numeros[2][0] = 16) +"\t" );
		System.out.print((numeros[2][1] = 17) +"\t" );
		System.out.print((numeros[2][2] = 18) +"\t" );
		System.out.println();
		
		
		 /** 1) fazer uma matriz 3x3 ou 4x4, imprimir os numeros 
		 * da diagonal dessa matriz;
		 * 2) fazer uma matriz 5 x 5 para inserir nome e as 4 notas
		 * do aluno, n�o precisa mostrar a media. imprima o nome e as 
		 * notas
		 **/	
		

	}

}
