package com.youcai202503.day02._08Polymoriphic;

public class MyUtil {
    /**
     * 向下造型
     *      - 父类型变量赋值给子类型的变量，需要强制转换，是一个显式转换。
     *      - 可能会失败，失败的话，会报类造型异常ClassCastException
     *      - 为了避免ClassCastException ,可以使用instanceof 来判断：变量指向的对象是否属于某一个类型。
     * */

    public static double getCircumference(Shape s){
        return s.circumference();
    }
}
