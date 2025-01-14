package me.elordenador.megajar.tema5.geometria;

public class Figura {
    protected String color = "Rojo";
    protected boolean relleno = true;

    public Figura() {

    }

    public Figura(String color, boolean relleno) {
        this.color = color;
        this.relleno = relleno;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean estaRelleno() {
        return relleno;
    }

    public void setRelleno(boolean relleno) {
        this.relleno = relleno;
    }

    public String toString() {
        return "Figura[color=" + color + ", relleno=" + relleno + "]";
    }


}
