package view;

/**
 * Clase para la interfaz por consola
 */
public class Console {
    /**
     * Mensaje inicial
     */
    public void mostrarInicio() {
        System.out.println("""
                ===========================
                CREACION DE OBJETOS PRISMA
                ===========================
                """);
    }

    /**
     * Funcion para imprimir los prismas de forma mas bonita
     * @param base base del prisma
     * @param altura altura del prisma
     * @param areaTotal area total del prisma
     */
    public void mostrarPrisma(float base, float altura, float areaTotal) {
        System.out.println("Creado el objeto Prisma con: ");
        System.out.println("- Base: " + base);
        System.out.println("- Altura: " + altura);
        System.out.println("- Area total: " + areaTotal);
    }

    /**
     * Funcion para imprimir cualquier mensaje
     * @param texto String para el mensaje
     */
    public void imprimir(String texto) {
        System.out.println(texto);
    }
}
