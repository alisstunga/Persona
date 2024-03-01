package personaPackage;

public class Persona {

    private int edadActual;

    public Persona(int edadActual) {
        this.edadActual = edadActual;
    }

    public int calcularAnosHastaJubilacion() {
        return 67 - edadActual;
    }
}