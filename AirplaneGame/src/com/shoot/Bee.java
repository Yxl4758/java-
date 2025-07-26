package com.shoot;
import java.util.Random;
public class Bee extends FlyingObject implements Award{
    private final int awardType;
    private final int ySpeed = 3;
    private int xSpeed = 2;

    public Bee() {
        image = Main.bee;
        width = image.getWidth();
        height = image.getHeight();
        this.awardType = new Random().nextInt(2);
        this.x = new Random().nextInt(Main.WIDTH - width + 1);
        this.y = -height;
    }

    @Override
    void flying() {
        this.y += ySpeed;
        if(this.x >= Main.WIDTH - width || this.x <= 0) {
            xSpeed = -xSpeed;
        }
        this.x += xSpeed;
    }

    @Override
    boolean outOfBounds() {
        return this.y >= Main.HEIGHT;
    }

    @Override
    public int getType() {
        return awardType;
    }
}
