package com.wing.gui.swing.game;

import javax.swing.*;
import java.awt.*;
/**
 * @author memory125
 */
public class StartGame {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        // 添加游戏面板
        frame.add(new GamePanel());

        // 设置窗口属性
        frame.setResizable(false);  // 设置窗口大小不可更改
        frame.setBounds(10,100,900,720);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
