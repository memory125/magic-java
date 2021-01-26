package com.wing.gui.layout;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
/**
 * @author memory125
 */
public class FlowLayoutDemo {
    public static void main(String[] args) {
        // 创建Frame对象
        Frame frame = new Frame("FlowLayoutDemo");

        // 设置大小
        frame.setSize(400, 400);
        // 设置背景颜色
        frame.setBackground(new Color(129, 175, 201));
        // 设置起始位置
        frame.setLocation(200, 200);


        // 按钮
        Button east = new Button("East");
        Button west = new Button("West");
        Button south = new Button("South");
        Button north = new Button("North");
        Button center = new Button("Center");

        // 添加按钮
        frame.add(east, BorderLayout.EAST);
        frame.add(west, BorderLayout.WEST);
        frame.add(south, BorderLayout.SOUTH);
        frame.add(north, BorderLayout.NORTH);
        frame.add(center, BorderLayout.CENTER);

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
