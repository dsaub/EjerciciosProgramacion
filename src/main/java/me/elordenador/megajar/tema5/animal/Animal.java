package me.elordenador.megajar.tema5.animal;

public class Animal {
    protected String nombre;
    protected int edad;
    private static int cantidad = 0;

    public static void cantidadActual() {
        System.out.println("Actualmente hay "+cantidad + " animales creados");
    }

    public Animal(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
        cantidad++;
    }
    public Animal() {
        this.nombre = "Desconocido";
        this.edad = 0;
        cantidad++;
    }

    public Animal(Animal animal) {
        this.nombre = animal.getNombre();
        this.edad = animal.getEdad();
        cantidad++;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }
    public String getNombre() {
        return nombre;
    }
    public int getEdad() {
        return edad;
    }
    public Animal clone() {
        return new Animal(nombre, edad);
    }
    public String toString() {
        return "Nombre: "+nombre+" Edad: "+edad;
    }
    public boolean equals(Animal animal) {
        return nombre.equals(animal.getNombre()) && edad == animal.getEdad();
    }

    public void introduceme() {
        System.out.println("Hola, soy "+nombre+" y tengo "+edad+" años");
    }
}
