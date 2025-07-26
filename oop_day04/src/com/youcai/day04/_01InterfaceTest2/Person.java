package com.youcai.day04._01InterfaceTest2;

public class Person implements Employee,Family{

    String name;
    int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void play(){
        System.out.println(this.name + "正在玩");
    }

    @Override
    public void work() {
        System.out.println(this.name + "正在工作");
    }

    @Override
    public void punchCard() {
        System.out.println(this.name + "正在打卡");
    }

    @Override
    public void cook() {
        System.out.println(this.name + "正在做饭");
    }

    @Override
    public void wash() {
        System.out.println(this.name + "正在洗碗");
    }
}
