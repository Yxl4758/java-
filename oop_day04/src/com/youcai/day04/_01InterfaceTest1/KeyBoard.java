package com.youcai.day04._01InterfaceTest1;

public class KeyBoard implements USB{

    @Override
    public void charge() {
        System.out.println("键盘正在通过USB充电");
    }

    @Override
    public String getInfo() {
        return "超级键盘";
    }
}
