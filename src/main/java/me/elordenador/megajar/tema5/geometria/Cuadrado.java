package me.elordenador.megajar.tema5.geometria;

public class Cuadrado extends Rectangulo {
    public Cuadrado() {
        super();
    }

    public Cuadrado(double lado) {
        super(lado, lado);
    }

    public Cuadrado(double lado, String color, boolean relleno) {
        super(lado, lado, color, relleno);
    }

    public double getLado() {
        return ancho;
    }

    public void setLado(double lado) {
        this.ancho = lado;
        this.alto = lado;
    }

    public void setAncho(double lado) {
        this.ancho = lado;
        this.alto = lado;
    }

    public void setAlto(double lado) {
        this.ancho = lado;
        this.alto = lado;
    }

    public String toString() {
        return "Cuadrado[color=" + color + ", relleno=" + relleno + ", lado=" + ancho + "]";
    }
}
