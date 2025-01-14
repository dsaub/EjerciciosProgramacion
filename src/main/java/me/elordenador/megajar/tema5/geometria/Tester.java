package me.elordenador.megajar.tema5.geometria;

public class Tester {

    public static void main(String[] args) {
        Figura figura1 = new Figura("Azul", false);
        Figura figura2 = new Figura();

        Circulo circulo1 = new Circulo();
        Circulo circulo2 = new Circulo(5.0, "Verde", true);

        Rectangulo rectangulo1 = new Rectangulo();
        Rectangulo rectangulo2 = new Rectangulo(3.0, 4.0, "Amarillo", false);
        Rectangulo rectangulo3 = new Rectangulo(3.0, 4.0);

        Cuadrado cuadrado1 = new Cuadrado();
        Cuadrado cuadrado2 = new Cuadrado(5.0, "Naranja", true);
        Cuadrado cuadrado3 = new Cuadrado(5.0);

        System.out.println(figura1);
        System.out.println(figura2);

        System.out.println(circulo1);
        System.out.println(circulo2);

        System.out.println(rectangulo1);
        System.out.println(rectangulo2);
        System.out.println(rectangulo3);

        System.out.println(cuadrado1);
        System.out.println(cuadrado2);
        System.out.println(cuadrado3);

        System.out.println("Area de circulo2: " + circulo2.getArea());
        System.out.println("Perimetro de circulo2: " + circulo2.getPerimetro());

        System.out.println("Area de rectangulo2: " + rectangulo2.getArea());
        System.out.println("Perimetro de rectangulo2: " + rectangulo2.getPerimetro());

        System.out.println("Area de cuadrado2: " + cuadrado2.getArea());
        System.out.println("Perimetro de cuadrado2: " + cuadrado2.getPerimetro());

        cuadrado2.setLado(10.0);
        System.out.println("Area de cuadrado2: " + cuadrado2.getArea());
        System.out.println("Perimetro de cuadrado2: " + cuadrado2.getPerimetro());

        cuadrado2.setAncho(20.0);
        System.out.println("Area de cuadrado2: " + cuadrado2.getArea());
        System.out.println("Perimetro de cuadrado2: " + cuadrado2.getPerimetro());

        cuadrado2.setAlto(30.0);
        System.out.println("Area de cuadrado2: " + cuadrado2.getArea());
        System.out.println("Perimetro de cuadrado2: " + cuadrado2.getPerimetro());

        System.out.println("Area de cuadrado3: " + cuadrado3.getArea());
        System.out.println("Perimetro de cuadrado3: " + cuadrado3.getPerimetro());

        cuadrado3.setLado(10.0);
        System.out.println("Area de cuadrado3: " + cuadrado3.getArea());
        System.out.println("Perimetro de cuadrado3: " + cuadrado3.getPerimetro());

        cuadrado3.setAncho(20.0);
        System.out.println("Area de cuadrado3: " + cuadrado3.getArea());
        System.out.println("Perimetro de cuadrado3: " + cuadrado3.getPerimetro());

        cuadrado3.setAlto(30.0);
        System.out.println("Area de cuadrado3: " + cuadrado3.getArea());
        System.out.println("Perimetro de cuadrado3: " + cuadrado3.getPerimetro());

        System.out.println("Area de rectangulo3: " + rectangulo3.getArea());
        System.out.println("Perimetro de rectangulo3: " + rectangulo3.getPerimetro());

        rectangulo3.setAncho(10.0);
        System.out.println("Area de rectangulo3: " + rectangulo3.getArea());
        System.out.println("Perimetro de rectangulo3: " + rectangulo3.getPerimetro());

        rectangulo3.setAlto(20.0);
        System.out.println("Area de rectangulo3: " + rectangulo3.getArea());
        System.out.println("Perimetro de rectangulo3: " + rectangulo3.getPerimetro());


    }
}
