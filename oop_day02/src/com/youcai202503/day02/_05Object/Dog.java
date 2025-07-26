package com.youcai202503.day02._05Object;
/**
 * Object类型
 * 1。 Object类型是java的类型继承体系中的顶级父类，
 *     java中的其他所有类都是直接或者间接的继承了Object类型
 * 2. Object类型中提供了常用的方法
 *    - String toString（）：用来描述每个对象的特征的
 *    - int hasCode（）； 用来产生一个在内存中的位置数字。底层算法默认使用的是本地的hash算法
 *          当对象要存储到集合中时，一般情况下都要重写hasCode方法，尽量面两个人对象的hash值相同
 *          如何重写hasCode：让类的所有成员属性都参与运算，并于质数进行计算
 *    - boolean equals（Object obj）；通常情况下比较两个对象是否一样
 *          1、如果  obj == null，一定要返回false。
 *          2、如果  obj == this，一定要返回true。
 *          3、如果两个对象的类型不同，一定要返回false。
 *          4、如果  a.equals(b) 成立，则  b.equals(a) 也必须成立。
 *          5、如果  a.equals(b), b.equals(c) 成立，则  a.equals(c) 也必须成立。
 *    - 两个引用变量使用双等号进行判断时，比较的是两个地址值是否相同。
 *
 *    - 如果Object里提供的方法能狗满足子类的需求则不需要重写反之需要重写。
 * */
public class Dog {
    private String name;
    private  int age;

    public int hasCode(){


        return 0;
    }
    public boolean equals(Object obj){
        return true;
    }
}
