package com.youcai.day04._04Enum;

import java.time.Month;

/**
 * 散列值：如月份January，。。。。。。
 *        如星期 Monday，。。。。。
 *        如省份：黑龙江、辽宁、吉林，。。。
 *        如国家：China、USA，。。。。。
 * 想要设计一年的十二个月份
 * 1.   定义一个普通类，然后创建对象，使用每一个对象来来表示月份
 * 2.   定义一个类，类里使用静态属性来表示这些散列值。
 * 3.   枚举：
 *           枚举的第一行必须是该枚举的对象，即你要表达的离散值。多个离散值使用逗号隔开，分号结束
 *           枚举可以提供私有属性
 *           可以提供构造器但是必须是私有的。
 *           实际上枚举的离散值就是调用构造器产生的 方式散列值(有参传参)
 *           构造器可以重载。如果调用无参构造器，()可以省略。
 * */
public enum Year {

    JANUARY(1),
    FEBRUARY(2),
    MARCH(3),
    APRIL(4),
    MAY(5),
    JUNE(6),
    JULY(7),
    AUGUST(8),
    SEPTEMBER(9),
    OCTOBER(10),
    NOVEMBER(11),
    DECEMBER(12);
    private int number;
    private Year(int number) {
        this.number = number;
    }

    public int getNumber() {
        return number;
    }

    //    public static final int january = 1;
//    public static final int  = 2;
//    public static final int january = 3;
//    public static final int january = 4;
//    public static final int january = 5;
    //第二种
//    public static void main(String[] args) {
//        Year one = new Year("January",1);
//    }
//
//    private String name;
//    private int month;
//
//    public Year() {
//    }
//
//    public Year(String name, int month) {
//        this.name = name;
//        this.month = month;
//    }
//
//    /**
//     * 获取
//     * @return name
//     */
//    public String getName() {
//        return name;
//    }
//
//    /**
//     * 设置
//     * @param name
//     */
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    /**
//     * 获取
//     * @return month
//     */
//    public int getMonth() {
//        return month;
//    }
//
//    /**
//     * 设置
//     * @param month
//     */
//    public void setMonth(int month) {
//        this.month = month;
//    }
//
//    public String toString() {
//        return "Year{name = " + name + ", month = " + month + "}";
//    }
    //第一种
}
