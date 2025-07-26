package com.youcai202503.day02._03Extends;

import java.util.concurrent.ConcurrentLinkedQueue;

/**
 * 子类不会继承父类的构造方法，只能调用父类里的构造方法，并且一定至少有一个子类构造器调用了父类的构造器。
 * 父类中私有的属性和方法继承了，但是没有权限访问
 *  如何使用父类中的构造器，使用super（有参传参），位置必须在子类构造器中的首行首句上，因此不能与this（有参传参）共存
 * */
public class Cat extends Animal{
    private int a;
    private int b;

    public Cat(){
        //默认调用父类中的无参构造器
    }

    public Cat(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public Cat(String name, int age, String color, int a, int b){
        super(name, age, color);
        this.a = a;
        this.b = b;
    }

    /**
     * 获取
     * @return a
     */
    public int getA() {
        return a;
    }

    /**
     * 设置
     * @param a
     */
    public void setA(int a) {
        this.a = a;
    }

    /**
     * 获取
     * @return b
     */
    public int getB() {
        return b;
    }

    /**
     * 设置
     * @param b
     */
    public void setB(int b) {
        this.b = b;
    }

    public String toString() {
        return super.toString() + a + ", b = " + b + "}";
    }

    public static void main(String[] args) {
        Cat c1 = new Cat("三花",3,"三花",10,20);
        c1.calculate(100,200);
        System.out.println(c1);
    }
}
