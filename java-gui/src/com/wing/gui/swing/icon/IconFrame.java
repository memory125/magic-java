package com.wing.gui.swing.icon;
import javax.swing.*;
import java.awt.*;

/**
 * @author memroy125
 */
public class IconFrame extends JFrame{
    public void init() {
        // 设置窗口属性-标题
        setTitle("IconFrame");
        Container container = getContentPane();
        container.setLayout(null);
        container.setBackground(new Color(46, 229, 154));

        // 标签
        // 创建标签
        JLabel label = new JLabel("Icon",new MyIcon(15, 15), SwingConstants.CENTER);
        // 设置标签大小和位置
        label.setBounds(50,50,120,160);
        // 将标签添加到窗口
        container.add(label);

        // 设置窗口属性-可见
        setVisible(true);
        // 设置窗口属性-关闭监听
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // 设置窗口属性-大小和位置
        setBounds(200,200,400,400);
    }
}
