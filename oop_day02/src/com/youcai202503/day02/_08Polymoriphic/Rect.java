package com.youcai202503.day02._08Polymoriphic;

public class Rect extends Shape{
    int length;
    int width;

    public Rect(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public double circumference(){
        return 2*(this.length + this.width);
    }

}
