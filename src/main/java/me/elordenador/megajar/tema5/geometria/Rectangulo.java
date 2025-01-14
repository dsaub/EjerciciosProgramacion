package me.elordenador.megajar.tema5.geometria;

public class Rectangulo extends Figura {
    protected double ancho;
    protected double alto;

    public Rectangulo() {
        super();
        this.ancho = 1.0;
        this.alto = 1.0;
    }

    public Rectangulo(double ancho, double alto) {
        super();
        this.ancho = ancho;
        this.alto = alto;
    }

    public Rectangulo(double ancho, double alto, String color, boolean relleno) {
        super(color, relleno);
        this.ancho = ancho;
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public double getArea() {
        return ancho * alto;
    }

    public double getPerimetro() {
        return 2 * (ancho + alto);
    }

    public String toString() {
        return "Rectangulo[color=" + color + ", relleno=" + relleno + ", ancho=" + ancho + ", alto=" + alto + "]";
    }
}
