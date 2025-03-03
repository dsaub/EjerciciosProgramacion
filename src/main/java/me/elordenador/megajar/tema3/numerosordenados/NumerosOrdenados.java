package me.elordenador.megajar.tema3.numerosordenados;

import me.elordenador.inpututils.IGotTextException;
import me.elordenador.inpututils.InputUtils;
import me.elordenador.megajar.utils.ScrUtils;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * This algorithm will ask for 3 numbers, then sort them for you.
 * @author Daniel Sánchez
 * @version 1.0
 */
public class NumerosOrdenados {
    public static void main(String[] args) throws IGotTextException {
        ScrUtils.clear();
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Este programa te va a pedir 3 cifras y te las va a ordenar de menor a mayor");
        while (list.toArray().length < 3) {
            System.out.println("Introduzca un numero");
            list.add(InputUtils.inputInt("> "));
        }
        list.sort(Comparator.naturalOrder());
        String msg = "";
        StringBuilder builder = new StringBuilder(msg);
        for (Integer i : list) {
            builder.append(i);
            builder.append(" ");
        }
        msg = builder.toString();
        System.out.println("Tus numeros ordenados: "+msg);
    }
}
