package com.wing.gui.swing.checkbox;

import javax.swing.*;
import java.awt.*;

/**
 * @author memory125
 */
public class CheckBoxFrame extends JFrame{
    public void init() {
        setTitle("CheckBoxFrame");

        // 获取container
        Container container = getContentPane();
        // 设置布局
        container.setLayout(new FlowLayout());
        container.setBackground(new Color(32, 215, 84, 255));

        // 复选框
        JCheckBox checkBox1 = new JCheckBox("Option1");
        JCheckBox checkBox2 = new JCheckBox("Option2");
        JCheckBox checkBox3 = new JCheckBox("Option3");

        // 添加到界面
        // 1. BorderLayout
//        container.add(option1, BorderLayout.NORTH);
//        container.add(option2, BorderLayout.CENTER);
//        container.add(option3, BorderLayout.SOUTH);

        // 2. FlowLayout
        container.add(checkBox1);
        container.add(checkBox2);
        container.add(checkBox3);

        // 设置窗口属性
        setVisible(true);
        setBounds(200,200,300,200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
