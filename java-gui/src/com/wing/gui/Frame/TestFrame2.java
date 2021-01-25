package com.wing.gui.Frame;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author memory125
 */
public class TestFrame2 {
    public static void main(String[] args) {
        // 创建Frame对象
        Frame frame = new Frame("Java AWT Test Frame");

        // 设置大小
        frame.setSize(400, 400);

        // 设置可见
        frame.setVisible(true);

        // 设置背景颜色
        frame.setBackground(new Color(129, 175, 201));

        // 设置起始位置
        frame.setLocation(200, 200);

        // 设置大小固定
        frame.setResizable(false);

        // 设置监听事件,通过适配器添加，比较常用的方式
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });
    }
}
