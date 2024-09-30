package me.elordenador.megajar.tema3.eratostenes;

import me.elordenador.megajar.tema3.numerosprimos.PrimoUtil;
import me.elordenador.megajar.utils.ScrUtils;

public class Eratostenes {
    public static void main(String[] args) {
        ScrUtils.clear();

        System.out.println("Este programa te va a decir los numeros primos entre 2 y 1000");
        System.out.print("Numeros primos: ");
        for (int i = 2; i < 1000; i++) {
            if (PrimoUtil.esPrimo(i)) {
                System.out.print(i+" ");
            }
        }
        System.out.println();
    }
}
