package me.elordenador.megajar.tema4;

import me.elordenador.inpututils.IGotTextException;
import me.elordenador.inpututils.InputUtils;
import me.elordenador.megajar.tema4.SumarCifras.SumarCifras;
import me.elordenador.megajar.tema4.permutarfilas.PermutarFilas;
import me.elordenador.megajar.utils.ScrUtils;
import me.elordenador.megajar.tema4.sumarmatriz.SumarMatriz;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class Tema4 {
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
            case 16: SumarCifras.main(args); break;
            case 17: PermutarFilas.main(args); break;
            case 18: SumarMatriz.main(args); break;
            default: System.out.println("Ese numero es incorrecto");
        }
    }
}
