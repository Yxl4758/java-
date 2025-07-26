package com.shoot;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.util.Arrays;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

/**
 * 1. 定义一个游戏启动类型，同时作为GUI编程的JPanel，即游戏挂面。因此要实现JPanel
 * 2. 创建一个文件夹于src并列存在，放入图片资源，标记为资源根文件夹
 * */
public class Main extends JPanel {
    //别的类中也可能需要面板的宽和高，可以定义为常量
    public static final int WIDTH = 400;
    public static final int HEIGHT = 625;

    //定义状态属性
    public static State currentState = State.READY;

    //定义图片属性
    public static BufferedImage background;
    public static BufferedImage bullet;
    public static BufferedImage bee;
    public static BufferedImage airplane;
    public static BufferedImage gameover;
    public static BufferedImage hero0;
    public static BufferedImage hero1;
    public static BufferedImage pause;
    public static BufferedImage start;
    static{
        try {
            background = ImageIO.read(Main.class.getClassLoader().getResourceAsStream("background.png"));
            bullet = ImageIO.read(Main.class.getClassLoader().getResourceAsStream("bullet.png"));
            bee = ImageIO.read(Main.class.getClassLoader().getResourceAsStream("bee.png"));
            airplane = ImageIO.read(Main.class.getClassLoader().getResourceAsStream("airplane.png"));
            gameover = ImageIO.read(Main.class.getClassLoader().getResourceAsStream("gameover.png"));
            hero0 = ImageIO.read(Main.class.getClassLoader().getResourceAsStream("hero0.png"));
            hero1 = ImageIO.read(Main.class.getClassLoader().getResourceAsStream("hero1.png"));
            pause = ImageIO.read(Main.class.getClassLoader().getResourceAsStream("pause.png"));
            start = ImageIO.read(Main.class.getClassLoader().getResourceAsStream("start.png"));
        }catch (Exception e){
            e.printStackTrace();
        }

    }
    //添加面板角色
    private FlyingObject[] flyings = new FlyingObject[0]; //定义一个数组，存储界面上出现的敌机和蜜蜂
    private Hero hero = new Hero();//界面上的英雄机
    private Bullet[] bullets = new Bullet[0];//界面上的子弹
    //提供两个属性用来记录总得分和生命值
    public int totalScore = 0;
    private int totslLife = hero.getLifes();

    //重写绘制功能    该功能是画板主动调用的，只调用一次
    public void paint(Graphics g){
        //绘制背景图片
        paintBackground(g);
        if (currentState == State.READY){
            paintReady(g);
            paintScore(g);
            paintHero(g);
        }else if (currentState == State.RUNNING){
            paintHero(g);
            paintBullets(g);
            paintFlyings(g);
            paintScore(g);
        }else if (currentState == State.GAMEOVER){
            paintGameOver(g);
            paintHero(g);
            paintBullets(g);
            paintFlyings(g);
            paintScore(g);
        }else if (currentState == State.PAUSE){
            paintPause(g);
            paintHero(g);
            paintBullets(g);
            paintFlyings(g);
            paintScore(g);
        }
    }

    private void paintGameOver(Graphics g) {
        g.drawImage(gameover,0,0,null);
    }

    private void paintPause(Graphics g) {
        g.drawImage(pause,0,0,null);
    }

    private void paintReady(Graphics g) {
        g.drawImage(start,0,0,null);
    }

    private void paintScore(Graphics g) {
        g.setFont(new Font("宋体", Font.BOLD, 20));
        g.setColor(Color.GRAY);
        g.drawString("SCORE: " + totalScore, 10, 20);
        g.drawString("LIFE: " + totslLife, 10, 40);
    }

    private void paintFlyings(Graphics g) {
        for (FlyingObject flying : flyings) {
            g.drawImage(flying.image,flying.x,flying.y,flying.width,flying.height,null );
        }
    }

    private void paintBullets(Graphics g) {
        for (Bullet bullet : bullets) {
            g.drawImage(bullet.image,bullet.x,bullet.y,bullet.width,bullet.height,null );
        }
    }

    private void paintHero(Graphics g) {
        g.drawImage(hero.image,hero.x,hero.y,hero.width,hero.height,null);
    }

    public void paintBackground(Graphics g){
        g.drawImage(background,0,0,WIDTH,HEIGHT,null);
    }

    private Timer timer;

    public void action(){
        MouseAdapter mouse = new MouseAdapter(){
            @Override
            public void mouseMoved(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                hero.moveTo(x,y);
            }

            @Override
            public void mouseClicked(MouseEvent e) {
                if (currentState == State.READY){
                    currentState = State.RUNNING;
                }else if (currentState == State.GAMEOVER){
                    currentState = State.READY;
                }
            }

            @Override
            public void mouseEntered(MouseEvent e) {
                if (currentState == State.PAUSE){
                    currentState = State.RUNNING;
                }
            }

            @Override
            public void mouseExited(MouseEvent e) {
                currentState = State.PAUSE;
            }
        };
        this.addMouseListener(mouse);
        this.addMouseMotionListener(mouse);

        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {

                if (currentState == State.READY){

                }else if(currentState == State.RUNNING){
                    //飞行物人场
                    enterAction();
                    //飞起来
                    flyingAction();
                    //碰撞行为
                    impactAction();
                    //越界行为 ：内存会越来越大
                    outOfBoundsAction();
                }
                repaint();
            }
        },10,10);
    }

    //越界行为 ：内存会越来越大
    private void outOfBoundsAction() {
        //处理飞行物越界的情况
        int flyingIndex = -1;
        for (int i = 0; i < flyings.length; i++) {
            if(flyings[i].outOfBounds()){
                flyingIndex = i;  //飞行物越界保存下标
                break;
            }
        }
        if(flyingIndex != -1){
            //将该飞行物和数组中的最后一个飞行物进行交换，缩容一位
            flyings[flyingIndex] = flyings[flyings.length - 1];
            flyings = Arrays.copyOf(flyings, flyings.length - 1);
        }
        //处理子弹的越界
        int bulletIndex = -1;
        for (int i = 0; i < bullets.length; i++) {
            if(bullets[i].outOfBounds()){
                bulletIndex = i;
            }
        }
        if(bulletIndex != -1){
            bullets[bulletIndex] = bullets[bullets.length - 1];
            bullets = Arrays.copyOf(bullets, bullets.length - 1);
        }
    }

    private void impactAction() {
        // 遍历飞行物是否被子弹碰到 在遍历过程中如果修改数组，那么遍历的次数受影响了，交换后最后一个元素放到前面了，
        // 就没有机会再判断是否被集中了。因此缩容的逻辑应该在循环结束后。
        int index = -1;
        for (int i = 0; i < flyings.length; i++) {
            //先获取某个飞行物
            FlyingObject flying = flyings[i];
            if(impacted(flying)){

                index = i;//将被撞击的对象的下标存起来。
                break;//结束循环处理被撞的
            }
        }

        //判断index是否是某个飞行物的下标
        if(index != -1){
            //撞击时查看是敌机还是蜜蜂
            FlyingObject f = flyings[index];

            if (f instanceof EnemyAirplane) {
                totalScore += ((EnemyAirplane) f).getScore();
            }else {
                Award award = (Award) f;
                switch (award.getType()){
                    case Award.LIFE :
                        totslLife++;
                        break;
                    default :
                        hero.setDoubleFire();
                }
            }

            //将该飞行物和数组中的最后一个飞行物进行交换，缩容一位
//            FlyingObject temp = flyings[index];
            flyings[index] = flyings[flyings.length - 1];
//            flyings[flyings.length - 1] = temp;
            flyings = Arrays.copyOf(flyings, flyings.length - 1);
        }
        if (totslLife > 0){
            int imindex = -1;
            for (int i = 0; i < flyings.length; i++) {
                if(hero.impact(flyings[i])){
                    imindex = i;
                    break;
                }
            }
            if (imindex != -1){
                flyings[imindex] = flyings[flyings.length - 1];
                flyings = Arrays.copyOf(flyings, flyings.length - 1);
                totslLife--;
            }
        }else {
            currentState = State.GAMEOVER;
            resetGame();
        }
    }

    private void resetGame() {
        totalScore = 0;
        totslLife = 3;
        flyings = new FlyingObject[0];
        bullets = new Bullet[0];
    }

    //判断形参指向的那个飞行物是否被子弹击中了
    private boolean impacted(FlyingObject flying) {
        for (Bullet value : bullets) {
            if(flying.shootBy(value)){
                return true;
            }
        }
        return false;
    }

    private void flyingAction() {
        for (FlyingObject fly : flyings) {
            fly.flying();
        }
        hero.flying();
        for (Bullet bullet : bullets) {
            bullet.flying();
        }
    }
    private  int flyingIndex;
    //各种角色入场
    private void enterAction() {
        flyingIndex++;
        if (flyingIndex%20 == 0) {
            //敌机、蜜蜂、子弹入场
            flyingsEnter();
        }
        if (flyingIndex%30 == 0) {
            //子弹入场
            bulletsEnter();
        }
    }

    private void bulletsEnter() {
        //英雄机发射子弹
        Bullet[] bs = hero.shoot();
        //先扩容
        bullets = Arrays.copyOf(bullets,bs.length + bullets.length);
        //将发射的子弹存储到面板上的bullets(扩容后)成员变量里
        System.arraycopy(bs,0,bullets,bullets.length - bs.length,bs.length);

    }

    private void flyingsEnter() {
        int number = (int)(Math.random()*20);
        FlyingObject object = switch (number) {
            case 15 -> new Bee();
            default -> new EnemyAirplane();
        };
        //扩容+1位
        flyings = Arrays.copyOf(flyings, flyings.length + 1);
        //将随机产生的飞行物放在扩容后的最后一个位置
        flyings[flyings.length-1] = object;
    }
    public int getTotalScore() {
        return totalScore;
    }
    // 游戏的启动方法
    public static void main(String[] args) {
        //定义一个窗口
        JFrame frame = new JFrame("飞机大战");
        //定义一个面板
        Main panel = new Main();
        //将面板镶嵌到窗口上
        frame.add(panel);
        //设置窗口大小
        frame.setSize(WIDTH,HEIGHT);
        frame.setVisible(true);
        //设置窗口剧中
        frame.setLocationRelativeTo(null);
        //关闭窗口即终止程序
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        currentState = State.READY;
        panel.action();
    }
}
