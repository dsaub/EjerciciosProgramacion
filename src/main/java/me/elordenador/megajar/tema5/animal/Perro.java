package me.elordenador.megajar.tema5.animal;

public class Perro extends Animal {
    private String raza;

        public Perro(String nombre, int edad, String raza) {
            super(nombre, edad);
            this.raza = raza;
        }

        public Perro() {
            super();
            this.raza = "Desconocida";
        }

        public Perro(Perro perro) {
            super(perro);
            this.raza = perro.getRaza();
        }

        public void setRaza(String raza) {
            this.raza = raza;
        }

        public String getRaza() {
            return raza;
        }

        public Perro clone() {
            return new Perro(getNombre(), getEdad(), raza);
        }

        public String toString() {
            return super.toString() + " Raza: " + raza;
        }

        public boolean equals(Perro perro) {
            return super.equals(perro) && raza.equals(perro.getRaza());
        }

        public void introduceme() {
            System.out.println("Hola, soy " + getNombre() + " y tengo " + getEdad() + " años y soy de raza " + raza);
        }
}
