package me.elordenador.megajar.tema3.tresenraya;

public class Tablero {
    public Element[][] tablero;
    public Tablero() {
        generateTable();
    }

    public void generateTable() {
        tablero = new Element[3][3];
        for (int x = 0; x <= 2; x++) {
            for (int y = 0; y <= 2; y++) {
                tablero[x][y] = new Element(this, x, y);
            }
        }
    }

    public void printTable() {
        System.out.println("  0   1   2");
        for (int y = 0; y <= 2; y++) {
            System.out.println(y + " " + tablero[0][y].state+" | "+tablero[1][y].state+" | "+tablero[2][y].state);
            System.out.println(" ---+---+--");
        }
    }

    public boolean try_to_take(int x, int y, String state) {
        if (tablero[x][y].isTaken()) {
            return false;
        } else {
            tablero[x][y].setState(state);
            return true;
        }
    }

    public boolean checkState(int x, int y, String state) {
        return getCell(x,y).state.equals(state);
    }

    public Element getCell(int x, int y) {
        return tablero[x][y];
    }


    public void updateTablero() {
        for (int x1 = 0; x1 <= 2; x1++) {
            for (int y1 = 0; y1 <= 2; y1++) {
                tablero[x1][y1].update(this);
            }
        }
    }
    public String getWinner() {
        //Checkeo basico (el centro)

        if (!getCell(1,1).state.equals(" ")) { // No nos vamos a molestar en checkear todas las lineas que pasan por el centro si no hay nada en el centro
            String state = getCell(1,1).state;
            if (getCell(0,0).state.equals(state) && getCell(2,2).state.equals(state)) {
                return state;
            }
            if (getCell(1,0).state.equals(state) && getCell(1,2).state.equals(state)) {
                return state;
            }
            if (getCell(2,0).state.equals(state) && getCell(0,2).state.equals(state)) {
                return state;
            }
            if (getCell(0,1).state.equals(state) && getCell(2,1).state.equals(state)) {
                return state;
            }

        }

        // Upper Check;
        if (!getCell(1,0).state.equals(" ")) {
            String state = getCell(1, 0).state;
            if (getCell(0,0).state.equals(state) && getCell(2,0).state.equals(state)) {
                return state;
            }

        }
        if (!getCell(0,1).state.equals(" ")) {
            String state = getCell(0,1).state;
            if (getCell(0,0).state.equals(state) && getCell(0,2).state.equals(state)) {
                return state;
            }
        }
        if (!getCell(1,2).state.equals(" ")) {
            String state = getCell(1, 2).state;
            if (getCell(0,2).state.equals(state) && getCell(0,2).state.equals(state)) {
                return getCell(1,2).state;
            }
        }
        if (!getCell(2,1).state.equals(" ")) {
            String state = getCell(2, 1).state;
            if (getCell(2,0).state.equals(state) && getCell(2,2).state.equals(state)) {
                return state;
            }
        }
        return " ";
    }
}
