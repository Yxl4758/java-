package com.youcai.day04._02Interface;

/**
 * 1.   接口的关键字时interface
 * 2.   接口是特殊的抽象类，里面的方法都是抽象方法
 * 3.   接口里的方法默认使用了 public abstract这两个关键字修饰，可以不用写。
 * 4.   接口里可以提供成员变量，默认使用 public static final其实指的是常量。
 * 5.   接口里不能提供构造器，没有任何意义。
 * 6.   除了作为特殊的抽象类之外，能满足java不能多继承的需求。通过接口来变相的实现多继承。
 * 7.   普通类继承接口时，需要重写接口里的所有方法，除非该类是抽象类。class可以实现多个接口，接口之间使用逗号隔开。
 * 8.   接口之间的关系：可以是继承关系、如果B接口继承了A接口，相当于B里拥有了A的所有抽象方法以及A的其他成员。
 *      interface B extends A{}
 * 9.   不论是extends还是implements，后面如果是接口，就可以写多个接口，逗号隔开。
 * 10.  某个类可以同时继承一个父类和实现接口。
 * */

public interface Human {
    double PI = 3.14;

    //计算两个int类型的数据之和
    int sum(int a, int b);
    //提供一个可以对int[]进行冒泡排序的方法
    void bubbleSort();
}

interface Employee{
    void work();
}

class Person implements Human,Employee{

    @Override
    public void work() {

    }

    @Override
    public int sum(int a, int b) {
        return a + b;
    }

    @Override
    public void bubbleSort() {

    }
}
