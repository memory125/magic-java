package com.wing.gui.swing.jframe;

import javax.swing.*;
import java.awt.*;
/**
 * @author memory125
 */
public class FirstJFrame extends JFrame {
    public void init() {
        // 设置窗口标题
        setTitle("FirstJFrame");
        // 设置窗口属性
        setBounds(200,200,400,400);
        setVisible(true);

        // 设置背景颜色
        Container contentPane = getContentPane();
        contentPane.setBackground(new Color(31, 227, 117));

        // 设置默认关闭事件
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
