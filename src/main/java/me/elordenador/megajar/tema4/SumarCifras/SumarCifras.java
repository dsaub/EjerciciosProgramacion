package me.elordenador.megajar.tema4.SumarCifras;

import me.elordenador.megajar.comun.ManejoArray;
import me.elordenador.megajar.utils.ScrUtils;

import java.util.Scanner;

public class SumarCifras {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] matriz = new int[3][3];

        // Declaramos los numeros a 0 solamente para poder imprimirlos bien
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                matriz[f][c] = 0;
            }
        }

        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                ScrUtils.clear();
                ManejoArray.imprimirMatriz(matriz, f, c);
                System.out.println("Indique un numero");
                try {
                    matriz[f][c] = sc.nextInt();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                sc.nextLine();
            }
        }



        int[] resultadoFilas = sumarMatrizFilas(matriz);
        int[] resultadoColumnas = sumarMatrizColumnas(matriz);
        System.out.print("Filas: ");
        for (int item : resultadoFilas) {
            System.out.print(item + ",  ");
        }
        System.out.println();

        System.out.print("Columnas: ");
        for (int item : resultadoColumnas) {
            System.out.print(item + ",  ");
        }
        System.out.println();
    }

    public static int[] sumarMatrizColumnas(int[][] matriz) {
        int resultado[] = new int[matriz[0].length];
        for (int y = 0; y < matriz[0].length; y++) {
            resultado[y] = 0;
            for (int x = 0; x < matriz.length; x++) {
                resultado[y] += matriz[x][y];
            }
        }
        return resultado;
    }

    public static int[] sumarMatrizFilas(int[][] matriz) {
        int[] resultado = new int[matriz.length];
        for (int i = 0; i < matriz.length; i++) {
            resultado[i] = 0;
            for (int j = 0; j < matriz[i].length; j++) {
                resultado[i] += matriz[i][j];
            }
        }

        return resultado;
    }


}
