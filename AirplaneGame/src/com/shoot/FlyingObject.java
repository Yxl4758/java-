package com.shoot;

import java.awt.*;
import java.awt.image.BufferedImage;

/**
 * 定义飞行物的抽象父类型
 *
 * */
public abstract class FlyingObject {
    protected BufferedImage image;
    protected int x; //图片左上角所在画面的x轴方向的坐标
    protected int y; //图片左上角所在画面的y轴方向的坐标
    protected int width; //图片的宽
    protected int height; //图片的高

    abstract void flying(); //每个飞行物的飞行逻辑不同
    abstract boolean outOfBounds();//每个飞行物的越界行为不同

    public boolean shootBy(Bullet bullet){
        int xMin = this.x - bullet.width;
        int xMax = this.x + this.width;
        int yMin = this.y;
        int yMax = this.y + this.height;

        return bullet.x > xMin && bullet.x < xMax && bullet.y > yMin && bullet.y < yMax;

    }

}
