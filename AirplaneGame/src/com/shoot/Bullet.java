package com.shoot;
/**
 * 子弹类型
 * */
public class Bullet extends FlyingObject{

    private int speed = 3;

    public Bullet(int x,int y) {
        image = Main.bullet;
        this.x = x;
        this.y = y;
        width = image.getWidth();
        height = image.getHeight();
    }

    @Override
    void flying() {
        this.y -= this.speed;
    }

    @Override
    boolean outOfBounds() {
        return y <= -this.height;
    }
}
