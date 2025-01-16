package me.elordenador.megajar.tema6;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class TablaMultiplicarFichero {
    private static Scanner sc = new Scanner(System.in);
    private static String filePath;
    private static int n;
    public static void main(String[] args) throws IOException {
        try {
            System.out.print("Fichero: ");
            filePath = sc.nextLine();
            System.out.print("Numero: ");
            n = sc.nextInt(); sc.nextLine();
        } catch (Exception e) {
            System.err.println("Hubo un error al conseguir el numero");
            sc.nextLine();
            System.exit(1);
        }
        System.out.println("> Abriendo fichero...");
        File file = new File(filePath);

        if (!file.exists()) {
            System.out.println("> El fichero no existe, creando...");
            boolean fileCreated = file.createNewFile();
            if (!fileCreated) {
                System.err.println("No se pudo crear el archivo, saliendo.");
                System.exit(23);
            }
        }

        FileOutputStream stream = new FileOutputStream(file);
        String tablaMultiplicar = "";
        System.out.println("> Generando texto...");
        for (int i = 1; i <= 10; i++) {
            System.out.println("FILE> " + n + " * " + i + " = " + (n*i));
            tablaMultiplicar += n + " * " + i + " = " + (n*i) + "\n";
        }

        System.out.println("> Convirtiendo string a un array de char");
        char[] texto = tablaMultiplicar.toCharArray();
        System.out.println("> Convirtiendo array de char a array de Byte...");
        byte[] byteArray = new byte[texto.length];

        for (int i = 0; i < texto.length; i++) {
            byteArray[i] = (byte) texto[i];
        }

        System.out.println("> Escribiendo el fichero");
        stream.write(byteArray);

        stream.close();

    }
}
