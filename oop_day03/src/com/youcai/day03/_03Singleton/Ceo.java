package com.youcai.day03._03Singleton;
/**
 * 单例模式：饿汉写法
 * 1.   饿汉：指的是想要快速获得对象
 * 2.   在类中提供一个私有的静态的该类的成员属性
 * 3.   使用静态块来给成员属赋值（也可以直接在定义变量时直接初始化）
 * 4.   构造器私有化，防止在其他地方被调用者调用构造器创建新的实例
 * 5.   提供一个全局访问点：提供一个public修饰的静态的返回该类型实例的方法
 * */
public class Ceo {
    private static Ceo instance;

    static {
        instance = new Ceo();
    }

    private Ceo(){}

    public static Ceo getInstance(){
        return instance;
    }
}
