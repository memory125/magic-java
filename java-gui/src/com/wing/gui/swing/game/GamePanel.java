package com.wing.gui.swing.game;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Random;

/**
 * @author memory125
 */
public class GamePanel extends JPanel implements KeyListener, ActionListener {
    // 蛇的长度
    int length;
    // 蛇的坐标X
    int[] snakeX = new int[600];
    // 蛇的坐标Y
    int[] snakeY = new int[500];
    // 方向："R":right;"D":down;"U":up;"L":Left;
    String fx;
    // 游戏开始状态
    boolean isStart = false;
    // 定时器
    Timer timer = new Timer(100,this);

    // 食物坐标
    int foodX;
    int foodY;
    // 生成随机坐标
    Random random = new Random() ;

    // 死亡判断
    boolean isfail = false;

    //积分
    int score;

    //构造器
    public GamePanel(){
        init();
        // 获取键盘的监听事件
        // 设置panel焦点
        this.setFocusable(true);
        // 添加键盘事件监听事件
        this.addKeyListener(this);
        // 定时器开始
        timer.start();
    }

    //初始化
    public void init(){
        // 初始长度
        length = 3;
        snakeX[0] = 100;
        snakeY[0] = 100;//头
        snakeX[1] = 75;
        snakeY[1] = 100;//第一个身体
        snakeX[2] = 50;
        snakeY[2] = 100;//第二个身体

        // 方向默认向右
        fx = "R";
        // 食物坐标，随机生成，必须在整个panel内
        foodX = 25 + 25 * random.nextInt(34);
        foodY = 75 + 25 * random.nextInt(24);
        // 积分
        score = 0;
    }

    // 绘制面板，所有的界面操作都在这里完成
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        // 设置背景颜色
        this.setBackground(Color.white);
        // 绘制
        GameResource.header.paintIcon(this,g,25,11);
        g.fillRect(25,75,850,600);//绘制游戏区域

        //画一条静态的小蛇
        if(fx.equals("R")){
            GameResource.right.paintIcon(this,g,snakeX[0],snakeY[0]);
        }
        if(fx.equals("D")){
            GameResource.down.paintIcon(this,g,snakeX[0],snakeY[0]);
        }
        if(fx.equals("U")){
            GameResource.up.paintIcon(this,g,snakeX[0],snakeY[0]);
        }
        if(fx.equals("L")){
            GameResource.left.paintIcon(this,g,snakeX[0],snakeY[0]);
        }

        //通过控制length的长度来控制小蛇的长度
        for (int i = 1; i < length; i++) {
            GameResource.body.paintIcon(this,g,snakeX[i],snakeY[i]);
        }

        //画积分
        g.setColor(Color.white);
        g.setFont(new Font("楷体",Font.BOLD,16));
        g.drawString("长度"+length,750,35);
        g.drawString("分数"+score,750,55);

        //画食物
        GameResource.food.paintIcon(this,g,foodX,foodY);
        if(snakeX[0]==foodX && snakeY[0]==foodY){
            //小蛇长度+1
            length++;
            //积分+10
            score += 10;
            foodX = 25 + 25*random.nextInt(34);
            foodY = 75 + 25*random.nextInt(24);
        }

        //画开始文字
        if(isStart == false){
            g.setColor(Color.white);
            g.setFont(new Font("楷体",Font.BOLD,40));//设置字体
            g.drawString("按下空格开始游戏",300,300);
        }

        //画失败文字
        if(isfail){
            g.setColor(Color.RED);
            g.setFont(new Font("楷体",Font.BOLD,40));//设置字体
            g.drawString("游戏失败,按下空格开始游戏",200,300);
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (isStart && isfail == false) {//如果游戏开始,且游戏没有失败
            //右移
            for (int i = length - 1; i > 0; i--) {
                snakeX[i] = snakeX[i - 1];
                snakeY[i] = snakeY[i - 1];
            }
            if (fx.equals("R")) {
                snakeX[0] = snakeX[0] + 25;
                //小蛇碰墙循环
                if (snakeX[0] > 850) {
                    snakeX[0] = 25;
                }
            } else if (fx.equals("L")) {
                snakeX[0] = snakeX[0] - 25;
                //小蛇碰墙循环
                if (snakeX[0] < 25) {
                    snakeX[0] = 850;
                }
            } else if (fx.equals("U")) {
                snakeY[0] = snakeY[0] - 25;
                //小蛇碰墙循环
                if (snakeY[0] < 75) {
                    snakeY[0] = 650;
                }
            } else if (fx.equals("D")) {
                snakeY[0] = snakeY[0] + 25;
                //小蛇碰墙循环
                if (snakeY[0] > 650) {
                    snakeY[0] = 75;
                }
            }
            //碰撞检测---小蛇头和身体
            for (int i = 1; i < length; i++) {
                if (snakeX[0] == snakeX[i] && snakeY[0] == snakeY[i]) {
                    isfail = true;
                }
            }
            //碰撞检测--小蛇头和墙壁
            if ((snakeX[0]<25 || snakeX[0]>850)||(snakeY[0]<75 || snakeY[0]>650 ) ){
                isfail = true;
            }
            repaint();//刷新界面
        }
        timer.start();
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //获取键盘按下的是哪个按键
        int keyCode = e.getKeyCode();
        //判断按键与设定的按键是否一致
        if(keyCode == KeyEvent.VK_SPACE){
            if(isfail){//失败,再来一遍
                isfail = false;
                init();
            }else{//暂停游戏
                isStart = !isStart;
            }
            repaint();//刷新界面
        }
        //监听键盘按键,头部变换方向(图片)
        //小蛇不能掉头
        if(keyCode == KeyEvent.VK_LEFT){
            if(fx.equals("R")){
                fx = "R";
            }else{
                fx = "L";
            }
        } else if (keyCode == KeyEvent.VK_RIGHT){
            if(fx.equals("L")){
                fx = "L";
            }else{
                fx = "R";
            }
        }if(keyCode == KeyEvent.VK_UP){
            if(fx.equals("D")){
                fx = "D";
            }else{
                fx = "U";
            }
        } else if (keyCode == KeyEvent.VK_DOWN){
            if(fx.equals("U")){
                fx = "U";
            }else{
                fx = "D";
            }
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }
}
