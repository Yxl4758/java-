package com.youcai202503.day02._03Extends;

public class Animal {
    static double PI = 3.14;

    private String name;
    private int age;
    String color;

    public Animal(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public Animal() {
    }

    /**
     * 获取
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     * @return age
     */
    public int getAge() {
        return age;
    }

    /**
     * 设置
     * @param age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * 获取
     * @return color
     */
    public String getColor() {
        return color;
    }

    /**
     * 设置
     * @param color
     */
    public void setColor(String color) {
        this.color = color;
    }

    public void calculate(int a, int b){
        int c = a + b;
        System.out.println("c = " + c);
    }

    private void printInfo(){
        System.out.println(name);
    }

    public String toString() {
        return "Animal{name = " + name + ", age = " + age + ", color = " + color + "}";
    }
}
