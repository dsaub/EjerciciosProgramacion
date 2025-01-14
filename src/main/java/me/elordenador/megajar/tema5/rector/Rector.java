package me.elordenador.megajar.tema5.rector;

public class Rector extends Profesor {
    public Rector() {
        super();
    }

    public Rector(String nombre, double sueldo) {
        super(nombre, sueldo);
    }

    public double getSueldo() {
        return super.getSueldo() * 1.25;
    }

}
