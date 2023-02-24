package javaPrimerosPasos;

public class Conversiones {
	public static void main(String[] argm) {
		double variable1 = 230.89;
		int variable1Entero = (int) variable1;	//(CAST)PARA CAMBIAR UN NUMERO FLOTANTE A UN ENTERO, SOLO ES NECESARIO DECLARARLO COMO ENTERO CON UN PARENTESISI (CAST).
		
		System.out.println(variable1Entero);	//IMPRIME: 230
		
		//INT SOPORTA UNA CANTIDAD DE 32 BITS
		
		long prueba = 1222222222222222L;
		short numeroPequeno = 13555;
		byte numeroMasPequeno = 124;
		float nmeroDecimalPequeno = 2.5F;
		
		//NO SE PUEDEN SUMAR UN NUMERO "DOUBLE" CON UN NUMERO "ENTERO", SOLO SI PONEMOS 
		//EL RESULTADO DE LA VARIABLE COMO TIPO "DOUBLE" O (CAST) EL NUMERO BOUBLE.
		
		//double variable2 = 500.01;
		//int variable3 = 300;
		//double resultado1 = variable2 + variable3;
		//int resultado2 = (int) variable2 + variable3;
		//System.out.println("Resultado con double: " + resultado1);
		//System.out.println("Resultado con int: " + resultado2);
		
		
		int resultado = (int) variable1 + variable1Entero;
		System.out.println(resultado);
	}
}
