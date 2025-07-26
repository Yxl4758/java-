package com.youcai.day01._04practic;

import java.util.Random;

public class Shape {
    Cell[] cells;

    public Shape() {
        this.cells = new Cell[4];
    }

    public void moveLft(){
        for (Cell value : cells) {
            value.left();
        }
    }

    public void moveRight(){
        for (Cell value : cells) {
            value.right();
        }
    }

    public void moveDrop(){
        for (Cell value : cells) {
            value.drop();
        }
    }
    public Shape[] config(){
        Shape[] shapes = new Shape[7];
        shapes[0] = new I();
        shapes[1] = new J();
        shapes[2] = new L();
        shapes[3] = new O();
        shapes[4] = new T();
        shapes[5] = new Z1();
        shapes[6] = new Z2();
        return shapes;
    }
    public Shape random(){
        Shape[] shapes = new Shape().config();
        int i = new Random().nextInt(7);
        return shapes[i];
    }

    public void spin(){

    }
}
