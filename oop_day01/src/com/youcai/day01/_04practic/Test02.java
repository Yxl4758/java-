package com.youcai.day01._04practic;

import java.util.ArrayList;
import java.util.Scanner;

public class Test02 {
    public static void printWall(Cell[][] wall, Shape s){
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

    public static void print(ArrayList<Shape> shape, Cell[][] walll){
        for (Shape value : shape){
            printWall(walll,value);
        }
        System.out.println("——————————————————");
    }

    public static void main(String[] args) {
        Cell[][] wall = new Cell[10][10];
        for (int i = 0; i < wall.length; i++) {
            for (int j = 0; j < wall.length; j++) {
                wall[i][j] = new Cell(i,j);
            }
        }
        Scanner scan = new Scanner(System.in);
        ArrayList<Shape> shapes = new ArrayList<>();
        int i = 0;
        char operate;
        boolean flag1 = true;
        boolean flag2;
        while (flag1){
            Shape shape = new Shape().random();
            shapes.add(shape);
            print(shapes,wall);
            flag2 = true;
            while (flag2){
                System.out.print("请输入操作：");
                operate = scan.next().charAt(0);
                if (operate == 't'){
                    flag2 = false;
                    continue;
                }
                switch (operate){
                    case 'a':
                        if (shapes.get(i).cells[0].col == 0 || shapes.get(i).cells[2].col == 0){
                            System.out.println("越界啦");
                            shapes.get(i).moveDrop();
                        }else {
                            shapes.get(i).moveLft();
                            shapes.get(i).moveDrop();
                            print(shapes,wall);
                        }
                        break;
                    case 'd':
                        if (shapes.get(i).cells[2].col == 9 || shapes.get(i).cells[1].col == 9 || shapes.get(i).cells[3].col == 9){
                            System.out.println("越界啦");
                            shapes.get(i).moveDrop();
                        }else {
                            shapes.get(i).moveRight();
                            shapes.get(i).moveDrop();
                            print(shapes,wall);
                        }
                        break;
                    case 's':
                        if (shapes.get(i).cells[3].row == 9){
                            System.out.println("结束！！！");
                            flag2 = false;
                            break;
                        }else {
                            shapes.get(i).moveDrop();
                            print(shapes,wall);
                        }
                        break;
                    default:
                        break;
                }
            }
            i++;
        }
    }
}
