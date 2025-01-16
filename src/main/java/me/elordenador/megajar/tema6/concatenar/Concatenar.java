package me.elordenador.megajar.tema6.concatenar;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class Concatenar {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        System.out.print("Primer archivo: ");
        String path1 = sc.nextLine();
        System.out.print("Segundo archivo: ");
        String path2 = sc.nextLine();
        System.out.print("Archivo salida: ");
        String outPath = sc.nextLine();

        File file1 = new File(path1);
        File file2 = new File(path2);
        File outFile = new File(outPath);


        if (!file1.exists() || !file2.exists()) {
            System.err.println("ERROR: Al menos uno de los dos archivos no existe");
            System.exit(1);
        }
        if (!file1.canRead() || !file2.canRead()) {
            System.err.println("ERROR: No puedo leer al menos uno de los dos archivos");
            System.exit(2);
        }

        if (!outFile.canWrite()) {
            System.err.println("ERROR: No puedo escribir en el archivo salida");
            System.exit(3);
        }
        if (!outFile.exists()) {
            boolean fileCreated = outFile.createNewFile();
            if (!fileCreated) {
                System.err.println("Error al crear el archivo");
            }
        }

        FileInputStream in1 = new FileInputStream(file1);
        FileInputStream in2 = new FileInputStream(file2);
        FileOutputStream out = new FileOutputStream(outFile);

        String texto1 = new String(in1.readAllBytes());
        String texto2 = new String(in2.readAllBytes());
        String textofinal = texto1+texto2;

        byte[] byteFinal = textofinal.getBytes();
        out.write(byteFinal);

        in1.close();
        in2.close();
        out.close();
    }
}
