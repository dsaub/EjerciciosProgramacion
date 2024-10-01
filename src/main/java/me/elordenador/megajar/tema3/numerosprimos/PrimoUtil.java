package me.elordenador.megajar.tema3.numerosprimos;

/**
 * This class is used to check Prime Numbers
 * @author Daniel Sánchez
 * @version 1.0
 */
public class PrimoUtil {
    /**
     * This method will determine if a supplied number is positive or negative
     * @author Daniel Sánchez
     * @version 1.0
     * @param n Number to check
     * @return boolean, will be true if that's a prime number, otherwise will return false.
     */
    public static boolean esPrimo(int n) {
        for (int i = 2; i < n/2+1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
