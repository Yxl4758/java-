package com.youcai.day01._03static;

public class Employee {
    static int cappacityOfWater = 16;
    String name;
    int age;
    char gender;

    public void work(){
        System.out.println(name + "开始上班。。。");
    }
    public static void printInfo(){
        System.out.println("----静态方法----");
    }

    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.name = "张三";
        employee.age = 18;
        employee.gender = '男';

        employee.work();
        System.out.println(Employee.cappacityOfWater);
        Employee.printInfo();// 静态方法中可以直接访问本类中的其他静态成员和变量
                             // 静态方法中不可以直接访问本类中的其他非静态成员和变量
                             // 非静态方法可以访问本类中的任何成员和变量
    }
}
