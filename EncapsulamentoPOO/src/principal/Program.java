package principal;

import entities.Pessoa;

public class Program {

	public static void main(String[] args) {
				
		Pessoa pessoa = new Pessoa();
		
		pessoa.setNome("Luan");
		pessoa.calcularIdade(1990);
		
		pessoa.imprimeDados();		

	}

}
