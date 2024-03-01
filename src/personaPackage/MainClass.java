package personaPackage;

import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Introduzca su edad actual: ");
			int edadActual = scanner.nextInt();

			Persona persona = new Persona(edadActual);
			int aniosHastaJubilacion = persona.calcularAnosHastaJubilacion();

			if (aniosHastaJubilacion < 10) {
			    System.out.println("¡Solo te quedan " + aniosHastaJubilacion + " años! ¡Vamos que ya queda poco!");
			} else if (aniosHastaJubilacion > 20) {
			    System.out.println("Te quedan " + aniosHastaJubilacion + " años. ¡A seguir trabajando gandul!");
			} else {
			    System.out.println("Te quedan " + aniosHastaJubilacion + " años para jubilarte.");
			}
		}
    }

}
