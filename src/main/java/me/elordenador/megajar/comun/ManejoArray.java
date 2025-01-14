package me.elordenador.megajar.comun;

public class ManejoArray {
    public static void imprimirMatriz(int[][] matriz, int x, int y) {
        for (int f = 0; f < matriz.length; f++) {
            for (int c = 0; c < matriz[0].length; c++) {
                if (x == f && y == c) {
                    System.out.print(">"+matriz[f][c]+"<");
                } else {
                    System.out.print(" "+matriz[f][c]+" ");
                }
                System.out.print("|");
            }
            System.out.println();
            System.out.println();

        }

    }
}
