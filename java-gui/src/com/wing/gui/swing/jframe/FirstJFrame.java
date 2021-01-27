package com.wing.gui.swing.jframe;

import javax.swing.*;
import java.awt.*;
/**
 * @author memory125
 */
public class FirstJFrame {
    public void init() {
        // 创建窗口
        JFrame jFrame = new JFrame("FirstJFrame");
        // 设置窗口属性
        jFrame.setBounds(200,200,400,400);
        jFrame.setVisible(true);

        // 设置背景颜色
        Container contentPane = jFrame.getContentPane();
        contentPane.setBackground(new Color(31, 227, 117));

        // 设置默认关闭事件
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
