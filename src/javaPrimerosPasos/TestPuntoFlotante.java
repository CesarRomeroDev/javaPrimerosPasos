package javaPrimerosPasos;

public class TestPuntoFlotante {
	public static void main(String[] argm) {
		double salario = 20000.70;
		System.out.println("Mi salario es: " + salario);
		
		//int valor = 12.5;		//no compile.
		//int valor2 = 0.0;		//no compile.
		//double test = 125.50;	//no compile.
		//int valor3 = test;		//no compile.
		
		int division1 = 5 / 2;				//EL TIPADO ES ENTERO
		System.out.println(division1);		//PRINTLN: 2 EL TIPADO ENTERO NO IMPRIME UN NUMERO FLOTANTE.
		
		double division = 5.0 / 2;			//EL TIPADO ES DECIMAL
		System.out.println(division);		//PRINTLN: 2.5 EL TIPADO DECIMAL IMPRIME EL NUMERO FLOTANTE
	}
}
