package com.youcai.day04._01InterfaceTest1;

public class Mouse implements USB{

    @Override
    public void charge() {
        System.out.println("鼠标正在通过USB充电");
    }

    @Override
    public String getInfo() {
        return "狼蛛SC580";
    }
}
