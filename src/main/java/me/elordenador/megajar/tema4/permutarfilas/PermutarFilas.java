package me.elordenador.megajar.tema4.permutarfilas;

import me.elordenador.megajar.comun.ManejoArray;
import me.elordenador.megajar.utils.ScrUtils;

import java.util.Scanner;

public class PermutarFilas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][5];
        // Declaramos los numeros a 0 solamente para poder imprimirlos bien
        for (int y = 0; y < matriz[0].length; y++) {
            for (int x = 0; x < matriz.length; x++) {
                matriz[x][y] = 0;
            }
        }

        for (int c = 0; c < matriz.length; c++) {
            for (int f = 0; f < matriz[0].length; f++) {
                ScrUtils.clear();
                ManejoArray.imprimirMatriz(matriz, c, f);
                System.out.println("Indique un numero");
                try {
                    matriz[c][f] = sc.nextInt();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                sc.nextLine();
            }
        }
        int[] aux = matriz[2];
        matriz[2] = matriz[0];
        matriz[0] = aux;

        ManejoArray.imprimirMatriz(matriz, 0, 0);



    }
}
