package me.elordenador.megajar.tema6.descomponertexto;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Descomponer {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        String path, texto;
        try {
            System.out.print("Archivo: ");
            path = sc.nextLine();
            System.out.print("Texto: ");
            texto = sc.nextLine();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        String[] palabras = texto.split(" ");
        texto = "";
        StringBuilder builder = new StringBuilder(texto);
        for (String palabra : palabras) {
            builder.append(palabra);
            builder.append("\n");
        }
        texto = builder.toString();

        File archivo = new File(path);
        if (!archivo.exists()) {
            boolean fileCreated = archivo.createNewFile();
            if (!fileCreated) {
                System.err.println("No se pudo crear el archivo");
                System.exit(23);
            }
        }

        FileOutputStream out = new FileOutputStream(archivo);
        out.write(texto.getBytes());
        out.close();
    }
}
