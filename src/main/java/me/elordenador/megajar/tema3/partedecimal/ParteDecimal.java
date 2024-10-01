package me.elordenador.megajar.tema3.partedecimal;

import me.elordenador.inpututils.InputUtils;
import me.elordenador.megajar.utils.ScrUtils;

/**
 * This algorithm will ask you if the supplied number haves a decimal part
 * @author Daniel Sánchez Úbeda
 * @version 1.0
 */
public class ParteDecimal {
    public static void main(String[] args) {
        ScrUtils.clear();

        System.out.println("Este programa te va a pedir un numero real y te va a calcular si es decimal o no");
        System.out.println("Dime un numero real");
        double number = InputUtils.inputDouble("> ");
        if (Math.round(number) == number) {
            System.out.println("No es decimal");
        } else {
            System.out.println("Es Decimal");
        }
    }
}
