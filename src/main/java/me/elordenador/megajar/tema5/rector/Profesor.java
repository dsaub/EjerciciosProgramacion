package me.elordenador.megajar.tema5.rector;

public class Profesor {
    protected String nombre;
    protected double sueldo;

    public Profesor() {
        this.nombre = "Desconocido";
        this.sueldo = 0.0;
    }

    public Profesor(String nombre, double sueldo) {
        this.nombre = nombre;
        this.sueldo = sueldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
}
