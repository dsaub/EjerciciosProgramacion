package me.elordenador.megajar;

import me.elordenador.inpututils.IGotTextException;
import me.elordenador.inpututils.InputUtils;
import me.elordenador.megajar.tema3.Tema3;

public class MegaJAR {
    public static void main(String[] args) throws IGotTextException {
        printMenu();
        int option = InputUtils.inputInt("Seleccione: ");
        if (option == 1) {
            Tema3.main(args);
        }
    }

    public static void printMenu() {
        System.out.println("Menu:\n" +
                "---------------------------\n" +
                "1. Tema 3\n" +
                "\n");

    }
}
