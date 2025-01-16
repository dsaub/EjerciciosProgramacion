package me.elordenador.megajar.tema3.tresenraya;

import me.elordenador.inpututils.IGotTextException;
import me.elordenador.inpututils.InputUtils;
import me.elordenador.megajar.utils.ScrUtils;

/**
 * This algorithm is a full game
 * @author Daniel Sánchez Úbeda
 * @version 1.0
 */


public class TresEnRaya {
    Tablero tablero;
    public static void main(String[] args) throws IGotTextException {
        ScrUtils.clear();
        TresEnRaya instance = new TresEnRaya();
        System.out.println("Modo de juego");
        System.out.println("1. Jugador vs Jugador");
        System.out.println("2. Jugador vs Maquina (Malardo)");
        System.out.println("3. Jugador vs Maquina");
        System.out.println("4. GUI");

        int input = InputUtils.inputInt("> ");
        switch (input) {
            case 1: instance.twoPlayers(); break;
            case 2: instance.maquinamalarda(); break;
            case 3: instance.maquina(); break;
            case 4: TresEnInterfaz.main(args); break;
        }
    }



    public TresEnRaya() {
        tablero = new Tablero();
    }





    public void twoPlayers() {
        boolean salida = false;
        boolean firstTurn = true;
        // Este bucle solo terminará cuando salida sea true
        while (!salida) {
            // Inicializaremos el estado.
            String state;
            if (firstTurn) {
                state = "X";
            } else {
                state = "O";
            }
            ScrUtils.clear();

            // Inicia el jugador correspondiente al estado actual
            tablero.printTable();
            System.out.println("Turno del jugador "+state);

            // Pedimos las coordenadas y las convertimos a 2 variables.
            System.out.println("Dime las coordenadas X y Y separadas por coma sin espacio (x,y)");
            String coordenadas = InputUtils.inputString("> ");
            String[] coordenadas_sep = coordenadas.split(",");
            int x = Integer.parseInt(coordenadas_sep[0]);
            int y = Integer.parseInt(coordenadas_sep[1]);

            // Intentamos tomar esa posición, si la tomamos correctamente, colocamos firstTurn a lo contrario para que cuando repita este bucle, sea el turno del otro jugador
            if (tablero.try_to_take(x,y,state)) {
                firstTurn = !firstTurn;
            } else { // Este caso significa que ya hay alguien ahi, en este caso le decimos que intente de nuevo y vuelve a su turno.
                System.out.println("Ya esta tomado esa posición, intentalo de nuevo");
            }

            // Actualizamos el GANAR

            tablero.updateTablero();
            String winner = tablero.getWinner();
            if (!winner.equals(" ")) {
                System.out.println("GANADOR: "+winner);
                salida = true;
            }
            if (!salida) {
                int vacios = 0;
                for (int x1 = 0; x1 <= 2; x1++) {
                    for (int y1 = 0; y1<= y; y1++) {

                        if (!tablero.getCell(x1,y1).isTaken()) {
                            vacios++;
                        }
                    }
                }
                if (vacios == 0) {
                    System.out.println("Hay tablas");
                    salida = true;
                }
            }


        }

    }
    private void maquinamalarda() {
        boolean salida = false;
        boolean firstTurn = true;

        while (!salida) {
            String state;
            if (firstTurn) {
                state = "X";
            } else {
                state = "O";
            }
            ScrUtils.clear();
            tablero.printTable();
            int x;
            int y = 0;
            System.out.println("Turno del jugador "+state);
            System.out.println("Dime las coordenadas X y Y separadas por coma sin espacio (x,y)");
            if (!state.equals("O")) {
                String coordenadas = InputUtils.inputString("> ");
                String[] coordenadas_sep = coordenadas.split(",");
                x = Integer.parseInt(coordenadas_sep[0]);
                y = Integer.parseInt(coordenadas_sep[1]);
                if (tablero.getCell(x,y).isTaken()) {
                    System.out.println("Han tomado esa posición, intentalo de nuevo");
                } else {
                    tablero.getCell(x,y).setState(state);
                    firstTurn = false;
                }
            } else {
                boolean salida2 = false;
                while (!salida2) {
                    x = (int) Math.floor(Math.random()*2);
                    y = (int) Math.floor(Math.random()*2);
                    if (tablero.try_to_take(x,y,state)) {
                        firstTurn = true;
                        salida2 = true;
                    }
                }

            }



            tablero.updateTablero();
            String winner = tablero.getWinner();
            if (!winner.equals(" ")) {
                System.out.println("GANADOR: "+winner);
                salida = true;
            }
            if (!salida) {
                int vacios = 0;
                for (int x1 = 0; x1 <= 2; x1++) {
                    for (int y1 = 0; y1<= y; y1++) {

                        if (!tablero.getCell(x1,y1).isTaken()) {
                            vacios++;
                        }
                    }
                }
                if (vacios == 0) {
                    System.out.println("Hay tablas");
                    salida = true;
                }
            }



        }
    }

    private void maquina() {

        Bot botardo = new Bot(tablero, "O");

        boolean salida = false;
        boolean firstTurn = true;

        while (!salida) {
            String state;
            if (firstTurn) {
                state = "X";
            } else {
                state = "O";
            }
            ScrUtils.clear();
            tablero.printTable();
            int x;
            int y = 0;
            System.out.println("Turno del jugador "+state);
            System.out.println("Dime las coordenadas X y Y separadas por coma sin espacio (x,y)");
            if (!state.equals("O")) {
                String coordenadas = InputUtils.inputString("> ");
                String[] coordenadas_sep = coordenadas.split(",");
                x = Integer.parseInt(coordenadas_sep[0]);
                y = Integer.parseInt(coordenadas_sep[1]);
                if (tablero.try_to_take(x,y, state)) {
                    firstTurn = false;
                } else {
                    System.out.println("Han tomado esa posición, intentalo de nuevo");
                }
            } else {
                botardo.update(tablero);
                tablero = botardo.play();
                firstTurn = true;
            }



            tablero.updateTablero();
            String winner = tablero.getWinner();
            if (!winner.equals(" ")) {
                System.out.println("GANADOR: "+winner);
                salida = true;
            }
            if (!salida) {
                int vacios = 0;
                for (int x1 = 0; x1 <= 2; x1++) {
                    for (int y1 = 0; y1 <= y; y1++) {

                        if (!tablero.getCell(x1, y1).isTaken()) {
                            vacios++;
                        }
                    }
                }
                if (vacios == 0) {
                    tablero.printTable();
                    System.out.println("Hay tablas");
                    salida = true;
                }
            }


        }

    }
}
