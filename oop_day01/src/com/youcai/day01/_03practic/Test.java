package com.youcai.day01._03practic;

import com.sun.source.tree.NewArrayTree;

public class Test {
    public static void main(String[] args) {
        Tetris tetris = new Tetris(1,10);

        for (int i = 1; i < tetris.row; i++) {
            tetris.printStatus();
            System.out.println("————————————————————————");
            tetris.down();
        }
    }
}
