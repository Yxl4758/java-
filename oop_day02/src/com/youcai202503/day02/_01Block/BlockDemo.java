package com.youcai202503.day02._01Block;

import java.util.Arrays;

/**
 * 代码块的学习：
 * 1. 动态代码块(构造代码块)
 *    语法：
 *    {
 *        代码片段
 *    }
 *    位置： 与构造器并列，都是在类体中
 *    特点： 构造器执行一次，动态代码块就执行一次，并先于构造器执行。
 *    作用： 一般用于统计一个类型创建了多少个对象，或者提前给成员变量赋值
 */
public class BlockDemo {
    public static void main(String[] args) {
        //调用无参构造器实例化对象
        BlockDemo  bd = new BlockDemo();
        System.out.println(bd.toString());
        //调用有参构造器实例化对象
        BlockDemo bd2 = new BlockDemo(10,20);
        System.out.println(bd2); //默认调用了toString()

    }
    int a;
    int b;
    static{
        System.out.println("--静态块执行了--");
    }
    {
        System.out.println("--动态块执行了--");
        a = 100;
        b = 200;
    }

    public BlockDemo(){
        System.out.println("--无参构造器--");
    }

    public BlockDemo(int a, int b){
        System.out.println("--有参构造器--");
        this.a = a;
        this.b = b;
    }

    /**
     * String toString():  将对象的成员信息变成一串字符串并返回
     * 该方法，在将引用变量放在输出语句中时，会默认调用
     * @return
     */
    public String toString(){
        return "a = " + a + ", b = " + b;
    }
}
