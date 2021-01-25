package com.wing.gui.frame;

import com.wing.gui.listener.MyWindowListener;

import java.awt.*;

/**
 * @author memory125
 */
public class TestFrame {
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

        MyWindowListener myWindowListener = new MyWindowListener();
        // 设置监听事件
        frame.addWindowListener(myWindowListener);
    }
}
