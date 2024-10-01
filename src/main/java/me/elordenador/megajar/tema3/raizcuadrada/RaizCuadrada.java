package me.elordenador.megajar.tema3.raizcuadrada;

import me.elordenador.inpututils.IGotTextException;
import me.elordenador.inpututils.InputUtils;
import me.elordenador.megajar.utils.ScrUtils;

/**
 * This software will get you the square root of a number
 * @author Daniel Sánchez Úbeda
 * @version 1.0
 */
public class RaizCuadrada {
    public static void main(String[] args) throws IGotTextException {
        ScrUtils.clear();

        System.out.println("¡Buenas!, Este programa trata de que tu me vas a dar un numero y yo te haré la raiz cuadrada.");
        System.out.println("Dame un numero");
        int numero = InputUtils.inputInt("> ");
        System.out.println("Aqui tienes tu numero: "+Math.sqrt(numero)+", ¡Adios!");
    }
}
