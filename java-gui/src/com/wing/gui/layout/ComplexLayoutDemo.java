package com.wing.gui.layout;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author memory125
 */
public class ComplexLayoutDemo {
    public static void main(String[] args) {
        Frame frame = new Frame("ComplexLayoutDemo");

        // 设置大小
        frame.setSize(400, 400);

        // 设置背景颜色
        frame.setBackground(new Color(19, 70, 165));
        // 设置起始位置
        frame.setLocation(200, 200);
        frame.setLayout(new GridLayout(2, 1));

        // 上层panel
        Panel panel1 = new Panel(new BorderLayout());
        Panel panel2 = new Panel(new GridLayout(2, 1));

        // 上面一层
        panel1.add(new Button("East1"), BorderLayout.EAST);
        panel1.add(new Button("West1"), BorderLayout.WEST);
        panel2.add(new Button("Panel-Layer1--Up"));
        panel2.add(new Button("Panel-Layer1-Down"));
        panel1.add(panel2);

        // 下面panel
        Panel panel3 = new Panel(new BorderLayout());
        Panel panel4 = new Panel(new GridLayout(2, 2));

        // 下面一层
        panel3.add(new Button("East2"), BorderLayout.EAST);
        panel3.add(new Button("West2"), BorderLayout.WEST);
        for (int i = 0; i < 4; i++) {
            panel4.add(new Button("Panel-Layer2-" + i));
        }
        panel3.add(panel4);

        // 添加到Frame显示
        frame.add(panel1);
        frame.add(panel3);

        // 设置自动填充
//        frame.pack();

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
