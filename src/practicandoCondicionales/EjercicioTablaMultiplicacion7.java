package practicandoCondicionales;

public class EjercicioTablaMultiplicacion7 {
	
	public static void main(String[] args) {
		
		for ( int contadores = 0; contadores <= 10; contadores++ ) {
			
			for ( int multi = 0; multi <= 10; multi++ ) {
				System.out.print(contadores * multi);
				System.out.print(" ");
			}
			System.out.println();
		}
	}
}
