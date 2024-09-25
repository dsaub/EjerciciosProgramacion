package me.elordenador.megajar.tema3.restar;

import me.elordenador.inpututils.IGotTextException;
import me.elordenador.inpututils.InputUtils;
import me.elordenador.megajar.utils.ScrUtils;

public class Restar {
    public static void main(String[] args) throws IGotTextException {
        ScrUtils.clear();

        System.out.println("Bienvenidos al programa de restar, me vas a dar dos numeros, y restare el mayor por el menor");
        System.out.println("Dame un numero: ");
        int a = InputUtils.inputInt("> ");
        System.out.println("Dame otro numero: ");
        int b = InputUtils.inputInt("> ");
        if (a > b) {
            System.out.println(a+" - "+b+" = "+(a-b));
        } else if (a < b) {
            System.out.println(b+" - "+a+" = "+(b-a));
        } else {
            System.out.println(a+" - "+b+" = 0"); //Para que me voy a molestar en hacer la operación...
        }
        System.out.println("¡Adios!");
    }
}
