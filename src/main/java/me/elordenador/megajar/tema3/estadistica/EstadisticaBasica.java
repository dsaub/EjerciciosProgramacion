package me.elordenador.megajar.tema3.estadistica;

import me.elordenador.inpututils.IGotTextException;
import me.elordenador.inpututils.InputUtils;
import me.elordenador.megajar.utils.ScrUtils;

import java.util.ArrayList;
import java.util.Comparator;

public class EstadisticaBasica {
    public static void main(String[] args) {
        ScrUtils.clear();

        System.out.println("Este programa pedira 10 numeros");
        ArrayList<Integer> list = new ArrayList<Integer>();
        while (list.toArray().length < 10) {
            try {
                System.out.println("Introduzca un numero");
                list.add(InputUtils.inputInt("> "));
            } catch (IGotTextException e) {
                System.out.println("Si me das letras no puedo transformarlo a un numero, pregunto en decimal, no en hexadecimal");
            }
        }
        list.sort(Comparator.reverseOrder());
        String texto = "";
        for (int i : list) {
            texto += i+" ";
        }
        System.out.println(texto);
        int maximo = getMax(list);
        int minimo = getMin(list);
        int mediano = getMed(list);
        double promedio = getProm(list);
        double desviacion = getDesv(list, promedio);
        System.out.println("Minimo: "+minimo);
        System.out.println("Maximo: "+maximo);
        System.out.println("Mediano: "+mediano);
        System.out.println("Promedio: "+promedio);
        System.out.println("Desviación: "+ desviacion);
    }

    private static double getDesv(ArrayList<Integer> list, double promedio) {
        double number = 0;
        for (int i : list) {
            number += Math.abs(promedio-i);
        }
        number = number / list.toArray().length;
        return number;

    }

    private static double getProm(ArrayList<Integer> list) {
        double number = 0.0;
        for (int i : list) {
            number += i;
        }
        number = number / list.toArray().length;
        return number;
    }

    public static Integer getMin(ArrayList<Integer> array) {
        return array.get(array.toArray().length-1);
    }
    public static Integer getMax(ArrayList<Integer> array) {
        return array.get(0);
    }
    public static int getMed(ArrayList<Integer> array) {
        int index = array.toArray().length;
        if (index % 2 == 0) {

            return (int) (Math.floor(index/2)/Math.floor(index/2)+1);
        }
        else {
            return (int) Math.floor(index/2);
        }
    }
}
