package com.youcai.day01._05null;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;

/**
 * null和nullPointerException
 * 1.null
 *      - 引用类型的默认值
 *      -其实表示的是引用变量李没有存储对象的地址
 * 2.NullPointerException
 *      -当引用变量的值是null然后使用了引用变量.xxx访问成员时，报这个异常
 *      -运行时才会报异常
 * */
public class Tescher {
    String name;
    int age;

    public String toString(){
        return name + "," + age;
    }
    public void work(){
        System.out.println("---工作中。。。。。----");
    }

    public static void main(String[] args) {
        Tescher tescher = new Tescher();
        System.out.println(tescher); // null，0
        tescher.name = "蔡徐坤";
        tescher.age = 18;
        System.out.println(tescher);
        tescher = null; //使用null来覆盖原来的地址
        System.out.println(tescher);
    }
}
