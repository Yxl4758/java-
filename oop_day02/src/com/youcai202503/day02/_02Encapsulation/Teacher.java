package com.youcai202503.day02._02Encapsulation;
/**
 * 面向对象的三大特征之一：封装
 * 0. 为什么封装；不希望外界直接访问属性，因为直接访问可能会造成不合理或者不合逻辑的数据；
 *    为什么提供公有的getter/setter方法：还是希望外界访问属性的，外界传入数据时，可以通过getter/setter会对数据进行操作，判断数据是否合理。
 * 1. 如何封装
 *      - 在成员变量前，添加private修饰词，表示私有化
 *      - 私有化的属性只能在本类中直接调用，在其他位置不能直接调用
 * 2. 如果想要在其他位置访问，需要提供公有的getter/setter方法
 * 3. Bean是getter/setter去掉get/set后续的名称，一般情况下与属性名称相同
 * */
public class Teacher {
    private String name;
    private int age;

    public Teacher() {
    }

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
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
        if (age > 0 && age < 100){
            this.age = age;
        }else {
            throw new RuntimeException("年龄非法" + age);
        }
    }

    public String toString() {
        return "Teacher{name = " + name + ", age = " + age + "}";
    }
}
