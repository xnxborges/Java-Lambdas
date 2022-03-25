package FuncaoLambda;

import java.util.Arrays;
import java.util.List;

public class ForEach {

	public static void main(String[] args) {
		
		//Array com nome de alunos
		List<String> aprovados = Arrays.asList("Ana", "Lia", "Bia", "Gui");

		//For tradicional
		System.out.println("Forma tradicional");
		for (String nome : aprovados) {
			System.out.println((nome));
		}
		
		//For Lambda
		System.out.println("\nLambda #01");

		aprovados.forEach((nome) -> {
			System.out.println(nome + "!!");
		});
		
		//Lambda metodo referencia
		System.out.println("\nMethod Reference");
		aprovados.forEach(System.out::println);
	}
}
