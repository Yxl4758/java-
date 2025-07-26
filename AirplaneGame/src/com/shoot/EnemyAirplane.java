package com.shoot;

import java.util.Random;

public class EnemyAirplane extends FlyingObject implements Enemy{
    private final int ySpeed;
    public EnemyAirplane(){
        this.image = Main.airplane;
        this.width = image.getWidth();
        this.height = image.getHeight();
        this.x = new Random().nextInt(Main.WIDTH - width + 1);
        this.y = -height;
        this.ySpeed = 5;
    }

    @Override
    public int getScore() {
        return 5;
    }

    @Override
    void flying() {
        y += ySpeed;
    }

    @Override
    boolean outOfBounds() {
        return this.y >= Main.HEIGHT;
    }
}
