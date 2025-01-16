package me.elordenador.megajar.tema3.estadistica;

import me.elordenador.inpututils.IGotTextException;
import me.elordenador.inpututils.InputUtils;
import me.elordenador.megajar.utils.ScrUtils;

import java.util.ArrayList;
import java.util.Comparator;

/**
 * This algorithm will do basic statistics of 10 numbers
 * @author Daniel Sánchez Úbeda
 * @version 1.0
 */
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
        double desviacion = getDesv(list);
        System.out.println("Minimo: "+minimo);
        System.out.println("Maximo: "+maximo);
        System.out.println("Mediano: "+mediano);
        System.out.println("Promedio: "+promedio);
        System.out.println("Desviación: "+ desviacion);
    }

    /**
     * This method will return the desviation from a string
     * @param list The ArrayList with all the numbers
     * @return The Desviation number.
     */
    private static double getDesv(ArrayList<Integer> list) {
        double promedio = getProm(list);
        double number = 0;
        for (int i : list) {
            number += Math.abs(promedio-i);
        }
        number = number / list.toArray().length;
        return number;

    }

    /**
     * This method will get the average number from a list
     * @param list The ArrayList with all the numbers
     * @return The average number
     */
    private static double getProm(ArrayList<Integer> list) {
        double number = 0.0;
        for (int i : list) {
            number += i;
        }
        number = number / list.toArray().length;
        return number;
    }

    /**
     * This method will return the last number in a list. It expects to be sorted from max to min. So if that's sorted it will give the smaller number
     * @param array The ArrayList with all the numbers (preferibly sorted from max to min)
     * @return The last number in the array (the smaller number if sorted from biggest to smaller)
     */
    public static Integer getMin(ArrayList<Integer> array) {
        return array.get(array.toArray().length-1);
    }

    /**
     * This method will return the first number in a list. It expects to be sorted from max to min. So if that's sorted it will give the biggest number
     * @param array The ArrayList with all the numbers (preferibly sorted from max to min)
     * @return The last number in the array (the smaller number if sorted from biggest to smaller)
     */
    public static Integer getMax(ArrayList<Integer> array) {
        return array.get(0);
    }

    /**
     * This method will return the medium number in a list.
     * @param array The ArrayList with all the numbers
     * @return The medium number
     */
    public static int getMed(ArrayList<Integer> array) {
        int index = array.toArray().length;
        if (index % 2 == 0) {

            return (int) (Math.floor((double) index/2)/Math.floor((double) index/2)+1);
        }
        else {
            return (int) Math.floor((double) index/2);
        }
    }
}
