package me.elordenador.megajar.tema6.recomponertexto;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class RecomponerTexto {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        System.out.print("Archivo: ");
        String path = sc.nextLine();

        File file = new File(path);
        if (!file.exists()) {
            System.err.println("ERROR: El archivo no existe");
            System.exit(1);
        }
        if (file.isDirectory()) {
            System.err.println("ERROR: Estas especificando un directorio");
            System.exit(2);
        }
        if (!file.canRead()) {
            System.err.println("ERROR: No tengo permisos para leer el archivo.");
            System.exit(3);
        }

        FileInputStream in = new FileInputStream(file);

        byte[] inB = in.readAllBytes();
        String texto = new String(inB);

        texto = texto.replaceAll("\n", " ");
        System.out.println(texto);
    }
}
