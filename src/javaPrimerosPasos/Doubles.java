package javaPrimerosPasos;

public class Doubles {
	
	public static void main(String[] args) {
		double salario = 1250.56;			//DOUBLE: PARA TRABAJAR CON NUMEROS FLOTANTES.
		System.out.println(salario);
		
		double edad = 28;					//DOUBLE TAMBIEN SE PUEDE ASIGNAR CON UN NUMERO ENTERO.
		double salarioMitad = salario / 2;
		
		System.out.println( "El salario es: " + salarioMitad + " para los que tienen una edad de " + edad  );
		
		int division = 1250 / 3;		//EN UN CAMPO ENTERO SE PIERDE EL PUNTO DECIMAL
		
		System.out.println(division);	//PRINTLN: 416
		
		//NOTA:
		//NO SE PUEDE USAR UNA VARIABLE SIN ANTES AVERLA INICIADO.
		//EJEMPLO:
		
		//X System.out.println(division);
		//X int division = 1250 / 3;
		
		double precio = 5.5;
		int tickets = 4;
		System.out.println (precio * tickets);
	}

}
