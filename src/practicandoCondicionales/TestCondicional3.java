package practicandoCondicionales;

public class TestCondicional3 {
	public static void main(String[] args) {
		System.out.println("Probando Condicionales");

		int edad = 16;
		int cantidadPersonas = 1;

		if (edad >= 18) {
			System.out.println("Tienes mas de 18 años");
			System.out.println("Bienvenido");
		}else {
			if (cantidadPersonas >= 2) {
				System.out.println("No tienes 18 años,pero puedes ingresar, porque estás acompañado");
			} else {
				System.out.println("No puedes ingresar");

			}

		}
	}
}
