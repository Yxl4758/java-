package com.youcai202503.day02._04override;
/**
 * 定义一个矩形类型
 * */
public class Rect extends Shape{
    private double length;
    private double width;

    public Rect(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double circumference(){
        return 2*(this.length + this.width);
    }

    @Override
    public double area(){
        return this.length * this.width;
    }

    //    protected void m1(){      子类在重写父类中的方法时访问权限修饰词不能大于父类
    //
    //    }

    //    public void m2(){             子类在重写父类中的方法时访问权限修饰词可以与父类相同或者大于父类
    //
    //    }

    //    private void m3(){            子类不能重写父类中的私有方法，如果子类中写了该方法，那是子类特有的方法
    //
    //    }

    public A m4(){          //重写时子类方法的返回值类型不变
        return null;
    }
    @Override
    protected B m5(){       //重写时子类方法的返回值类型可以是父类方法返回值类型的子类型
        return null;
    }

//    public A m6(){        重写时子类方法的返回值类型不可以是父类方法返回值类型的父类型
//        return null;
//    }

    public void showInfo(){
        System.out.println("长为：" + this.length + "宽为：" + this.width);
    }

    public static void main(String[] args) {
        Rect rect = new Rect(10,5);

        System.out.println("rect = " + rect.area());
        System.out.println("rect = " + rect.circumference());
        rect.showInfo();
    }
}
