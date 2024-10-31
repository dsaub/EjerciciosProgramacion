package me.elordenador.megajar.tema3.tresenraya;

public class Element {
    String state;
    int x, y;
    Tablero parent;
    public Element(Tablero parent, int x, int y)
    {
        state = " ";
        this.x = x;
        this.y = y;
        this.parent = parent;
    }

    /**
     * Returns true if someone has taken that position
     * @return boolean true if someone taken it or false if it's free.
     */
    public boolean isTaken() {
        System.out.println("Cell at position x: "+x+" y: "+y+" has state "+state);
        return !state.equals(" "); }

    /**
     * Sets a state
     * @param state The state to take in
     */
    public void setState(String state) {
        this.state = state;
    }
    public void update(Tablero array) {
        parent = array;
    }
    public String getState() {
        return state;
    }

}
