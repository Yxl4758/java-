package com.youcai202503.day02._08Polymoriphic;
/**
 * 多态：
 * 1. 向上造型
 *      - 父类型的变量引用子类型的对象。
 *      - 向上转型肯定会成功，是一个隐式转换。
 *      - 向上转型后的对象，将只能够访问父类中的成员（编译期间，看变量）
 *      - 如果调用的是重写过的方法，那么调用的一定是重写方法（运行期间，看对象）
 *      - 应用场景：在定义方法时，形式参数是父类型的变量。这样更加灵活，可以传任意子类型的对象
 *
 * */
public class Test {
    public static void main(String[] args) {
        Shape rect = new Rect(10,20);
        Circle circle = new Circle(5,3,5);
        System.out.println(MyUtil.getCircumference(rect));
        System.out.println(MyUtil.getCircumference(circle));
    }
}