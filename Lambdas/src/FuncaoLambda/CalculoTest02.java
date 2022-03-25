package FuncaoLambda;

public class CalculoTest02 {
	
	public static void main(String[] args) {
		
		//Lambda
		Calculo calcular = (x, y) -> {
			return x + y;
		};
		
		System.out.println(calcular.executar(3, 6));
		
		calcular = (x, y) -> x * y;
		System.out.println(calcular.executar(3, 6));
	}
}
