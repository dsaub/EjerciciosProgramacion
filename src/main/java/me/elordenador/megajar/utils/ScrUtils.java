package me.elordenador.megajar.utils;

/**
 * Screen Utils
 * @author Daniel Sánchez
 * @version 1.0
 */
public class ScrUtils {
    /**
     * Clear Screen and put the cursor at the bottom.
     * @author Daniel Sánchez
     */
    public static void clear() {
        for (int i = 0; i < 10000; i++) {
            System.out.println();
        }
    }
}
