package principal;

import java.util.Scanner;

public class ConversorDeMoeda {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Entre com o valor em real"
				+ " para ser convertido em dólar: ");
		double real = sc.nextDouble();
		
		System.out.printf("Valor em dolar é: %.2f", converterParaDolar(real));
		
		
		System.out.println("\nEntre com o valor em dolar"
				+ " para ser convertido em real: ");
		double dolar = sc.nextDouble();
		
		System.out.printf("\nValor em real é: %.2f", converterParaReal(dolar));

	}
	
	static double converterParaDolar(double real) {
		return real / 4.99;
	}
	
	static double converterParaReal(double dolar) {
		return  4.99 * dolar;
	}

}
