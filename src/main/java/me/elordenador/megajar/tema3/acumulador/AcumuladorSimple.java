package me.elordenador.megajar.tema3.acumulador;

public class AcumuladorSimple {
    public static void main(String[] args) {
        int number = 0;
        System.out.println("Este programa no te va a pedir nada, va a sumar todos los numeros pares");
        for (int i = 0; i <=1000; i+=2) {
            number += i;
        }
        System.out.println("Toma tu numero: "+number);
    }
}
