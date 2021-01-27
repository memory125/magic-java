package com.wing.gui.swing.panel;

import javax.swing.*;
import java.awt.*;

/**
 * @author memory125
 */
public class PanelFrame extends JFrame{
    public void init() {
        setTitle("PanelFrame");

        Container container = getContentPane();
        container.setLayout(new GridLayout(2, 2, 10, 10));

        JPanel panel1 = new JPanel(new GridLayout(2, 1));
        JPanel panel2 = new JPanel(new GridLayout(2, 1));
        JPanel panel3 = new JPanel(new GridLayout(1, 2));
        JPanel panel4 = new JPanel(new GridLayout(3, 2));

        panel1.add(new JButton("p1-1"));
        panel1.add(new JButton("p1-2"));
        panel2.add(new JButton("p2-1"));
        panel2.add(new JButton("p2-2"));
        panel3.add(new JButton("p3-1"));
        panel3.add(new JButton("p3-2"));
        panel4.add(new JButton("p4-1"));
        panel4.add(new JButton("p4-2"));
        panel4.add(new JButton("p4-3"));
        panel4.add(new JButton("p4-4"));
        panel4.add(new JButton("p4-5"));
        panel4.add(new JButton("p4-6"));

        container.add(panel1);
        container.add(panel2);
        container.add(panel3);
        container.add(panel4);


        setVisible(true);
        setBounds(200,200,400,400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
    }
}
