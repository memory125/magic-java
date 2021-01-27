package com.wing.gui.swing.list;

import javax.swing.*;
import java.awt.*;
import java.util.Vector;

/**
 * @author memory125
 */
public class ListFrame extends JFrame{
    public void init() {
        setTitle("ListFrame");

        // 获取container
        Container container = getContentPane();
        // 设置布局
        container.setLayout(new FlowLayout());
        container.setBackground(new Color(32, 215, 84, 255));

        // 数据vector
        Vector<String> stringVector = new Vector<>();
        stringVector.add("Shenzhen");
        stringVector.add("Beijing");
        stringVector.add("Shanghai");
        stringVector.add("Guangzhou");
        stringVector.add("Chongqing");
        stringVector.add("Chengdu");
        stringVector.add("Xi'an");
        stringVector.add("Hangzhou");
        stringVector.add("Wuhan");
        stringVector.add("Hefei");
        stringVector.add("Nanjing");

        // 列表框
        JList<String> list = new JList<>(stringVector);

        // 2. FlowLayout
        container.add(list);

        // 设置窗口属性
        setVisible(true);
        setBounds(200,200,100,300);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
