package me.elordenador.megajar.tema5.geometria;

public class Circulo extends Figura {
    protected double radio = 1.0;

    public Circulo() {

    }

    public Circulo(double radio, String color, boolean relleno) {
        super(color, relleno);
        this.radio = radio;
    }
    public double getRadio() {
        return radio;
    }
    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getArea() {
        return Math.PI * radio * radio;
    }

    public double getPerimetro() {
        return 2 * Math.PI * radio;
    }

    public String toString() {
        return "Circulo[color=" + color + ", relleno=" + relleno + ", radio=" + radio + "]";
    }
}
