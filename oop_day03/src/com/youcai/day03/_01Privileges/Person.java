package com.youcai.day03._01Privileges;
/**
 * 访问权限修饰词：public protected 默认的 private
 * 1.   修饰属性：
 *                  本类      同包      子类      其他
 *      public      true     true      true     true
 *      protected   true     true      true     false
 *      默认的       true     true      false    false
 *      private     true     false     false    false
 * 2.   修饰方法 范围同上
 *
 * 3.   修饰类：
 *              一个*.java源文件中里的普通类，只能使用public和默认的来修饰。没有嵌套可以并列存在
 *              public修饰的只能有一个，且与文件名相同
 *              内部类可以用所有修饰词来修饰
 *
 * */
public class Person {
    public int a;
    protected int b;
    int c;
    private int d;
    public void test01(){
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("d = " + d);
    }
}
