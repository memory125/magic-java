package com.wing.gui.awt.layout;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
/**
 * @author memory125
 */
public class GridLayoutDemo {
    public static void main(String[] args) {
        // 创建Frame对象
        Frame frame = new Frame("GridLayoutDemo");

        // 设置大小
        frame.setSize(400, 400);
        // 设置背景颜色
        frame.setBackground(new Color(129, 175, 201));
        // 设置起始位置
        frame.setLocation(200, 200);

        // 设置布局
//        frame.setLayout(new GridLayout(2, 3, 30,20));
        frame.setLayout(new GridLayout(2, 3));

        // 按钮
        Button button1 = new Button("Button1");
        Button button2 = new Button("Button2");
        Button button3 = new Button("Button3");
        Button button4 = new Button("Button4");
        Button button5 = new Button("Button5");
        Button button6 = new Button("Button6");

        // 添加按钮
        frame.add(button1);
        frame.add(button2);
        frame.add(button3);
        frame.add(button4);
        frame.add(button5);
        frame.add(button6);

        // 自动填充大小
        frame.pack();
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
