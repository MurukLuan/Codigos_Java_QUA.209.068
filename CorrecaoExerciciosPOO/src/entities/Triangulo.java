package entities;

public class Triangulo {
	
	public int ladoA;
	public int ladoB;
	public int ladoC;
	
	public void obterTipoTriangulo() {
		if(ladoA == ladoB && ladoA == ladoC) {
			System.out.println("Triangulo equilatero");
		}else if(ladoA == ladoB || ladoA == ladoC || ladoB == ladoC) {
			System.out.println("triangulo isóceles");
		}else {
			System.out.println("Triangulo escaleno");
		}
	}

}
