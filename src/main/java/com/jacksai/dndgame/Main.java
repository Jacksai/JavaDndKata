package com.jacksai.dndgame;

import com.jacksai.dndgame.gui.GuiApplication;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        GuiApplication app = new GuiApplication();
        app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        app.setVisible(true);
    }

}
