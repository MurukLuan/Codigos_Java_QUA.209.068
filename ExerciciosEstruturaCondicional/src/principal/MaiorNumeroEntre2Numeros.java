package principal;

import java.util.Scanner;

public class MaiorNumeroEntre2Numeros {

	public static void main(String[] args) {
		// Maior numero entre 2 numeros
		Scanner leia = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		
		System.out.println("Entre com o primeiro n�mero: ");
		num1 = leia.nextInt();
		
		System.out.println("Entre com o segundo numero: ");
		num2 = leia.nextInt();
		
		if(num1 > num2) {
			System.out.println("maior numero �: " + num1);
		}else {
			System.out.println("maior numero �: " + num2);
		}
		System.out.println("Maior numero �: " + Math.max(num1, num2));
		
		
		
		
		
		leia.close();
	}

}
