package com.youcai.day01._02practice;

public class Test {
    public static void main(String[] args) {
        User user1 = new User("张三", 123, "123@163.com");
        System.out.println(user1.showInfo());
        User user2 = new User("李四", 345);
        System.out.println(user2.showInfo());
    }
}
