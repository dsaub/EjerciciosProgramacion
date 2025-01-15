package me.elordenador.megajar.tema6;



import me.elordenador.inpututils.IGotTextException;
import me.elordenador.inpututils.InputUtils;
import me.elordenador.megajar.tema6.contarletras.ContarLetras;
import me.elordenador.megajar.tema6.descomponertexto.Descomponer;
import me.elordenador.megajar.utils.ScrUtils;

import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

public class Tema6 {
    public static void main(String[] args) throws IGotTextException, IOException {
        ScrUtils.clear();
        int option = 0;
        if (args.length == 0) {
            System.out.println("1. Tabla de Multiplicar");
            System.out.println("2. Descomponer");
            option = InputUtils.inputInt("Seleccione: ");
        } else {
            String variable[] = args[0].split("\\.");
            option = Integer.parseInt(variable[1]);
        }

        switch (option) {
            case 1: TablaMultiplicarFichero.main(args); break;
            case 2: Descomponer.main(args); break;
            case 3: ContarLetras.main(args); break;
            default: System.out.println("Ese numero es incorrecto");
        }
    }
}
