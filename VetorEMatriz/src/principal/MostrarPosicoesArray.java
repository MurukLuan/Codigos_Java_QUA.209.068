package principal;

public class MostrarPosicoesArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numeros = new int[3];
		int valor = 10;
		for(int contador = 0; contador < numeros.length; contador++) {
			
			numeros[contador] = valor;
			valor += 10;
		}
		
		for(int n : numeros) {
			System.out.println(n);
		}

	}

}
