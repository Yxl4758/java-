package com.youcai.day04._04Enum;

import java.util.Scanner;

public class YearTest {
    public static void main(String[] args) {
        System.out.println(Year.FEBRUARY); //枚举名.对象名
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入你喜欢的月份：");
        int month = scanner.nextInt();
        if (month < Year.JANUARY.getNumber() || month > Year.DECEMBER.getNumber()){
            System.out.println("你输入的月份有误");
        }
    }
}
