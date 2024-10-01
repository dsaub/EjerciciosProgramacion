package me.elordenador.megajar.tema3.numerosecreto;

import me.elordenador.inpututils.IGotTextException;
import me.elordenador.inpututils.InputUtils;
import me.elordenador.megajar.utils.ScrUtils;

/**
 * This algoritm is the game of the secret number.
 * @author Daniel Sánchez Úbeda
 * @version 1.0
 */
public class NumeroSecreto {
    public static void main(String[] args) throws IGotTextException {
        ScrUtils.clear();
        int number = (int) Math.floor(Math.random()*100);
        int intentos = 0;
        boolean salida = false;
        while (!salida) {
            System.out.println("Dime un numero: ");
            try {
                int guess = InputUtils.inputInt("> ");
                if (guess == number) {
                    System.out.println("¡Enhorabuena! Has ganado");
                    System.out.println("Lo has hecho en " + intentos + " intentos");
                    salida = true;
                } else if (guess > number) {
                    System.out.println("El Numero es mas pequeño");
                    intentos++;
                } else {
                    System.out.println("El numero es mas grande");
                    intentos++;
                }
            } catch (IGotTextException e) {
                System.out.println("No te voy a sumar un intento puesto a que has puesto una letra");
            }

        }

    }
}
