package me.elordenador.megajar.tema3.paresonones;

import me.elordenador.inpututils.IGotTextException;
import me.elordenador.inpututils.InputUtils;
import me.elordenador.megajar.utils.ScrUtils;

/**
 * This algorithm will check if that is a par number or not.
 * @author Daniel Sánchez Úbeda
 * @version 1.0
 */
public class ParesONones {
    public static void main(String[] args) throws IGotTextException {
        String texto = "";
        StringBuilder builder = new StringBuilder(texto);
        int intercambio;

        ScrUtils.clear();

        System.out.println("Este programa te va a pedir dos numeros y te preguntará si quieres pares o impares.");
        System.out.println("Introduzca el primer numero");
        int primerNumero = InputUtils.inputInt("> ");
        System.out.println("Introduzca el segundo numero");
        int segundoNumero = InputUtils.inputInt("> ");
        System.out.println("Quieres pares o impares?");
        if (segundoNumero < primerNumero) {
            intercambio = primerNumero;
            primerNumero = segundoNumero;
            segundoNumero = intercambio;
        }
        String sel = InputUtils.inputString("> ").toUpperCase();
        if (sel.equals("PARES")) {
            if (primerNumero % 2 != 0) {
                primerNumero++;
            }
            for (int i = primerNumero; i <= segundoNumero; i+=2) {
                builder.append(i);
                builder.append(" ");
            }
            System.out.println("Tus numeros: "+texto);
        } else if (sel.equals("IMPARES")) {

            if (primerNumero % 2 == 0) {
                primerNumero++;
            }
            for (int i = primerNumero; i <= segundoNumero; i+=2) {
                builder.append(i);
                builder.append(" ");
            }
            texto = builder.toString();
            System.out.println("Tus numeros: "+texto);
        } else {
            System.out.println("A la proxima vez escribe PARES O IMPARES");
        }
    }
}
