package me.elordenador.megajar.tema3.ruleta;

import java.util.Scanner;

public class Ruleta {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Machine machine = new Machine(); // Inicializamos la maquina.

        while (machine.playable()) {
            boolean fail = false;
            System.out.println("¿Cuanto dinero quieres gastar?");
            System.out.print("[1-"+machine.getCash()+"]: ");
            int money = sc.nextInt(); sc.nextLine();

            try {
                machine.take(money);

            } catch (NoMoneyException e) {
                System.out.println("!!! DINERO INSUFICIENTE !!!");
                fail = true;
            }

            if (!fail) {
                System.out.print("Apostando, dime un numero [1-20]: ");
                int numero = sc.nextInt(); sc.nextLine();
                System.out.print("Diga 'N' si apuesta a Negras y 'R' si apuesta a las Rojas: ");
                String resp = sc.nextLine().toUpperCase();

                int generatedNumber = (int) Math.floor(Math.random()*20)+1;
                int generatedColor = (int) Math.floor(Math.random()*2);
                if (generatedColor == 0 && resp.equals("N") && generatedNumber == numero) {
                    System.out.println("Has ganado");
                    machine.give(money*10);
                } else if (generatedColor == 1 && resp.equals("R") && generatedNumber == numero) {
                    System.out.println("Has ganado");
                    machine.give(money*10);
                } else {
                    System.out.println("Has perdido");
                    if (generatedColor == 0) {
                        System.out.println("Era "+generatedNumber+" negra");
                    } else {
                        System.out.println("Era "+generatedNumber+" roja");
                    }
                }
            }

        }
    }
}
