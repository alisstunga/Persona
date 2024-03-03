package personaPackage;
/**
 * @author Alicia
 * @version 1
 */
public class Persona {

    private int edadActual;

    public Persona(int edadActual) {
        this.edadActual = edadActual;
    }
    
    /** Attribute to indicate the current age of the person
    */
    
    public int calcularAnosHastaJubilacion() {
        return 67 - edadActual;
    }
    
    /** Method for calculating retirement age with current age
     * The retirement age is 67 years old.
     */
}