package principal;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

import entities.Produto;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	
		Produto produto;
		Scanner sc = new Scanner(System.in);
		ArrayList<Produto> produtos = new ArrayList<>();
		
		for(int i = 1; i < 4; i++) {
			 produto = new Produto();
			
			System.out.println("Entre com o nome do produto");
			produto.setNome(sc.nextLine());
			
			System.out.println("Entre com a quantidade: ");
			produto.setQuantidade(sc.nextInt());
			
			System.out.println("Entre com o valor do produto: ");
			produto.setPreco(sc.nextDouble());
			sc.nextLine();
			
			produtos.add(produto);
		}
		
		/*Produto p3 = new Produto("pirulito", 300, 0.56);
		Produto p1 = new Produto("Balinha", 100, 0.15);
		Produto p2 = new Produto("chiclete", 200, 0.65);
		
		
		produtos.add(p1);
		produtos.add(p3);
		produtos.add(p2);*/
		
		Collections.sort(produtos);
		
		System.out.println("Imprimiindo em ordem alfabetica: ");
		produtos.forEach(prod -> System.out.println(prod));
		
		System.out.println("Imprimindo por quantidade: ");
		produtos.sort(Comparator.comparing(Produto::getQuantidade));
		produtos.forEach(prod -> System.out.println(prod));
		
		System.out.println("Imprime ordem quantidade: ");
		Collections.sort(produtos, Comparator.comparing(Produto::getQuantidade));
		produtos.forEach(prod -> System.out.println(prod));
		

		
	}

}
