package practicandoCondicionales;

public class EjemploCondicionales1_2 {
	public static void main(String[] args) {

		System.out.println("Hello");

		int edad = 21;
		int cantidadPersonas = 1;
		
		boolean esPareja = cantidadPersonas > 1;
		boolean puedeEntrar = edad >= 18 && esPareja;
		
		System.out.println("El valor de la condición es: " + esPareja);

		if ( puedeEntrar ) {
			System.out.println("Usted 'SI' puede entrar");
		} else {
				System.out.println("Usted 'NO' puede entrar");
		}

	}
}
