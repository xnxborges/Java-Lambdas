package InterfacesFuncionais;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Consumidor {
	
	public static void main(String[] args) {
		
		Consumer<Produto>imprimir = p -> System.out.println(p.nome);
		
		Produto p1 = new Produto("Caneta", 2.34, 0.09);
		imprimir.accept(p1);
		
		Produto p2 = new Produto("Notebook", 3212.34, 0.25);
		Produto p3 = new Produto("Caderno", 12.34, 0.10);
		Produto p4 = new Produto("Borracha", 1.34, 0.04);
		Produto p5 = new Produto("Lápis", 0.34, 0.09);
		
		//Lista de produtos
		List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);
		
		/*
		 * //Imprime a lista de produtos produtos.forEach(imprimir);
		 * 
		 * //Imprime o preço dos produros sem desconto produtos.forEach(p ->
		 * System.out.println(p.preco));
		 */
		
		//Imprime nome e preço dos produtos com desconto
		produtos.forEach(System.out::println);
	}
}
