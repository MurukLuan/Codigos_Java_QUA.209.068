package principal;

import java.util.Scanner;

public class ExercicioNotasMatriz {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		String[][] alunos = new String[4][5];
		
		/*alunos[0][0] =  "Luan";
		alunos[0][1] = 	"10";
		alunos[0][2] = "6,5";
		alunos[0][3] = "2,5";
		alunos[0][4] = "9,0";
		
		alunos[1][0] =  "Marcos";
		alunos[1][1] = 	"8";
		alunos[1][2] = "6,5";
		alunos[1][3] = "2,5";
		alunos[1][4] = "6,0";
		
		alunos[2][0] =  "Maria";
		alunos[2][1] = 	"10";
		alunos[2][2] = "7,5";
		alunos[2][3] = "1,5";
		alunos[2][4] = "10,0";
		
		alunos[3][0] =  "Jo�o";
		alunos[3][1] = 	"1,0";
		alunos[3][2] = "6,2";
		alunos[3][3] = "2,9";
		alunos[3][4] = "9,9";
		
		/*alunos[4][0] =  "Jose";
		alunos[4][1] = 	"5,0";
		alunos[4][2] = "6,9";
		alunos[4][3] = "2,7";
		alunos[4][4] = "1,0";*/
		
		for(int i = 0; i < alunos.length; i++) {
			for(int j = 0; j <alunos[i].length; j++) {
				if(j == 0) {
					System.out.print("Entre com o nome do aluno: ");
					alunos[i][j] = sc.nextLine();
				}else {
					System.out.printf("Entre com a %d nota: ", (j));
					alunos[i][j] = sc.nextLine();
				}
			}
			System.out.println();
		}
		
		for(int i = 0; i < alunos.length; i++) {
			for(int j = 0; j <alunos[i].length; j++) {
				System.out.print(alunos[i][j] + "\t");
			}
			System.out.println();
		}

	}

}
