package com.wing.gui.caculator;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @author memory125
 */
public class CaculatorFrame extends Frame {
    // 文本框
    TextField input1;
    TextField input2;
    TextField result;

    // 标签
    Label label;

    // 按钮
    Button button;

    public static void closeFrame(Frame frame) {
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    public void loadFrame() {
        input1 = new TextField(10);
        input2 = new TextField(10);
        result = new TextField(20);
        label = new Label("+");
        button = new Button("=");

        button.addActionListener(new CaculatorFrameActionListener());

        // 设置CaculatorFrame属性： 标题
        setTitle("CaculatorFrame");
        // 设置CaculatorFrame属性： 布局
        setLayout(new FlowLayout());

        add(input1);
        add(label);
        add(input2);
        add(button);
        add(result);

        // 设置CaculatorFrame属性： 启动坐标
        setLocation(400, 800);
        // 设置CaculatorFrame属性： 大小
        setSize(600, 80);

        // pack
       // pack();
        // 设置CaculatorFrame属性： 背景颜色
        setBackground(Color.ORANGE);
        // 设置CaculatorFrame属性： 可见
        setVisible(true);
        // 设置CaculatorFrame属性： 添加窗口监听事件
        closeFrame(this);
    }

    // 内部类：更加清晰，可直接调用外部类的变量
    class CaculatorFrameActionListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            long x = Long.parseLong(input1.getText());
            long y = Long.parseLong(input2.getText());

            // 将计算结果赋值到result
            result.setText(Long.toString(x + y));

            // 清空加数和被加数
            input1.setText("");
            input2.setText("");
        }
    }
}
