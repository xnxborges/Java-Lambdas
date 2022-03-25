package InterfacesFuncionais;

import java.util.function.Predicate;

public class PredicadoFuncional {
	
	public static void main(String[] args) {
		
		//Função para identificar se o número é par 
		Predicate<Integer> isPar = num -> num % 2 == 0;
		
		//Função para identificar se o número tem 3 digitos
		Predicate<Integer> isTresDigitos = num -> num >= 100 && num <= 999;
		
		//É par e tem 3 digitos
		System.out.println(isPar.and(isTresDigitos).test(122));
		
		//É par ou tem 3 digitos
		System.out.println(isPar.or(isTresDigitos).test(1));
	}

}
