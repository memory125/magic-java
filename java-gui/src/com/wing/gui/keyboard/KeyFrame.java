package com.wing.gui.keyboard;

import java.awt.*;
import java.awt.event.*;
import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author memory125
 */
public class KeyFrame extends Frame{
    // 坐标记录
    ArrayList points;

    public void loadFrame() {
     // 设置窗口属性: 标题
     setTitle("KeyFrame");
     // 设置窗口属性: 起始坐标和大小
     setBounds(200, 200, 400, 600);
     // 设置窗口属性: 可见
     setVisible(true);
     // 设置窗口属性: 背景色
     setBackground(new Color(98, 160, 126));

     points = new ArrayList<>();

     // 添加键盘监听事件
     addKeyListener(new KeyAdapter() {
         @Override
         public void keyPressed(KeyEvent e) {
             //super.keyPressed(e);
             // 获取键值
             int keyCode = e.getKeyCode();
             char keyChar = e.getKeyChar();
             System.out.println("keyCode: " + keyCode);
             System.out.println("keyChar: " + keyChar);
         }
     });

     // 添加鼠标监听事件
     addMouseListener(new MouseAdapter() {
         // 鼠标事件: 按下，弹起，桉住不放
         @Override
         public void mousePressed(MouseEvent e) {
             KeyFrame frame = (KeyFrame) e.getSource();
             // 在点击的时候，在界面上会产生一个点，
             // 这个点就是鼠标的点
             frame.addPoint(new Point(e.getX(), e.getY()));
             // 每次点击鼠标都需要重绘一次
             frame.repaint();        // 刷新
         }
     });

     // 添加窗口监听事件
     addWindowListener(new WindowAdapter() {
         @Override
         public void windowClosing(WindowEvent e) {
             System.exit(0);
         }
     });
    }

    // 添加点坐标到界面上
    public void addPoint(Point point) {
        points.add(point);
    }

    @Override
    public void paint(Graphics g) {
        // 监听鼠标事件，绘画
        Iterator iterator = points.iterator();
        while (iterator.hasNext()) {
            Point point = (Point) iterator.next();
            g.setColor(Color.RED);
            g.fillOval(point.x, point.y, 10,10);
        }
    }
}
