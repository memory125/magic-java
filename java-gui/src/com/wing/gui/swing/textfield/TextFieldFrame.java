package com.wing.gui.swing.textfield;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

/**
 * @author memory125
 */
public class TextFieldFrame extends JFrame{
    public void init() {
        setTitle("TextFieldFrame");

        // 获取container
        Container container = getContentPane();
        container.setBackground(new Color(32, 215, 84, 255));

        // 面板
        JPanel panel = new JPanel(new GridLayout(2, 1, 10, 10));

        // 文本框
        JTextField textField1 = new JTextField("Shenzhen", 10);
        JTextField textField2 = new JTextField("Beijing",10);
        panel.add(textField1);
        panel.add(textField2);

        // 添加组件
        container.add(panel);

        // 设置窗口属性
        setVisible(true);
        setBounds(200,200,400,200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
