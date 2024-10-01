package me.elordenador.megajar.tema3.contarcifras;

import me.elordenador.inpututils.IGotTextException;
import me.elordenador.inpututils.InputUtils;
import me.elordenador.megajar.utils.ScrUtils;

/**
 * Algorihm that couns all digits from a number on a string.
 * @author Daniel Sánchez Úbeda
 * @version 1.0
 */
public class ContarCifras {
    public static void main(String[] args) throws IGotTextException {
        ScrUtils.clear();


        System.out.println("Este programa va a contar las cifras de un numero");
        System.out.println("Dime un numero");
        String texto = String.valueOf(InputUtils.inputInt("> "));
        char[] array = texto.toCharArray();
        int contados = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != '-') {
                contados += 1;
            }
        }
        System.out.println("Las cifras de su numero es "+contados);
    }
}
