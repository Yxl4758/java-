package com.youcai.day01._03practic;

public class Tetris {
    int position;
    int row;

    public Tetris() {
    }

    public Tetris(int position, int row) {
        this.position = position;
        this.row = row;
    }

    public void down(){
        this.position++;
    }

    public void printStatus(){
        for (int i = 1; i <= row - 1; i++) {
            if (i == this.position){
                System.out.println("---###---");
                System.out.println("---#-----");
            }else {
                System.out.println("---------");
            }
        }
    }
}
