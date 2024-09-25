package me.elordenador.megajar.tema3.positivoynegativo;

import me.elordenador.inpututils.IGotTextException;
import me.elordenador.inpututils.InputUtils;
import me.elordenador.megajar.utils.ScrUtils;

public class Positivoynegativo {
    public static void main(String[] args) throws IGotTextException {
        ScrUtils.clear();
        System.out.println("Bienvenidos al programa de Positivo y Negativo");
        System.out.println("Este programa se trata de que usted me va a dar un numero y yo le dire si es positivo o negativo");
        System.out.println("Digame un numero");
        int numero = InputUtils.inputInt("> ");
        if (numero > 0) {
            System.out.println("Ha!, Este es un numero mayor a 0, por lo que deberia decir que es POSITIVO");
        } else if (numero < 0) {
            System.out.println("Ha!, Este es un numero menor a 0, por lo que deberia decir que es NEGATIVO");
        } else {
            System.out.println("Ha!, Este es un numero igual a 0, por lo que deberia decir que no es ni POSITIVO ni NEGATIVO");
        }

        System.out.println("He acabado, ¡Adios!");

    }
}
