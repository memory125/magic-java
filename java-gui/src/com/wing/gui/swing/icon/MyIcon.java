package com.wing.gui.swing.icon;

import javax.swing.*;
import java.awt.*;

/**
 * @author memory125
 */
public class MyIcon implements Icon {
    // 宽度
    private int width;
    // 高度
    private int height;

    public MyIcon() {
    }

    public MyIcon(int width, int height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        g.setColor(new Color(220, 56, 56));
        g.fillRect(x, y, this.width, this.height);
    }

    @Override
    public int getIconWidth() {
        return width;
    }

    @Override
    public int getIconHeight() {
        return height;
    }
}