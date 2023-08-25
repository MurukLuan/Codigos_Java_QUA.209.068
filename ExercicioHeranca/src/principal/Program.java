package principal;

import entities.Chefia;
import entities.Funcionario;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Funcionario funcionario = new Funcionario();
		Funcionario gerente = new Chefia();
		funcionario.setNome("Luan");
		funcionario.setIdade(33);
		funcionario.setSalarioBruto(1300.00);
		
		funcionario.obterDadosFuncionario();
		
		gerente.setNome("Luan");
		gerente.setIdade(33);
		gerente.setSalarioBruto(5300.00);
		
		gerente.obterDadosFuncionario();
	}

}
