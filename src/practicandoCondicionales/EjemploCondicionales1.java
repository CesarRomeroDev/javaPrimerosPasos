package practicandoCondicionales;

public class EjemploCondicionales1 {
	public static void main(String[] args) {

		System.out.println("Hello");

		int edad = 17;
		int cantidad = 3;

		if (edad >= 18) {
			System.out.println("Usted SI puede entrar");
		} else {
			if (cantidad >= 2) {
				System.out.println("Es menor de edad pero esta permitido su ingreso por"
						+ "que viene acompañado por " + cantidad + " personas");
			} else
				System.out.println("Usted NO puede entrar");
		}

	}
}
