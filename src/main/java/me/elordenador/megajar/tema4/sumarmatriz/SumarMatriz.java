package me.elordenador.megajar.tema4.sumarmatriz;

import me.elordenador.megajar.comun.ManejoArray;
import me.elordenador.megajar.utils.ScrUtils;

import java.util.Scanner;

public class SumarMatriz {
    private static final Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws InterruptedException {
        int[][] matriz1 = new int[5][10];
        int[][] matriz2 = new int[5][10];
        int[][] matriz3 = new int[5][10];
        generateMatriz(matriz1);
        generateMatriz(matriz2);


        for (int c = 0; c < matriz1.length; c++) {
            for (int f = 0; f < matriz1[0].length; f++) {
                ScrUtils.clear();

                matriz3[c][f] = matriz1[c][f] + matriz2[c][f];
                ManejoArray.imprimirMatriz(matriz3, c, f);
                Thread.sleep(500);
            }
        }



    }


    public static void generateMatriz(int[][] matriz) {
        for (int c = 0; c < matriz.length; c++) {
            for (int f = 0; f < matriz[c].length; f++) {
                ScrUtils.clear();
                ManejoArray.imprimirMatriz(matriz, c, f);
                int n;
                try {
                    n = sc.nextInt();
                } catch (Exception e) {
                    n = 0;
                    sc.nextLine();
                }
                matriz[c][f] = n;


            }
        }
    }
}
