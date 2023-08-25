package entities;

public class Chefia extends Funcionario {
	
	@Override
	public double getBonus() {
		// TODO Auto-generated method stub
		return (salarioBruto * 0.05);
	}

}
