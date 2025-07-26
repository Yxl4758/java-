package com.youcai.day01._01practice;

public class Book {
    String bookName;
    double price;
    int number;

    public Book() {
    }

    public Book(String bookName, double price, int number) {
        this.bookName = bookName;
        this.price = price;
        this.number = number;
    }

    public void display(){
        System.out.println("Book{" + "书名：" + this.bookName + " 价格：" + this.price + " 存书数量：" + this.number + "}");
    }

    public void borrow(){
        if (this.number <= 0){
            System.out.println("库存不足，无法借出");
        }else{
            this.number--;
            System.out.println("已借出，剩余存书数量：" + this.number);
        }
    }

    public void restore(){
        this.number++;
        System.out.println("已归还，剩余存书数量：" + this.number);
    }
}
