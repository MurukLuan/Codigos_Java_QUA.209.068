package principal;

import java.util.Scanner;

public class MaiorNumeroEntre3Numeros {

	public static void main(String[] args) {
		// Maior numero entre 3 numeros
		
		Scanner leia = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		
		System.out.println("Entre com o primeiro numero: ");
		num1 = leia.nextInt();
		
		System.out.println("Entre com o segundo numero: ");
		num2 = leia.nextInt();
		
		System.out.println("Entre com o terceiro numero: ");
		num3 = leia.nextInt();
		
		if(num1 > num2 && num1 > num3) {
			System.out.println("Numero " + num1 + " é o maior numero");
		}
		else if(/*num2 > num1 && */num2 > num3 ) {
			System.out.println("Numero " + num2 + " é o maior numero");
		}
		else {
			System.out.println("Numero " + num3 + " é o maior numero");
		}
		
		
		
		
		
		
		
		
		leia.close();
	}

}
