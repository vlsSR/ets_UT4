/**
 * Punto de acceso y logica principal
 */
public class ProgramaComposicionCono {
    /**
     * Imprme un objeto
     * @param datos objeto
     */
    private static void imprimir (Object datos) {
        System.out.println(datos);
    }

    /**
     * Main que instancia 5 conos con radios aleatorios y los imprime
     * @param args
     */
    public static void main (String[] args) {
        java.util.Random aleatorio = new java.util.Random();
        for (int i=1; i<=5; i++) {
            int radio = aleatorio.nextInt(9)+1;
            Cono cono = new Cono(0, 0, radio, i, "Azul");
            cono.imprimir();
        }
    }
}
