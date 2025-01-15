package me.elordenador.megajar.tema6.contarletras;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
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
            String letraUpper = String.valueOf(letra).toUpperCase();
            if (isLetter(letraUpper.toCharArray()[0])) {
                contadorMax++;
                Integer befResult = mapa.get(letraUpper);
                if (befResult == null) {
                    befResult = 0;
                }
                mapa.put(letraUpper, befResult + 1);
            }

        }

        System.out.println("Núm de caracteres del archivo: " + contadorMax);
        System.out.println("Letra      Núm de veces que aparece    Frecuencia (%)");
        System.out.println("-----------------------------------------------------");
        for (Map.Entry<String, Integer> entry : mapa.entrySet()) {
            String key = entry.getKey();
            Integer n = entry.getValue();

            // 100 - max
            // n - x

            double percentage = n * 100 / contadorMax;
            System.out.printf("%-10s %-25d %15.2f %%%n", key, n, percentage);
            //System.out.printf("%s                 %d                 %.2f%n    %%", key, n, percentage);
            //System.out.println("  " + key +".             "+n+"             " + percentage + " %");
        }
    }

    public static boolean isLetter(char letter) {
        int lettern = (int) letter;
        return lettern >= 65 && lettern <= 90;
    }
}
