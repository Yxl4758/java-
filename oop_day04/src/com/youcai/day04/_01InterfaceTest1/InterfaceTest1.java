package com.youcai.day04._01InterfaceTest1;

public class InterfaceTest1 {
    public static void main(String[] args) {
        Computer computer = new Computer();
        KeyBoard keyBoard = new KeyBoard();
        Mouse mouse = new Mouse();
        computer.setUsb1(keyBoard);
        computer.setUsb2(mouse);

        System.out.println("USB1设备信息：" + computer.getUsb1().getInfo());
        computer.getUsb1().charge();
        System.out.println("USB2设备信息：" + computer.getUsb2().getInfo());
        computer.getUsb2().charge();
    }
}
