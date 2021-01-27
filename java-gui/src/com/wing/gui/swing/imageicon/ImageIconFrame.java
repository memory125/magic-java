package com.wing.gui.swing.imageicon;

import javax.swing.*;
import java.awt.*;
import java.io.File;
/**
 * @author memroy125
 */
public class ImageIconFrame extends JFrame{
    public void init() {
        // 设置窗口属性-标题
        setTitle("ImageIconFrame");
        Container container = getContentPane();
        container.setLayout(null);
        container.setBackground(new Color(220, 201, 115));

        System.out.println(ImageIconFrame.class.getClass().getResource("/").getPath());
        System.out.println(ImageIconFrame.class.getResource(""));
        System.out.println(this.getClass().getPackage());
        System.out.println(this.getClass().getClassLoader().getResource(""));
        System.out.println(System.getProperty("user.dir"));

        File file = new File("");
        System.out.println("canonicalPath = " + file.getAbsolutePath());

        // 绝对路径
        //String imagePath = "D:\\project\\java-github\\magic-java\\java-gui\\src\\com\\wing\\gui\\swing\\imageicon\\font.jpg";
        //ImageIcon imageIcon = new ImageIcon(imagePath);

        // 相对路径
        ImageIcon imageIcon = new ImageIcon(this.getClass().getResource("font.jpg"));

        // 标签
        // 创建标签
        JLabel label = new JLabel("Icon",
                imageIcon,
                SwingConstants.CENTER);
        // 设置标签大小和位置
        label.setBounds(50,50,imageIcon.getIconWidth(), imageIcon.getIconHeight());
        // 将标签添加到窗口
        container.add(label);

        // 设置窗口属性-可见
        setVisible(true);
        // 设置窗口属性-关闭监听
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        // 设置窗口属性-大小和位置
        setBounds(200,200,imageIcon.getIconWidth() + 100, imageIcon.getIconHeight() + 100);
    }
}
