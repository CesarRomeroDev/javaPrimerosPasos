package javaPrimerosPasos;

public class EjemploCaracteres {
	public static void main(String[] args) {
		char caracter = 'a';  //COMILLAS SIMPLES SOLO SOPORTA UN CARACTER
		
		System.out.println(caracter);
		
		caracter = 65;		//EN LA TABLA ASCII EN NUMERI 65 ES LA LEYTRA "A"
		
		System.out.println(caracter);
		
		caracter = 65 + 1;
		
		System.out.println(caracter);
		
		char segundoCaracter = (char) (caracter + 1);
		
		System.out.println(segundoCaracter);
		
		String palabra = "Alura cusrsos online";	//PUEDE TENER MAS DE UN CARACTER O CERO CARAC
		
		System.out.println(palabra);
		
		palabra = palabra + " " + "2023";
		
		System.out.println(palabra);
	}
}
