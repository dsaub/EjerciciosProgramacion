package me.elordenador.megajar.tema3.ruleta;

public class Machine {
    private int dinero;
    public Machine() {
        dinero = 100;
    }

    public int getCash() {
        return dinero;
    }

    public boolean playable() {
        return dinero > 0;
    }

    public void take(int cash) throws NoMoneyException {
        if (dinero < cash) {
            throw new NoMoneyException("No Money Left");
        }

        dinero -= cash;
    }

    public void give(int cash) {
        dinero += cash;
    }
}
