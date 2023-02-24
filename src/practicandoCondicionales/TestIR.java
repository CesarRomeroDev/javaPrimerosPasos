package practicandoCondicionales;

public class TestIR {
	public static void main(String[] argm){
		double salarioMensual = 3751.01; 
		
		if ( salarioMensual >= 1900.0 && salarioMensual <= 2800.0 ) {
			System.out.println("Tu salario es de: "+ salarioMensual + " tu IR es de 7.5% y tu "
					+ "declaración del monto es: 142");
		}else if(salarioMensual >= 2800.1 && salarioMensual <= 3751.0){
			System.out.println("Tu salario es de: "+ salarioMensual + " tu IR es de 15% y tu "
					+ "declaración del monto es: 350");
		}else if(salarioMensual >= 3751.01 && salarioMensual <= 4664.00){
			System.out.println("Tu salario es de: "+ salarioMensual + " tu IR es de 22.5% y tu "
					+ "declaración del monto es: 636");
		}else {
			System.out.println("Fuera de rango");
		}
	}
}
