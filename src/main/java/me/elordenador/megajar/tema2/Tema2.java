package me.elordenador.megajar.tema2;

import me.elordenador.megajar.tema2.temperatura.Temperatura;
import me.elordenador.megajar.utils.ScrUtils;

public class Tema2 {
    public static void main(String[] args) {
        ScrUtils.clear();

        int option = 0;
        if (args.length == 0) {
            System.out.println("Menu");
            System.out.println("1. Temperatura");
        } else {
            option = Integer.parseInt(args[0].split("\\.")[1]);

        }

        switch (option) {
            case 1: Temperatura.main(args); break;
            default: System.out.println("No se ha encontrado un ejercicio.");
        }
    }
}
