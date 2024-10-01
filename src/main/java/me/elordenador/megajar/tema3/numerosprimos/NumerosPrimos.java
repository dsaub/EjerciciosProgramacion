package me.elordenador.megajar.tema3.numerosprimos;

import me.elordenador.inpututils.IGotTextException;
import me.elordenador.inpututils.InputUtils;
import me.elordenador.megajar.utils.ScrUtils;

/**
 * This algorithm will ask the user for a number and then say if that's a Prime Number.
 * @author Daniel Sánchez Úbeda
 * @version 1.0
 */
public class NumerosPrimos {
    public static void main(String[] args) throws IGotTextException {
        ScrUtils.clear();

        System.out.println("Bienvenidos al programa de numeros primos, este programa te va a solicitar un numero y te dira si es primo o no");
        System.out.println("Pideme un numero: ");
        if (PrimoUtil.esPrimo(InputUtils.inputInt("> "))) {
            System.out.println("Este numero es primo");
        } else {
            System.out.println("Este numero no es primo");
        }
    }
}
