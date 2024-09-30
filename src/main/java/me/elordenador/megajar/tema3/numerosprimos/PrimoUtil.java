package me.elordenador.megajar.tema3.numerosprimos;

public class PrimoUtil {
    public static boolean esPrimo(int n) {
        for (int i = 2; i < n/2+1; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
