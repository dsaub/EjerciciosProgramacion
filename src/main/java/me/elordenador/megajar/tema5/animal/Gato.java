package me.elordenador.megajar.tema5.animal;

public class Gato extends Animal {
    private int vidas = 7;

    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    public Gato() {
        super();
    }

    public Gato(Gato g1) {
        super(g1);
        vidas = g1.getVidas();
    }

    public int getVidas() {
        return vidas;
    }

    public void restarVida() {
        vidas--;
    }

    public void introduceme() {
        System.out.println("Hola, soy " + getNombre() + " y tengo " + getEdad() + " años y tengo " + vidas + " vidas");
    }

    @Override
    public Gato clone() {
        return new Gato(getNombre(), getEdad());
    }

    public boolean equals(Gato gato) {
        return super.equals(gato) && vidas == gato.getVidas();
    }


}
