package me.elordenador.megajar.tema3.memoria;

import me.elordenador.inpututils.IGotTextException;
import me.elordenador.inpututils.InputUtils;
import me.elordenador.megajar.utils.ScrUtils;

import java.awt.*;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;

/**
 * This algorithm is a memory game!
 * @author Daniel Sánchez
 * @version 1.0
 */
public class JuegoDeMemoria {
    public static void main(String[] args) throws InterruptedException, IOException, UnsupportedFlavorException {
        int dificultad = 0;
        System.out.println("Digame la dificultad entre el 1 al 10");
        try {
            dificultad = InputUtils.inputInt("> ");
        } catch (IGotTextException e) {
            System.out.println("Tuve texto o otra cosa, lo pondré en el modo mas facil posible.");
        }

        // GAME START
        int level = 1;
        boolean salida = false;
        String generatedNumber = "";
        while (!salida) {
            System.out.println("Nivel "+level);

            System.out.println("Generando Numero...");

            generatedNumber += String.valueOf((int) Math.floor(Math.random()*9));

            System.out.println("Aqui tienes tu numero: "+generatedNumber);
            System.out.println("Desaparecerá pronto...");
            Thread.sleep((10-dificultad)*1000);
            ScrUtils.clear();
            String clipboardData = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);
            if (clipboardData.contains(generatedNumber)) Toolkit.getDefaultToolkit().getSystemClipboard().setContents(new StringSelection("Hey tramposo, pensabas que eso iba a ir?"), null);


            System.out.println("Introduzca la serie de numeros tal y como lo he mostrado");
            String input = InputUtils.inputString("> ");
            if (input.equals(generatedNumber)) {
                System.out.println("Enhorabuena, al siguiente nivel");
                level++;
            } else {
                System.out.println("Has perdido");
                System.out.println("La secuencia era "+generatedNumber);
                salida = true;
            }

        }
    }
}
