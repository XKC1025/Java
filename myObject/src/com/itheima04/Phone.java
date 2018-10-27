package com.itheima04;

public class Phone {
    private String name;
    private int price;

    // 构造方法
     public Phone() {}

    // 构造方法重载, 通过传入参数给private成员变量赋值
     public Phone(String name) {
        this.name = name;
    }

    //
    public Phone(String name, int price) {
        this.name = name;
        this.price = price;

    }

    public void show() {
        System.out.println(name + "----" + price);
    }
}
