package me.elordenador.megajar.tema3.mayormenormediano;

import me.elordenador.inpututils.IGotTextException;
import me.elordenador.inpututils.InputUtils;
import me.elordenador.megajar.utils.ScrUtils;

import java.util.Arrays;
import java.util.Collections;

public class MayorMenorMediano {
    public static void main(String[] args) throws IGotTextException {
        ScrUtils.clear();
        Integer intArray[] = new Integer[3];
        System.out.println("Este programa te va a pedir 3 numeros, te va a calcular cual es el mayor, el menor y el mediano");
        for (int i = 0; i < 2; i++) {
            System.out.println("Dime un numero");
            intArray[i] = InputUtils.inputInt("> ");
        }

        Arrays.sort(intArray, Collections.reverseOrder());
    }
}
