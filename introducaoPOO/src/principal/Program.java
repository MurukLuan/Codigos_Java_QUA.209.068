package principal;

import java.util.Scanner;

import entities.Carro;

public class Program {

	public static void main(String[] args) {
		// Conceito de carros		
		//caracteristicas(atributos)
		//exemplo de comportamentos acelerar, freiar, acender farois..
		//comportamentos(metodos/fun��o)
		//classes tem muitos recursos como:
		// sobrecarga de metodos e construtores
		//4 pilares podem ser aplicados
		//entities(entidades do sistema) de acordo com a modelagem
		//de negocios: Carro, Pessoa, endere�o...
		//Services: ClienteServices, E-mail servi�os...
		//Controllers
		//utilitarias: Math
		//classe � um molde para o objeto
		Scanner sc = new Scanner(System.in);
		Carro carro = new Carro();
		Carro carroPopular = new Carro();
		
		carro.modelo = "celta";
		carro.ano = "2010";
		carro.placa = "xpt-2023";
		carro.cor = "azul";
		
		carroPopular.modelo = "gol";
		carroPopular.cor = "vermelho";
		
		/*carroPopular.ano = sc.nextLine();
		
		System.out.println(carro.ano);
		System.out.println(carroPopular.ano);*/
		
		System.out.println(carro.acelerar);
		carro.acelerarVeiculo();
		carro.acelerarVeiculo();
		carro.acelerarVeiculo();
		carro.acelerarVeiculo();
		
		System.out.println(carro.acelerar);
		carro.acelerar = 10;
		
		System.out.println(carro.acelerar);
		
		
		

	}

}
