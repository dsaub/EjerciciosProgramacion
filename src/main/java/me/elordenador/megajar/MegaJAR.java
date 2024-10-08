package me.elordenador.megajar;

import me.elordenador.inpututils.IGotTextException;
import me.elordenador.inpututils.InputUtils;
import me.elordenador.megajar.tema2.Tema2;
import me.elordenador.megajar.tema3.Tema3;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class MegaJAR {
    public static void main(String[] args) throws IGotTextException, IOException, InterruptedException, UnsupportedFlavorException {
        int option = 0;
        if (args.length == 0) { // Comprobaremos si hay algun argumento ya que si lo hay podemos ir directamente al programa sin pasar por los menus
            printMenu();
            option = InputUtils.inputInt("Seleccione: ");

        } else {
            String variable[] = args[0].split("\\.");
            option = Integer.parseInt(variable[0]);
        }

        switch (option) {
            case 2: Tema2.main(args); break;
            case 3: Tema3.main(args); break;
            default: System.out.println("Option doesn't exist");
        }

    }

    public static void printMenu() {
        System.out.println("Menu:\n" +
                "---------------------------\n" +
                "2. Tema 2\n" +
                "3. Tema 3\n" +
                "\n");

    }
}
