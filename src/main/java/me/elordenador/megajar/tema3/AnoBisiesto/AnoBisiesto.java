package me.elordenador.megajar.tema3.AnoBisiesto;

import me.elordenador.inpututils.IGotTextException;
import me.elordenador.inpututils.InputUtils;
import me.elordenador.megajar.utils.ScrUtils;

public class AnoBisiesto {
    public static void main(String[] args) throws IGotTextException {
        ScrUtils.clear();

        System.out.println("Este programa pedirá un año (numero) y devolverá si es bisiesto o no");
        System.out.println("Pideme un numero");
        if (esBisiesto(InputUtils.inputInt("> "))) {
            System.out.println("Este año es bisiesto");
        } else {
            System.out.println("Este año no es bisiesto");
        }
    }

    public static boolean esBisiesto(int ano) {
        if (ano % 4 == 0) {
            return ano % 100 == 0 && ano % 400 == 0;
        } else {
            return false;
        }
    }
}
