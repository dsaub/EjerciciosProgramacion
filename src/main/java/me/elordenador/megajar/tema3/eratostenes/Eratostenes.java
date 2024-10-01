package me.elordenador.megajar.tema3.eratostenes;

import me.elordenador.megajar.tema3.numerosprimos.PrimoUtil;
import me.elordenador.megajar.utils.ScrUtils;

/**
 * This algotithm makes use of Prime Number Utils to get the all the Prime numbers from 2 to 1000.
 * @author Daniel Sánchez
 * @version 1.0
 */
public class Eratostenes {
    public static void main(String[] args) {
        ScrUtils.clear();

        System.out.println("Este programa te va a decir los numeros primos entre 2 y 1000");
        System.out.print("Numeros primos: ");
        for (int i = 2; i < 1000; i++) { // For every number will check if it's a prime number and then will print it to the screen if that's the case.
            if (PrimoUtil.esPrimo(i)) {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
}
