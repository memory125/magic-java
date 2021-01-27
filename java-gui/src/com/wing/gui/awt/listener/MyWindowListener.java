package com.wing.gui.awt.listener;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * @author memory125
 */
public class MyWindowListener implements WindowListener {
    @Override
    public void windowOpened(WindowEvent e) {
        System.out.println(this.getClass() + ": windowsOpened");
    }

    @Override
    public void windowClosing(WindowEvent e) {
        System.out.println(this.getClass() + ": windowClosing");
        System.exit(0);
    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println(this.getClass() + ": windowClosed");
    }

    @Override
    public void windowIconified(WindowEvent e) {
        System.out.println(this.getClass() + ": windowIconified");
    }

    @Override
    public void windowDeiconified(WindowEvent e) {
        System.out.println(this.getClass() + ": windowDeiconified");
    }

    @Override
    public void windowActivated(WindowEvent e) {
        System.out.println(this.getClass() + ": windowActivated");
    }

    @Override
    public void windowDeactivated(WindowEvent e) {
        System.out.println(this.getClass() + ": windowDeactivated");
    }
}
