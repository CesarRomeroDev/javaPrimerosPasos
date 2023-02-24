package practicandoCondicionales;

public class eEjemploCiclos5_1 {
	public static void main(String[] args) {
		int contador = 0;
		int total = 0;
		
		while ( contador <= 10 ) { //MIENTRAS QUE (CONDICION)
			total = total + contador;
			contador ++;
		}
		System.out.println(total);
	}
}
