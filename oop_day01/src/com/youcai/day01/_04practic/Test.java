package com.youcai.day01._04practic;
import java.util.Scanner;
import java.util.Random;
public class Test {

    public static void printWall(Cell[][] wall, Shape s){
        for (int i = 0; i < wall.length; i++) {
            for (int j = 0; j < wall.length; j++) {
                wall[i][j] = new Cell(i,j);
            }
        }
        for (Cell[] cells : wall) {
            for (int j = 0; j < wall.length; j++) {
                for (Cell value : s.cells) {
                    if (j == wall.length){
                        break;
                    }
                    if (cells[j].equalls(value)) {
                        System.out.print("#");
                        j++;
                    }
                }
                if (j == wall.length){
                    break;
                }else {
                    System.out.print("-");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Cell[][] wall = new Cell[10][10];
        Shape shape = new Shape().random();
        Scanner scan = new Scanner(System.in);
        char operate;
        printWall(wall,shape);
        System.out.println("——————————————————");
        while(shape.cells[3].row < 10){
            if (shape.cells[3].row == 9){
                break;
            }
            System.out.print("请输入操作：");
            operate = scan.next().charAt(0);
            switch (operate){
                case 'a':
                    if (shape.cells[0].col == 0){
                        System.out.println("越界啦");
                    }else {
                        shape.moveLft();
                        printWall(wall,shape);
                        System.out.println("——————————————————");
                    }
                    break;
                case 'd':
                    if (shape.cells[2].col == 9 || shape.cells[1].col == 9 || shape.cells[3].col == 9){
                        System.out.println("越界啦");
                    }else {
                        shape.moveRight();
                        printWall(wall,shape);
                        System.out.println("——————————————————");
                    }
                    break;
                case 's':
                    shape.moveDrop();
                    printWall(wall,shape);
                    System.out.println("——————————————————");
                    break;
                default:
                    break;
            }
        }
    }
}
