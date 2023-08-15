package principal;

import java.util.Scanner;

public class AnoBissexto {

	public static void main(String[] args) {
		Scanner leia = new Scanner(System.in);
		
		//digitar um ano e dizer se é bissexto
		int ano = 0;
		
		System.out.print("Entre com o ano para saber se é bissexto: ");
		ano = leia.nextInt();
		
		if(ano % 4 == 0 && ano % 100 != 0) {
			System.out.println("É um ano bissexto!");
		}
		else if( ano % 400 == 0) {
			System.out.println("É um ano bissexto!");
		}
		else {
			System.out.println("Não é um ano bissexto!");
		}
		
		leia.close();

	}

}
