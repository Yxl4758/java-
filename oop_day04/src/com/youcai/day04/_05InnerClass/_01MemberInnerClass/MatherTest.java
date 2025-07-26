package com.youcai.day04._05InnerClass._01MemberInnerClass;

public class MatherTest {
    Mather mather = new Mather("母亲",30);
    Mather.Son son = mather.new Son("小明",10);
}
