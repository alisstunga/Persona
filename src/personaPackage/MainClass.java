package personaPackage;
/**
 * @author Alicia
 * @version 1
 */
import java.util.Scanner;

public class MainClass {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
			System.out.print("Introduzca su edad actual: ");
			int edadActual = scanner.nextInt();
			
/** This method prompts the user to enter their current age,
 * calculates the years until they retire,
 * and displays a message based on the calculated years.
 */

			Persona persona = new Persona(edadActual);
			int aniosHastaJubilacion = persona.calcularAnosHastaJubilacion();
/**
 * @param person
 * @return If the number of years until retirement is less than 10,
 * a message is displayed indicating that there is little time left to retire.
 * @return If the number of years until retirement is greater than 20,
 * a message is displayed encouraging the user to keep working.
 * @return In any other case, a message is displayed indicating 
 * the number of years the user has left until retirement.
 */
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
