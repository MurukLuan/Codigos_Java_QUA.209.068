package principal;

import entities.Conta;

public class ProgramConta {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Conta conta = new Conta();
		
		conta.setTitular("Luan");
		//System.out.println("Nome do titular: " + conta.getTitular());
		conta.setAgencia("2561-x");
		conta.setNumeroConta(6610);
		//conta.setSaldo(30.00); não funciona mais
		
		conta.depositar(300.00);
		
		conta.obterDadosbancarios();
		
		conta.sacar(500.00);
		
		conta.obterDadosbancarios();
		
		//conta.saldo = 500.00;
		
		conta.obterDadosbancarios();

	}

}
