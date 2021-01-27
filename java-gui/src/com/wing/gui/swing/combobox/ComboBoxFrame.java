package com.wing.gui.swing.combobox;

import javax.swing.*;
import java.awt.*;

/**
 * @author memory125
 */
public class ComboBoxFrame extends JFrame{
    public void init() {
        setTitle("ComboBoxFrame");

        // 获取container
        Container container = getContentPane();
        // 设置布局
        container.setLayout(new FlowLayout());
        container.setBackground(new Color(32, 215, 84, 255));

        // 下拉框
        JComboBox<String> comboBox = new JComboBox<>();
        comboBox.addItem("Option1");
        comboBox.addItem("Option2");
        comboBox.addItem("Option3");
        comboBox.addItem("Option4");
        comboBox.addItem("Option5");
        comboBox.addItem("Option6");
        comboBox.addItem("Option7");

        // 2. FlowLayout
        container.add(comboBox);

        // 设置窗口属性
        setVisible(true);
        setBounds(200,200,300,100);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
