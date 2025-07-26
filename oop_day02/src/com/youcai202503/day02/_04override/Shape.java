package com.youcai202503.day02._04override;
/**
 * 定义一个形状类型
 * 共同行为：
 *      -求周长
 *      -求面积
 * */
public class Shape {
    /**
     * 求形状的周长
     * @return
     * */
    public double circumference(){
        return 0.0;
    }

    /**
     * 求形状的，面积
     * @return
     * */
    public double area(){
        return 0.0;
    }

    /**
     * 提供一个方法用来被子类重写 修饰词
     * @return
     * */
    public void m1(){

    }

    protected void m2(){

    }

    private void m3(){

    }

    /**
     * 提供一个方法用来被子类重写 返回类型
     * @return
     * */
    public A m4(){
        return null;
    }

    protected A m5(){
        return null;
    }

    public B m6(){
        return null;
    }
}
