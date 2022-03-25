package InterfacesFuncionais;

import java.util.function.Predicate;

public class PredicadoFuncional {
	
	public static void main(String[] args) {
		
		//Fun��o para identificar se o n�mero � par 
		Predicate<Integer> isPar = num -> num % 2 == 0;
		
		//Fun��o para identificar se o n�mero tem 3 digitos
		Predicate<Integer> isTresDigitos = num -> num >= 100 && num <= 999;
		
		//� par e tem 3 digitos
		System.out.println(isPar.and(isTresDigitos).test(122));
		
		//� par ou tem 3 digitos
		System.out.println(isPar.or(isTresDigitos).test(1));
	}

}
