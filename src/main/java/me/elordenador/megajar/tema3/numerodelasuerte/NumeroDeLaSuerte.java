package me.elordenador.megajar.tema3.numerodelasuerte;

import me.elordenador.inpututils.InputUtils;
import me.elordenador.megajar.utils.ScrUtils;

/**
 * This algorithm will check your lucky number from your birth date.
 * @author Daniel Sánchez Úbeda
 * @version 1.0
 */
public class NumeroDeLaSuerte {
    public static void main(String[] args) {
        ScrUtils.clear();

        System.out.println("Este programa te va a pedir la fecha de nacimiento en dd/mm/aaaa y te dirá tu numero de la suerte.");
        System.out.println("Indica tu fecha de nacimiento (dd/mm/aaaa)");
        String fecha = InputUtils.inputString("> ");
        String[] partes = fecha.split("/");
        if (partes.length != 3) { // A date after the split should be a 3-element array.
            System.err.println("Separando tu texto me ha dado una cantidad de valores incorrectas, espero 3 valores, pero solo he obtenido "+partes.length+".");
            System.exit(1);
        }
        int dia, mes, ano;
        dia = 0; mes = 0; ano = 0; // El programa no compila si no lo declaro como 0 de primeras
        try {
            dia = Integer.parseInt(partes[0]);
            mes = Integer.parseInt(partes[1]);
            ano = Integer.parseInt(partes[2]);
        } catch (java.lang.NumberFormatException e) { // We NEED the values to be numbers.
            System.err.println("Uno de los valores tenia letras, por favor, decimal, que no eres un robot.");

            System.exit(1);
        }
        int numeroprincipal = dia+mes+ano;
        fecha = String.valueOf(numeroprincipal);
        partes = fecha.split("");
        numeroprincipal = 0;
        for (int i = 0; i < partes.length; i++) {
            numeroprincipal += Integer.parseInt(partes[i]);
        }

        System.out.println("Aqui esta tu numero de la suerte: "+numeroprincipal);

    }
}
