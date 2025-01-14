package me.elordenador.megajar.tema5.animal;

import java.util.ArrayList;

public class Actividad3 {
    public static void main(String[] args) {
        Animal a1 = new Animal("Betty", 3);
        Animal a2 = new Animal("Nina", 2);
        Animal a3 = new Animal();
        Animal a4 = new Animal();

        a3.setNombre("Pepe");
        a3.setEdad(4);
        a4.setNombre("Lola");
        a4.setEdad(1);


        Animal a5 = new Animal(a1);

        a1.introduceme();
        a2.introduceme();
        a3.introduceme();
        a4.introduceme();
        a5.introduceme();

        Animal.cantidadActual();

        Perro p1 = new Perro("Rex", 5, "Pastor Aleman");
        Perro p2 = new Perro();
        Perro p3 = new Perro(p1);
        Perro p4 = p1.clone();

        p2.setNombre("Luna");
        p2.setEdad(2);
        p2.setRaza("Labrador");


        p1.introduceme();
        p2.introduceme();
        Perro.cantidadActual();

        Gato g1 = new Gato("Misi", 3);
        Gato g2 = new Gato();
        g2.setNombre("Michi");
        g2.setEdad(2);

        Gato g3 = new Gato(g1);
        Gato g4 = g3.clone();
        g1.introduceme();
        g2.restarVida();
        g2.introduceme();
        g3.introduceme();
        g4.introduceme();


    }
}
