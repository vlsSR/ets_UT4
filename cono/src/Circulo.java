/**
 * Clase que representa los circulos
 */
public class Circulo {
    private float x, y;
    private float radio;

    /**
     * Constructor del circulo
     * @param cX Coordenada X
     * @param cY Coordenad Y
     * @param r Radio
     */
    public Circulo (float cX, float cY, float r) { // constructor
        this.x = cX;
        this.y = cY;
        this.radio = r;
    }

    public float getX() { return x; }
    public void setX(float x) { this.x = x; }
    public float getY() { return y; }
    public void setY(float y) { this.y = y; }
    public float getRadio() { return radio; }
    public void setRadio(float radio) { this.radio = radio; }

    /**
     * Calcula el area del circulo
     * @return Pi*r²
     */
    public float area() { return (float)Math.PI*radio*radio; }

    /**
     * Imprime el circulo
     */
    public void imprimir () {
        System.out.print(" x=" + x);
        System.out.print(" y=" + y);
        System.out.print(" r=" + radio);
        System.out.print(" A=" + area());
    }
}
