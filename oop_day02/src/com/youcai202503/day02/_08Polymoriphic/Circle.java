package com.youcai202503.day02._08Polymoriphic;

public class Circle extends Shape{
    double r;
    int x;
    int y;

    public Circle(double r, int x, int y) {
        this.r = r;
        this.x = x;
        this.y = y;
    }

    public double circumference(){
        return 2*Math.PI*r;
    }
}
