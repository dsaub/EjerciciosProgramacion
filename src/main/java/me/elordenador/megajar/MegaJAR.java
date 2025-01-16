package me.elordenador.megajar;

import me.elordenador.inpututils.IGotTextException;
import me.elordenador.inpututils.InputUtils;
import me.elordenador.megajar.tema2.Tema2;
import me.elordenador.megajar.tema3.Tema3;
import me.elordenador.megajar.tema4.Tema4;
import me.elordenador.megajar.tema5.Tema5;
import me.elordenador.megajar.tema6.Tema6;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class MegaJAR {
    public static void main(String[] args) throws IGotTextException, IOException, InterruptedException, UnsupportedFlavorException {
        int option;
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
            case 4: Tema4.main(args); break;
            case 5: Tema5.main(args); break;
            case 6: Tema6.main(args); break;
            default: System.out.println("Option doesn't exist");
        }

    }

    public static void printMenu() {
        System.out.println("Menu:\n" +
                "---------------------------\n" +
                "2. Tema 2\n" +
                "3. Tema 3\n" +
                "4. Tema 4\n" +
                "5. Tema 5\n" +
                "6. Tema 6\n" +
                "\n");

    }
}
