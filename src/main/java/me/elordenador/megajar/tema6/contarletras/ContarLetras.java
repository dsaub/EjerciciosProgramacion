package me.elordenador.megajar.tema6.contarletras;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;

public class ContarLetras {
    private static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws IOException {
        String path;


        System.out.print("Archivo: ");
        path = sc.nextLine();

        File file = new File(path);
        FileInputStream in = new FileInputStream(file);
        byte[] textoEnBytes = in.readAllBytes();
        String texto = new String(textoEnBytes);
        char[] charArray = texto.toCharArray();
        int contadorMax = 0;
        HashMap<String, Integer> mapa = new HashMap<String, Integer>();
        for (char letra : charArray) {

        }
    }
}
