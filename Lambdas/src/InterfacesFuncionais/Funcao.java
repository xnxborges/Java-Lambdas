package InterfacesFuncionais;

import java.util.function.Function;

public class Funcao {
	
	public static void main(String[] args) {
		
		Function<Integer, String> parOuImpar = num -> num % 2 == 0 ? "Par" : "Impar";
		
		Function<String, String> resultado = valor -> "O resultado é: " + valor;
		
		System.out.println(parOuImpar.apply(33));
		String resultadoFinal = parOuImpar.andThen(resultado).apply(33);
		System.out.println(resultadoFinal);
	}
}
