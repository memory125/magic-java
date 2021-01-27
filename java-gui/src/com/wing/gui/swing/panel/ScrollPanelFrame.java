package com.wing.gui.swing.panel;

import javax.swing.*;
import java.awt.*;

/**
 * @author memory125
 */
public class ScrollPanelFrame extends JFrame{
    public void init() {
        setTitle("ScrollPanelFrame");

        // 获取container
        Container container = getContentPane();
        container.setBackground(new Color(172, 226, 166));

        // 文本域
        JTextArea textArea = new JTextArea(20, 50);
        textArea.setText("ScrollPanelFrame");

        // 滚动面板
        JScrollPane scrollPane = new JScrollPane(textArea);
        container.add(scrollPane);

        // 设置窗口属性
        setVisible(true);
        setBounds(200,200,200,200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
