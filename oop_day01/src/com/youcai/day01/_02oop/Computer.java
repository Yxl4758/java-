package com.youcai.day01._02oop;

public class Computer {
    String brand;
    String model;
    String color;
    double weight;
    int age;
    public void open(){
        System.out.println("---开机---");
    }
    public void close(){
        System.out.println("---关机---");
    }
    public void insertUSB(){
        System.out.println("---插入USB---");
    }
    public String showInfo(String brand, String model, String color, double weight, int age){
        return "品牌：" + brand + " 型号：" + model + " 颜色：" + color + " 重量：" + weight + "kg" + " 使用年限：" + age + "年";
    }
}
