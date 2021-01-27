package com.wing.gui.swing.button;

import javax.swing.*;
import java.awt.*;

/**
 * @author memory125
 */
public class RadioButtonFrame extends JFrame{
    public void init() {
        setTitle("RadioButtonFrame");

        // 获取container
        Container container = getContentPane();
        // 设置布局
        container.setLayout(new FlowLayout());
        container.setBackground(new Color(32, 215, 84, 255));

        // 单选按钮
        JRadioButton option1 = new JRadioButton("Option1");
        JRadioButton option2 = new JRadioButton("Option2");
        JRadioButton option3 = new JRadioButton("Option3");

        // 按钮组
        // 添加到按钮组，只能选择一个
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(option1);
        buttonGroup.add(option2);
        buttonGroup.add(option3);

        // 添加到界面
        // 1. BorderLayout
//        container.add(option1, BorderLayout.NORTH);
//        container.add(option2, BorderLayout.CENTER);
//        container.add(option3, BorderLayout.SOUTH);

        // 2. FlowLayout
        container.add(option1);
        container.add(option2);
        container.add(option3);

        // 设置窗口属性
        setVisible(true);
        setBounds(200,200,200,200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
