package me.elordenador.megajar.tema3.omirps;

import me.elordenador.inpututils.InputUtils;
import me.elordenador.megajar.tema3.numerosprimos.PrimoUtil;
import me.elordenador.megajar.utils.ScrUtils;

/**
 * This algorithm will check if that's a prime number AND the inverse is also a prime number.
 * @author Daniel Sánchez Úbeda
 * @version 1.0
 */
public class Omirps {
    public static void main(String[] args) {
        ScrUtils.clear();

        System.out.println("Este programa te pedirá un numero y te indicará si es omirp o no");
        System.out.println("Dime un numero");
        String texto = InputUtils.inputString("> ");
        boolean isNegative;
        try {
            texto = String.valueOf(Math.abs(Integer.parseInt(texto)));
        } catch (java.lang.NumberFormatException e) {
            System.err.println("Hay letras :>");
            System.exit(0);
        }

        if (PrimoUtil.esPrimo(Integer.parseInt(texto))) {
            String[] array = texto.split("");
            texto = "";
            StringBuilder builder = new StringBuilder(texto);
            for (int i = array.length-1; i >= 0; i--) {
                builder.append(array[i]);
            }

            texto = builder.toString();
            System.out.println("Numero inverso: " + texto);
            if (PrimoUtil.esPrimo(Integer.parseInt(texto))) {
                System.out.println("Es Omirps");
            } else {
                System.out.println("Es primo pero no es Omirps");
            }
        } else {
            System.out.println("No es primo por lo que no es Omirps");
        }
    }
}
