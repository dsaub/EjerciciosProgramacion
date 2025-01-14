package me.elordenador.megajar.tema5;

import me.elordenador.inpututils.IGotTextException;
import me.elordenador.inpututils.InputUtils;
import me.elordenador.megajar.tema5.geometria.Tester;
import me.elordenador.megajar.utils.ScrUtils;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class Tema5 {
    public static void main(String[] args) throws IGotTextException, IOException, InterruptedException, UnsupportedFlavorException {
        ScrUtils.clear();
        int option = 0;
        if (args.length == 0) {
            System.out.println("16. Sumar Cifras");
            System.out.println("17. Permutar filas");
            System.out.println("18. Sumar Matriz");
            option = InputUtils.inputInt("Seleccione: ");
        } else {
            String variable[] = args[0].split("\\.");
            option = Integer.parseInt(variable[1]);
        }

        switch (option) {
            case 8: Tester.main(args); break;
            default: System.out.println("Ese numero es incorrecto");
        }
    }
}
