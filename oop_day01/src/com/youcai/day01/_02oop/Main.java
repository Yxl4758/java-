package com.youcai.day01._02oop;

public class Main {
    public static void main(String[] args) {
        Computer cp1 = new Computer();
        cp1.brand = "联想拯救者";
        cp1.model = "r7000p";
        cp1.color = "黑色";
        cp1.weight = 0.5;
        cp1.age = 2;
        String info;
        cp1.open();
        cp1.close();
        cp1.insertUSB();
        info = cp1.showInfo(cp1.brand, cp1.model, cp1.color, cp1.weight, cp1.age);
        System.out.println(info);
    }
}
