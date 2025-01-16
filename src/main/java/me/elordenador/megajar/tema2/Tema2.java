package me.elordenador.megajar.tema2;

import me.elordenador.inpututils.IGotTextException;
import me.elordenador.inpututils.InputUtils;
import me.elordenador.megajar.tema2.temperatura.Temperatura;
import me.elordenador.megajar.utils.ScrUtils;

public class Tema2 {
    public static void main(String[] args) throws IGotTextException {
        ScrUtils.clear();

        int option;
        if (args.length == 0) {
            System.out.println("Menu");
            System.out.println("1. Temperatura");
            option = InputUtils.inputInt("> ");
        } else {
            option = Integer.parseInt(args[0].split("\\.")[1]);

        }

        switch (option) {
            case 1: Temperatura.main(args); break;
            default: System.out.println("No se ha encontrado un ejercicio.");
        }
    }
}
