package principal;

public class NumerosImpares {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*Fa�a um programa que imprima na tela
		 *  apenas os n�meros �mpares entre 1 e 50.
		 */

		/*for(int contador = 0; contador <= 50; contador++) {
				System.out.println(contador);
		}*/
		
		for(int contador = 0; contador <= 50; ++contador) {
			if(contador % 2 != 0) {
				System.out.println(contador);
			}
		}
		
		/*Outra op��o
		 * for(int contador = 1; contador <= 50; contador += 2) {
			System.out.println(contador);
		}*/
		
		/*contador = contador + 2;
		contador += 2;
		contador -= 2;
		contador *= 2;
		contador /= 2;
		contador %= 2;
		*/
		
		/*int a = 10;
		System.out.println(a);
		int b = a++;
		System.out.println(b);
		int c = ++a;
		System.out.println(c);
		*/
		

	}

}
