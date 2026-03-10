package model;

/**
 * Clase Prisma, abstraccion de un prisma real, guarda los datos
 */
public class Prisma implements Comparable<Prisma> {
    private int baseTriangulo;
    private int alturaPrisma;

    /**
     * Constructor
     * @param baseTriangulo Base del triangulo
     * @param alturaPrisma Altura del prisma
     */
    public Prisma(int baseTriangulo, int alturaPrisma) {
        this.baseTriangulo = baseTriangulo;
        this.alturaPrisma = alturaPrisma;
    }

    /**
     * Metodo que calcula la altura del triangulo
     * @return altura del triangulo
     */
    public float alturaTriangulo() {
        return (float) Math.sqrt(3)/2 * baseTriangulo;
    }

    /**
     * Metodo que calcula el area de la base
     * @return area de la base
     */
    public float areaBase() {
        return baseTriangulo * alturaTriangulo();
    }

    /**
     * Metodo que calcula el perimetro del prisma
     * @return perimetro de prisma
     */
    public float perimetro() {
        return 3 * baseTriangulo;
    }

    /**
     * Metodo que calcula el area del lateral del prisma
     * @return area del lateral
     */
    public float areaLateral() {
        return perimetro() * alturaPrisma;
    }

    /**
     * Metodo que calcula el area total del prisma
     * @return area total
     */
    public float areaTotal() {
        return 2*areaBase() + areaLateral();
    }

    public int getBaseTriangulo() {
        return baseTriangulo;
    }

    public void setBaseTriangulo(int baseTriangulo) {
        this.baseTriangulo = baseTriangulo;
    }

    public int getAlturaPrisma() {
        return alturaPrisma;
    }

    public void setAlturaPrisma(int alturaPrisma) {
        this.alturaPrisma = alturaPrisma;
    }

    /**
     * To string con la base, la altura y el area total
     * @return string del objeto
     */
    @Override
    public String toString() {
        return "Prisma: " +
                "baseTriangulo= " + baseTriangulo +
                ", alturaPrisma= " + alturaPrisma +
                ", areaTotal= " + areaTotal();
    }

    /**
     * implementacion de la interfaz comparable, ordenadno de mayor a menor area total
     * @param o the object to be compared.
     * @return objeto con area mayor
     */
    @Override
    public int compareTo(Prisma o) {
        return (int) (o.areaTotal() - this.areaTotal());
    }
}
