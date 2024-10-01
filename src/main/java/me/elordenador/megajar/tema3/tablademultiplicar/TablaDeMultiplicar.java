package me.elordenador.megajar.tema3.tablademultiplicar;

import me.elordenador.inpututils.IGotTextException;
import me.elordenador.inpututils.InputUtils;
import me.elordenador.megajar.utils.ScrUtils;

/**
 * This algorithm will print the multiplication table of a number
 * @author Daniel Sánchez
 * @version 1.0
 */
public class TablaDeMultiplicar {
    public static void main(String[] args) throws IGotTextException {
        ScrUtils.clear();

        System.out.println("Este programa te pedirá un numero y te hará la tabla de multiplicar");
        System.out.println("Introduzca un numero:");
        int number = InputUtils.inputInt("> ");
        for (int i = 1; i <= 10; i++) {
            System.out.println(number+" x "+i+" = "+(number*i));
        }
    }
}
