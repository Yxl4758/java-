package com.youcai.day01._06Constructor;

/**
 * 构造器；
 * 1. 也叫构造方法，是一种特殊的方法
 * 2. 构造器的作用，用来初始化对象成员变量的
 * 3.使用new关键字调用构造器
 * 4.构造器的定义语法：
 *      -[访问权限修饰词] 类名([形参列表]){
 *          方法体 ： 一般情况下是给成员变量初始化。
 *      }
 *   语法解析
 *      - 访问权限修饰词：
 *      - 没有返回值类型
 *      - 方法名就是类名
 *      - 形参列表根据需求定
 * 5. 如果程序员不提供构造器，那么系统会默认提供一个参数列表的构造器，简称无参构造器
 * 6. 一旦程序员提供了构造方法，系统不会再默认生成无参构造器。如果还想要无参数构造器，必须由程序员独自写出来。
 * 7. 构造器也是可以重载的
 * 8. 不能使用static修饰
 * */

public class Employee {
    String name;
    int age;
    char gender;
    double salary;

    public Employee() {
    }

    public Employee(String name, int age, char gender, double salary) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.salary = salary;
    }

    public String toString() {
        return "Employee{name = " + name + ", age = " + age + ", gender = " + gender + ", salary = " + salary + "}";
    }
}
