package com.wing.gui.swing.game;

import javax.swing.*;
import java.net.URL;

public class GameResource {
    //头部
    public static URL headerURL = GameResource.class.getResource("statics/header.png");
    public static ImageIcon header = new ImageIcon(headerURL);
    //贪吃蛇 头部上下左右
    public static URL upURL = GameResource.class.getResource("statics/up.png");
    public static URL downURL = GameResource.class.getResource("statics/down.png");
    public static URL leftURL = GameResource.class.getResource("statics/left.png");
    public static URL rightURL = GameResource.class.getResource("statics/right.png");
    public static ImageIcon up = new ImageIcon(upURL);//上
    public static ImageIcon down = new ImageIcon(downURL);//下
    public static ImageIcon left = new ImageIcon(leftURL);//左
    public static ImageIcon right = new ImageIcon(rightURL);//右
    //身体
    public static URL bodyURL = GameResource.class.getResource("statics/body.png");
    public static ImageIcon body = new ImageIcon(bodyURL);
    //食物
    public static URL foodURL = GameResource.class.getResource("statics/food.png");
    public static ImageIcon food = new ImageIcon(foodURL);
}
