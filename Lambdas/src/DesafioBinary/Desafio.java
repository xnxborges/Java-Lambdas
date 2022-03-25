package DesafioBinary;

import java.util.function.Function;
import java.util.function.UnaryOperator;

import InterfacesFuncionais.Produto;


public class Desafio {

	public static void main(String[] args) {
		
		/*
		 * Desafio
		 * 1. A partir do produto calcular o preco real (com desconto)
		 * 2. Imposto Municipal: >= 2500 (8,5%)/ < 2500 (Isento)
		 * 3. Frete: >= 3000 (100)/ < 3000 (50)
		 * 4. Arredondar: Deixar duas casas decimais
		 * 5. Formatar: R$1234,56
		 */

		Function<Produto, Double> precoFinal = produto -> produto.preco * (1 - produto.desconto);

		UnaryOperator<Double> impostoMunicipal = preco -> preco >= 2500 ? preco * 1.085 : preco;

		UnaryOperator<Double> frete = preco -> preco >= 3000 ? preco + 100 : preco + 50;
	
		Function<Double, String> arredondar = preco -> String.format("%.2f", preco);

		Produto p = new Produto("iPad", 3235.89, 0.10);
		String preco = precoFinal
				.andThen(impostoMunicipal)
				.andThen(frete)
				.andThen(arredondar).apply(p);

		System.out.println("preço final R$: " + preco);
	}
}
