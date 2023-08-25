package principal;

import entities.Funcionario;
import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa();
		Pessoa func = new Funcionario();
		
		System.out.println("Dados pessoais: ");
		pessoa.setNome("Luan");
		pessoa.setAltura(1.83);
		pessoa.setCpf("123.456.789-10");
		pessoa.setGenero("Masculino");
		pessoa.setIdade(33);
		
		System.out.println(pessoa);
		
		System.out.println("Dados pessoais empresa: ");
		func.setNome("Luan");
		func.setAltura(1.83);
		func.setCpf("123.456.789-10");
		func.setGenero("Masculino");
		func.setIdade(33);
		func.setSalario(2753.99);
		func.setEmpresa("SESI - SENAI");
		System.out.println(func);
		
		int[] numeros = new int[5];
		int cont = 10;
		for(int i = 0; i < 5; i++) {
			//entre com a sua altura
			numeros[i] = cont++;
		}
		
		for(int n : numeros) {
			System.out.println(n);
		}
		

	}

}
