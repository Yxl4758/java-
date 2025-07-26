package com.youcai.day01._07JVM;

public class Main {
    public static void main(String[] args) {
        Emp e1 = new Emp("蔡徐坤", 32);
        int result = e1.work(1, 2, 3);
        System.out.println("result = " + result);
    }
}
