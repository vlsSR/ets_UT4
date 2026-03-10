package model;

import java.util.Random;

/**
 * Clase para gestionar los prismas de forma independiente
 */
public class PrismaManager {

    /**
     * Funcion para generar los prismas con valores aleatorios
     * @return Prisma generado
     */
    public Prisma generarPrisma () {
        return new Prisma(generarNumero(), generarNumero());
    }

    /**
     * Funcion para generar un numero aleaetorio entre 1 y 15
     * @return Int entre 1 y 15
     */
    private int generarNumero() {
        Random rand = new Random();
        return rand.nextInt(15)+1;

    }
}
