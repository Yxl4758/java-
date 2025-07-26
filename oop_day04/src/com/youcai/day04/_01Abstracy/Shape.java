package com.youcai.day04._01Abstracy;
/**
 * 1.   如果父类中的某个方法不能满足所有子类的需求，那么这个方法的逻辑体就没有书写出来的必要。
 *      因此可以省略方法体，分号结束即可。必须使用abstract关键字来修饰该方法
 * 2.   如果一个类中有抽象方法，那么该类必须使用abstract来修饰，即抽象类
 * 3.   有抽象方法的类一定是抽象类；抽象类里可以没有抽象方法。
 * 4.   抽象类不能使用final修饰，抽象类就是用来被继承的。
 * 5.   子类继承抽象类时，必须重写父类中的所有出偶像方法
 * 6.   抽象类中可以提供构造器，但是不能调用构造器来实例化对象。没有意义
 * */
public abstract class Shape {
    public abstract double circumfrence();
    public abstract double area();
}

class Rectangle extends Shape{
    int x;
    int y;
    @Override
    public double circumfrence() {
        return (x + y) * 2;
    }

    @Override
    public double area() {
        return x * y;
    }

}