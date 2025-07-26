package com.youcai.day01._01Method;

public class MethodDemo {
    //两个数最大值
    public static int getMax(int a, int b){
        return a > b ? a : b;
    }
    //三个数最大值
    public static int getMax(int a, int b, int c){
        return a > b ? (a > c ? a : c) : (b > c ? b : c);
    }
    //两个数的和
    public static int getSum(int a, int b){
        return a + b;
    }
    //三个数的和
    public static int getSum(int a, int b,int c){
        return a + b + c;
    }
    //计算阶乘
    public static long factorial(int n){
        if (n == 1){
            return 1;
        }
        return n * factorial(n - 1);
    }
    
    public static void main(String[] args) {
        int x = (int)(Math.random()*10);
        int y = (int)(Math.random()*10);
        int z = (int)(Math.random()*10);
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        // 找出x和y的较大值
        int max = getMax(x,y);
        System.out.println("max = " + max);
        // 找出x、y、z的最大值
        max = getMax(x, y, z);
        System.out.println("max = " + max);
        // 计算x和y的和
        int sum = getSum(x, y);
        System.out.println("sum = " + sum);
        //计算x、y、z的和
        sum = getSum(x, y, z);
        System.out.println("sum = " + sum);
        //计算5的阶乘
        long n = factorial(10);
        System.out.println("n = " + n);
    }
}
