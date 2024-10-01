package me.elordenador.megajar.tema3.notasdeclase;

import me.elordenador.inpututils.InputUtils;
import me.elordenador.megajar.utils.ScrUtils;

import java.util.ArrayList;

/**
 * This algorithm will ask you 30 notes from your students and will say how many suspended and how many approved.
 * @author Daniel Sánchez Úbeda
 * @version 1.0
 */
public class NotasDeClase {
    public static void main(String[] args) {
        int aprobados = 0;
        int suspendidos = 0;
        ArrayList<Double> notas = new ArrayList<Double>();
        ScrUtils.clear();

        System.out.println("Este programa va a solicitar 30 numeros, te dirá quienes han aprobado y quienes han suspendido");
        while (notas.toArray().length < 30) {
            System.out.println("Introduzca un numero ("+(notas.toArray().length+1)+"/30)");
            try {
                double nota = InputUtils.inputDouble("> ");
                if (nota >= 0 && nota <= 10) {
                    notas.add(nota);
                } else {
                    System.out.println("Eso esta fuera del rango");
                }
            } catch (java.lang.NumberFormatException e) {
                System.out.println("Eso es una letra??? NUMEROS!!!");
            }

        }
        for (double nota : notas) {
            if (nota >= 5.0) { aprobados++; } else { suspendidos++; }
        }
        System.out.println("Aprobados: "+aprobados);
        System.out.println("Suspendidos: "+suspendidos);
    }
}
