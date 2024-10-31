package me.elordenador.megajar.tema3.tresenraya;

public class Bot {
    Tablero tablero;
    String state, enemyState;
    public Bot(Tablero tablero, String state) {
        this.tablero = tablero;
        this.state = state;

        if (state.equals("O")) {
            enemyState = "X";
        } else {
            enemyState = "O";
        }
    }
    public void update(Tablero tablero) {
        this.tablero = tablero;
    }
    public Tablero play() {
        if (!regla3()) { // No se ha cumplido la primera regla, ir a la siguiente.
            if (!regla2()) {
                if (!regla1()) {
                    random();
                }
            }
        }

        return tablero;
    }

    public boolean regla1() {
        if (tablero.try_to_take(1,1, state)) return true;
        return false;
    }
    public boolean regla2() {
        // Checheo desde el centro:
        // Checkeo diagonal arriba-izquierda abajo-derecha
        if (tablero.checkState(0,0,state) && tablero.checkState(1,1,state)) {
            if (tablero.try_to_take(2,2,state)) return true;
        }
        if (tablero.checkState(0,0,state) && tablero.checkState(2,2,state)) {
            if (tablero.try_to_take(1,1,state)) return true;
        }
        if (tablero.checkState(1,1,state) && tablero.checkState(2,2,state)) {
            if (tablero.try_to_take(0,0,state)) return true;
        }

        // Checkeo diagonal arriba -> abajo
        if (tablero.checkState(1,0,state) && tablero.checkState(1,1,state)) {
            if (tablero.try_to_take(1,2,state)) return true;
        }
        if (tablero.checkState(1,0,state) && tablero.checkState(1,2,state)) {
            if (tablero.try_to_take(1,1,state)) return true;
        }
        if (tablero.checkState(1,1,state) && tablero.checkState(1,2,state)) {
            if (tablero.try_to_take(1,0,state)) return true;
        }

        // Checkeo diagonal izquierda-abajo -> derecha-arriba.
        if (tablero.checkState(2,0,state) && tablero.checkState(1,1,state)) {
            if (tablero.try_to_take(0,2,state)) return true;
        }
        if (tablero.checkState(2,0,state) && tablero.checkState(0,2,state)) {
            if (tablero.try_to_take(1,1,state)) return true;
        }
        if (tablero.checkState(1,1,state) && tablero.checkState(0,2,state)) {
            if (tablero.try_to_take(2,0,state)) return true;
        }
        // Checkeo Izquierda -> Derecha
        if (tablero.checkState(0,1,state) && tablero.checkState(1,1, state)) {
            if (tablero.try_to_take(2,1,state)) return true;
        }
        if (tablero.checkState(0,1,state) && tablero.checkState(2,1,state)) {
            if (tablero.try_to_take(1,1,state)) return true;
        }
        if (tablero.checkState(1,1,state) && tablero.checkState(2,1,state)) {
            if (tablero.try_to_take(0,1,state)) return true;
        }

        // Checkeo laterales

        // Checkeo Lateral Arriba
        if (tablero.checkState(0,0,state) && tablero.checkState(1,0,state)) {
            if (tablero.try_to_take(2,0,state)) return true;
        }
        if (tablero.checkState(0,0,state) && tablero.checkState(2,0,state)) {
            if (tablero.try_to_take(1,0,state)) return true;
        }
        if (tablero.checkState(1,0,state) && tablero.checkState(2,0,state)) {
            if (tablero.try_to_take(0,0,state)) return true;
        }

        // Checkeo Lateral Derecha
        if (tablero.checkState(2,0,state) && tablero.checkState(2,1,state)) {
            if (tablero.try_to_take(2,2,state)) return true;
        }
        if (tablero.checkState(2,0,state) && tablero.checkState(2,2,state)) {
            if (tablero.try_to_take(2,1,state)) return true;
        }
        if (tablero.checkState(2,1,state) && tablero.checkState(2,2,state)) {
            if (tablero.try_to_take(2,0,state)) return true;
        }

        // Checkeo Lateral Abajo
        if (tablero.checkState(0,2,state) && tablero.checkState(1,2,state)) {
            if (tablero.try_to_take(2,2,state)) return true;
        }
        if (tablero.checkState(0,2,state) && tablero.checkState(2,2,state)) {
            if (tablero.try_to_take(1,2,state)) return true;
        }
        if (tablero.checkState(1,2,state) && tablero.checkState(2,2,state)) {
            if (tablero.try_to_take(0,2,state)) return true;
        }

        // Checkeo Lateral Izquierda
        if (tablero.checkState(0,0,state) && tablero.checkState(1,0,state)) {
            if (tablero.try_to_take(2,0,state)) return true;
        }
        if (tablero.checkState(0,0,state) && tablero.checkState(2,0,state)) {
            if (tablero.try_to_take(1,0,state)) return true;
        }
        if (tablero.checkState(1,0,state) && tablero.checkState(2,0,state)) {
            if (tablero.try_to_take(0,0,state)) return true;
        }




        return false;
    }
    public boolean regla3() {
        // Checheo desde el centro:
        // Checkeo diagonal arriba-izquierda abajo-derecha
        if (tablero.checkState(0,0,enemyState) && tablero.checkState(1,1,enemyState)) {
            if (tablero.try_to_take(2,2,state)) return true;
        }
        if (tablero.checkState(0,0,enemyState) && tablero.checkState(2,2,enemyState)) {
            if (tablero.try_to_take(1,1,state)) return true;
        }
        if (tablero.checkState(1,1,enemyState) && tablero.checkState(2,2,enemyState)) {
            if (tablero.try_to_take(0,0,state)) return true;
        }

        // Checkeo diagonal arriba -> abajo
        if (tablero.checkState(1,0,enemyState) && tablero.checkState(1,1,enemyState)) {
            if (tablero.try_to_take(1,2,state)) return true;
        }
        if (tablero.checkState(1,0,enemyState) && tablero.checkState(1,2,enemyState)) {
            if (tablero.try_to_take(1,1,state)) return true;
        }
        if (tablero.checkState(1,1,enemyState) && tablero.checkState(1,2,enemyState)) {
            if (tablero.try_to_take(1,0,state)) return true;
        }

        // Checkeo diagonal izquierda-abajo -> derecha-arriba.
        if (tablero.checkState(2,0,enemyState) && tablero.checkState(1,1,enemyState)) {
            if (tablero.try_to_take(0,2,state)) return true;
        }
        if (tablero.checkState(2,0,enemyState) && tablero.checkState(0,2,enemyState)) {
            if (tablero.try_to_take(1,1,state)) return true;
        }
        if (tablero.checkState(1,1,enemyState) && tablero.checkState(0,2,enemyState)) {
            if (tablero.try_to_take(2,0,state)) return true;
        }
        // Checkeo Izquierda -> Derecha
        if (tablero.checkState(0,1,enemyState) && tablero.checkState(1,1, enemyState)) {
            if (tablero.try_to_take(2,1,state)) return true;
        }
        if (tablero.checkState(0,1,enemyState) && tablero.checkState(2,1,enemyState)) {
            if (tablero.try_to_take(1,1,state)) return true;
        }
        if (tablero.checkState(1,1,enemyState) && tablero.checkState(2,1,enemyState)) {
            if (tablero.try_to_take(0,1,state)) return true;
        }

        // Checkeo laterales

        // Checkeo Lateral Arriba
        if (tablero.checkState(0,0,enemyState) && tablero.checkState(1,0,enemyState)) {
            if (tablero.try_to_take(2,0,state)) return true;
        }
        if (tablero.checkState(0,0,enemyState) && tablero.checkState(2,0,enemyState)) {
            if (tablero.try_to_take(1,0,state)) return true;
        }
        if (tablero.checkState(1,0,enemyState) && tablero.checkState(2,0,enemyState)) {
            if (tablero.try_to_take(0,0,state)) return true;
        }

        // Checkeo Lateral Derecha
        if (tablero.checkState(2,0,enemyState) && tablero.checkState(2,1,enemyState)) {
            if (tablero.try_to_take(2,2,state)) return true;
        }
        if (tablero.checkState(2,0,enemyState) && tablero.checkState(2,2,enemyState)) {
            if (tablero.try_to_take(2,1,state)) return true;
        }
        if (tablero.checkState(2,1,enemyState) && tablero.checkState(2,2,enemyState)) {
            if (tablero.try_to_take(2,0,state)) return true;
        }

        // Checkeo Lateral Abajo
        if (tablero.checkState(0,2,enemyState) && tablero.checkState(1,2,enemyState)) {
            if (tablero.try_to_take(2,2,state)) return true;
        }
        if (tablero.checkState(0,2,enemyState) && tablero.checkState(2,2,enemyState)) {
            if (tablero.try_to_take(1,2,state)) return true;
        }
        if (tablero.checkState(1,2,enemyState) && tablero.checkState(2,2,enemyState)) {
            if (tablero.try_to_take(0,2,state)) return true;
        }

        // Checkeo Lateral Izquierda
        if (tablero.checkState(0,0,enemyState) && tablero.checkState(0,1,enemyState)) {
            if (tablero.try_to_take(0,2,state)) return true;
        }
        if (tablero.checkState(0,0,enemyState) && tablero.checkState(0,2,enemyState)) {
            if (tablero.try_to_take(0,1,state)) return true;
        }
        if (tablero.checkState(0,1,enemyState) && tablero.checkState(0,2,enemyState)) {
            if (tablero.try_to_take(0,0,state)) return true;
        }




        return false;
    }
    public void random() {
        boolean salida = false;
        while (!salida) {
            int x = (int)Math.floor(Math.random()*3);
            int y = (int)Math.floor(Math.random()*3);
            salida = tablero.try_to_take(x,y,state);
        }

    }
}
