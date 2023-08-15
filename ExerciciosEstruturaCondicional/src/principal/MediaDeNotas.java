package principal;

import java.util.Scanner;

public class MediaDeNotas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner leia = new Scanner(System.in);
		
		double nota1 = 0;
		double nota2 = 0;
		double nota3 = 0;
		double nota4 = 0;
		double media = 0;
		
		System.out.print("Entre com a primeira nota: ");
		nota1 = leia.nextDouble();
		
		System.out.print("Entre com a segunda nota: ");
		nota2 = leia.nextDouble();
		
		System.out.print("Entre com a terceira nota: ");
		nota3 = leia.nextDouble();
		
		System.out.print("Entre com a quarta nota: ");
		nota4 = leia.nextDouble();
		
		media = (nota1 + nota2 + nota3 +nota4) / 4;
		
		if(media < 6) {
			System.out.println("Aluno reprovado! media: " + media);
		}else if(media >= 6 && media < 7) {
			System.out.println("Aluno de recuperação! média:  " + media );
		}else if(media >= 7 && media < 10) {
			System.out.println("Aluno Aprovado! média: " + media);
		}else {
			System.out.println("Aluno Aprovado com honras! media: " + media);
		}
		
		leia.close();
		
		

	}

}
