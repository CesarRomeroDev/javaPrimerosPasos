package practicandoCondicionales;

public class EjemploScope4 {

	public static void main(String[] args) {

		System.out.println("Hello");

		int edad = 21;
		int cantidadPersonas = 2;
		
		boolean esPareja;
		
		if (cantidadPersonas > 1){
			 esPareja = true;
		} else {
			 esPareja = false;
		}
		
		boolean puedeEntrar = edad >= 18 && esPareja;
		
		System.out.println("El valor de la condición es: " + esPareja);

		if ( puedeEntrar ) {
			System.out.println("Usted 'SI' puede entrar");
		} else {
				System.out.println("Usted 'NO' puede entrar");
		}

	}
}
