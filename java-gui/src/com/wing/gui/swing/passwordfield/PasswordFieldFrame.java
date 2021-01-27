package com.wing.gui.swing.passwordfield;

import javax.swing.*;
import java.awt.*;

/**
 * @author memory125
 */
public class PasswordFieldFrame extends JFrame{
    public void init() {
        setTitle("PasswordFieldFrame");

        // 获取container
        Container container = getContentPane();
        container.setBackground(new Color(32, 215, 84, 255));

        // 面板
        JPanel panel = new JPanel(new GridLayout(2, 1, 10, 10));

        // 密码框
        JPasswordField passwordField1 = new JPasswordField(20);
        JPasswordField passwordField2 = new JPasswordField(20);
        passwordField1.setText("Shenzhen");
        passwordField1.setEchoChar('#');
        passwordField2.setEchoChar('*');
        passwordField2.setText("Beijing");
        panel.add(passwordField1);
        panel.add(passwordField2);

        // 添加组件
        container.add(panel);

        // 设置窗口属性
        setVisible(true);
        setBounds(200,200,400,200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
