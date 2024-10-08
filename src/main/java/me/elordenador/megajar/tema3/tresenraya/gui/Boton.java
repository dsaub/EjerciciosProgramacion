package me.elordenador.megajar.tema3.tresenraya.gui;

import javax.swing.*;

public class Boton extends JButton {
    int x, y;
    public Boton(int x, int y, String text) {
        this.x = x;
        this.y = y;
        super.setText(text);
    }
}
