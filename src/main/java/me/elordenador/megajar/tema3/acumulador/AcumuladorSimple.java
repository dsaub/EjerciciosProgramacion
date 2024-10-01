package me.elordenador.megajar.tema3.acumulador;

/**
 * This algorithm only adds all numbers from 1 to 1000.
 * @author Daniel Sánchez Úbeda
 * @version 1.0
 */
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
