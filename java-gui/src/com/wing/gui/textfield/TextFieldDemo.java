package com.wing.gui.textfield;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
/**
 * @author memory125
 */
public class TextFieldDemo {
    public static void main(String[] args) {
        new TextFieldFrame();
    }
}

// TextFieldFrame实现
class TextFieldFrame extends Frame {
    public TextFieldFrame() {
        loadFrame();
    }

    public static void closeFrame(Frame frame) {
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void loadFrame() {
        // textField
        TextField textField = new TextField(20);

        textField.addActionListener(new MyTextFieldFrameActionListener());
        add(textField);

        setLocation(200,200);
        setBackground(Color.ORANGE);
        pack();

        setVisible(true);
        closeFrame(this);
    }
}

// 实现TextField的监听事件
class MyTextFieldFrameActionListener implements ActionListener {

    public MyTextFieldFrameActionListener() {
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        TextField textField = (TextField) e.getSource();
        System.out.println(textField.getText());
    }
}

