package com.shoot;

import java.awt.image.BufferedImage;

public class Hero extends FlyingObject{
    private int lifes;
    private BufferedImage[] images = {Main.hero0,Main.hero1};
    public Hero(){
        image = Main.hero0;
        this.x = 150;
        this.y = 425;
        this.lifes = 3; //三条命作为初始值
        width = image.getWidth();
        height = image.getHeight();
    }

    public void setDoubleFire(){
        this.doubleFire += 40;
    }

    public void subLife(){
        this.lifes--;
    }

    public int getLifes(){
        return lifes;
    }
    
    //英雄机被碰撞方法
    public boolean impact(FlyingObject obj){

        int xMin = this.x - obj.width;
        int xMax = this.x + this.width;
        int yMin = this.y - obj.height;
        int yMax = this.y + this.height;
        return obj.x > xMin && obj.x < xMax && obj.y > yMin && obj.y < yMax;
    }

    private int doubleFire;
    public Bullet[] shoot(){
        Bullet[] bullets;
        int width =this.width/4;
        if(doubleFire > 0){ //大于0双发
            bullets = new Bullet[2];
            bullets[0] = new Bullet(this.x + width,this.y);
            bullets[1] = new Bullet(this.x + width*3,this.y);
            doubleFire -= 2; //发射一次就自减一次
        }else {             //单发
            bullets = new Bullet[1];
            bullets[0] = new Bullet(this.x + width*2,this.y);
        }
        return bullets;
    }

    //英雄机的移动方法：英雄机跟着鼠标移动
    public void moveTo(int x, int y){
        this.x = x - width/2;
        this.y = y - height/2;
    }

    private int index = 0;
    @Override
    void flying() {
        index++;
        image = images[index/20%2];
    }

    @Override
    boolean outOfBounds() {
        return false;
    }
}
