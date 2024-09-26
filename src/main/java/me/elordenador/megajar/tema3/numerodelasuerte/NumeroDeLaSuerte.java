package me.elordenador.megajar.tema3.numerodelasuerte;

import me.elordenador.inpututils.InputUtils;
import me.elordenador.megajar.utils.ScrUtils;

public class NumeroDeLaSuerte {
    public static void main(String[] args) {
        ScrUtils.clear();

        System.out.println("Este programa te va a pedir la fecha de nacimiento en dd/mm/aaaa y te dirá tu numero de la suerte.");
        System.out.println("Indica tu fecha de nacimiento (dd/mm/aaaa)");
        String fecha = InputUtils.inputString("> ");
        String[] partes = fecha.split("/");
        if (partes.length != 3) {
            System.out.println("Separando tu texto me ha dado una cantidad de valores incorrectas, espero 3 valores, pero solo he obtenido "+partes.length+".");
            return;
        }
        int dia, mes, ano;
        try {
            dia = Integer.parseInt(partes[0]);
            mes = Integer.parseInt(partes[1]);
            ano = Integer.parseInt(partes[2]);
        } catch (java.lang.NumberFormatException e) {
            System.err.println("Uno de los valores tenia letras, por favor, decimal, que no eres un robot.");
            return;
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
