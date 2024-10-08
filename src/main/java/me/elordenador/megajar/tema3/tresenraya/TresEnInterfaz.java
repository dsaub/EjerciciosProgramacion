package me.elordenador.megajar.tema3.tresenraya;


import me.elordenador.megajar.tema3.tresenraya.gui.Boton;

import javax.swing.*;
import java.awt.*;

public class TresEnInterfaz {
    GridLayout layout;
    JFrame frame;
    Boton[][] boton;
    public static void main(String[] args) {
        TresEnInterfaz instance = new TresEnInterfaz();
        instance.show();
    }

    public TresEnInterfaz() {
        frame = new JFrame("Tres en Raya");
        initialize();
    }
    public void initialize() {
        boton = new Boton[3][3];
        layout = new GridLayout(3,3);
        for (int x = 0; x <= 2; x++) {
            for (int y = 0; y <= 2; y++) {
                boton[x][y] = new Boton(x,y," ");
                frame.add(boton[x][y]);
            }
        }


        frame.setLayout(layout);
    }
    public void show() {
        frame.setVisible(true);
    }
}
