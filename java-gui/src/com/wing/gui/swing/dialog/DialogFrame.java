package com.wing.gui.swing.dialog;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * @author memory125
 */
public class DialogFrame extends JFrame{

    //JDialog jDialog;

    public void init() {
        setBounds(200,200,400,400);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);

        Container container = getContentPane();
        container.setBackground(new Color(118, 229, 182));
        container.setLayout(null);

        // 按钮
        JButton popupButton = new JButton("Popup");
        popupButton.setBounds(30,30,80,60);
        popupButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JDialog jDialog = new JDialog();
                jDialog.setTitle("Popup Dialog");
                jDialog.setVisible(true);
                jDialog.setBounds(300,300, 200,200);
                // JDialog已经默认有EXIT_ON_CLOSE属性
                //jDialog.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
                //jDialog.dispose();
            }
        });
        container.add(popupButton);
    }
}
