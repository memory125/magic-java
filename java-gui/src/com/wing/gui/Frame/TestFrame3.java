package com.wing.gui.Frame;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author memory125
 */
public class TestFrame3 {
    public static void main(String[] args) {
        // 创建Frame对象
        Frame frame = new Frame();
        // 创建Panel对象
        Panel panel = new Panel();

        // 设置坐标
        frame.setBounds(300, 300, 500, 500);
        // 设置背景颜色
        frame.setBackground(new Color(151, 213, 56));

        // 设置布局
//        LayoutManager layoutManager = new BorderLayout();
//        Dimension dimension = layoutManager.preferredLayoutSize(new Container());
//        dimension.setSize(200, 200);
//        panel.setLayout(layoutManager);
        panel.setLayout(null);

        // 设置坐标
        panel.setBounds(50, 50,200, 200);

        // 设置Panel背景颜色
        panel.setBackground(new Color(139, 42, 34));

        // 添加Panel到Frame
        frame.add(panel);

        // 设置可见
        frame.setVisible(true);


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
