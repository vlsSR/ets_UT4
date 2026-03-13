/**
 * Clase que representa los conos
 */
public class Cono {
    private Circulo base;
    private float altura;
    private String color;

    /**
     * Builder
     * @param cX Coordenada X del circulo
     * @param cY Coordenada Y del circulo
     * @param r Radio del circulo
     * @param h Altura del cono
     * @param color Color del cono
     */
    public Cono (float cX, float cY, float r, float h, String color) { // constructor
        this.base = new Circulo(cX, cY, r);
        this.altura = h;
        this.color = color;
    }
    public Circulo getBase() {
        return base;
    }
    public void setBase(Circulo base) {
        this.base = base;
    }
    public float getAltura() {
        return altura;
    }
    public void setAltura(float altura) {
        this.altura = altura;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    /**
     * Imprime datos del circulo y del cono
     */
    public void imprimir () {
        base.imprimir();
        System.out.println(" h=" + altura + " c=" + color);
    }
}
