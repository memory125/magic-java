package com.wing.gui.layout;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class BorderLayoutDemo {
    public static void main(String[] args) {
        // 创建Frame对象
        Frame frame = new Frame("BorderLayoutDemo");

        // 设置大小
        frame.setSize(400, 400);

        // 设置背景颜色
        frame.setBackground(new Color(129, 175, 201));
        // 设置起始位置
        frame.setLocation(200, 200);
        frame.setLayout(new BorderLayout());

        // 按钮
        Button button1 = new Button("Button1");
        Button button2= new Button("Button2");
        Button button3 = new Button("Button3");

        // 添加按钮
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);

        // 设置可见
        frame.setVisible(true);

        // 添加监听事件
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                super.windowClosing(e);
                System.exit(0);
            }
        });

    }
}
