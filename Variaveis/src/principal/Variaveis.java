package principal;

public class Variaveis {

	public static void main(String[] args) {

		int numero = 10;
		// numero = 10;
		double decimal = 10.50;

		int testeNumero = (int) 50.25;
		double testeNovoNumero = 10;

		// aspas uplas para strings
		String nome = "Luan Muruk";
		// aspas simples para char
		char sexo = 'M';
		// booleanos = valores verdadeiros ou falsos
		boolean verdadeiro = true;
		boolean falso = false;
		
		double peso = 100.00;
		int idade = 33;

		System.out.println(numero);
		System.out.println(decimal);
		System.out.println(testeNumero);
		System.out.println(testeNovoNumero);
		System.out.println(sexo);
		System.out.println(nome);
		System.out.println(verdadeiro);
		System.out.println(falso);
		System.out.print("Nome:");
		System.out.println(" Luan F");
		
		//para organizar o codigo usamos o 
		// ctrl + shift + f
		System.out.println("*****************");
		System.out.print("Meu nome �: " + nome);
		System.out.print(", tenho " + idade);
		System.out.print(", peso " + peso + " Kg");
		System.out.print(", sou do sexo: " + sexo);
	}

}
