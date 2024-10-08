package me.elordenador.megajar.tema2.temperatura;

import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Numero> ");
        double number = sc.nextDouble(); sc.nextLine();
        System.out.print("Farenheit o Celsius? [C:f]: ");
        String response = sc.nextLine();
        if (response.toUpperCase().equals("F")) {
            System.out.println("El numero es: "+TempUtils.toCelsius(number));
        } else {
            System.out.println("El numero es: "+TempUtils.toFarenheit(number));
        }
    }
}
