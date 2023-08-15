package principal;

import java.util.Scanner;

public class MaiorNumeroEntre2Numeros {

	public static void main(String[] args) {
		// Maior numero entre 2 numeros
		Scanner leia = new Scanner(System.in);
		int num1 = 0;
		int num2 = 0;
		
		System.out.println("Entre com o primeiro número: ");
		num1 = leia.nextInt();
		
		System.out.println("Entre com o segundo numero: ");
		num2 = leia.nextInt();
		
		if(num1 > num2) {
			System.out.println("maior numero é: " + num1);
		}else {
			System.out.println("maior numero é: " + num2);
		}
		System.out.println("Maior numero é: " + Math.max(num1, num2));
		
		
		
		
		
		leia.close();
	}

}
