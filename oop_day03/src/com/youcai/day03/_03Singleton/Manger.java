package com.youcai.day03._03Singleton;
/**
 * 单例模式：懒汉
 * 需要时再创建实例
 * */
public class Manger {
    private String name;
    private int age;
    private static Manger instance;

    private Manger(String name, int age){
        this.name = name;
        this.age = age;
    }

    public static Manger getInstance(){
        if(instance == null){
            instance = new Manger("张飞", 40);
        }
        return instance;
    }
}
