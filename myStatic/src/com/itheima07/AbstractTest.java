package com.itheima07;

/**
 * abstract不能和final, private关键字共存
 *
 * 抽象类的构造函数: 给抽象类成员变量初始化
 *
 * 抽象类必须要有抽象方法
 *
 * 抽象类不能实例化(私有化构造函数)
 *
 */

public class AbstractTest {
    public static void main(String[] args) {
        Programmer programmer = new Programmer();
        programmer.work();

        Manager manager = new Manager();
        manager.work();
    }
}


abstract class Employee {
    String name;
    String id;
    double pay;

    public abstract void work();
}

class Programmer extends Employee {
    @Override
    public void work() {
        System.out.println("写代码");
    }
}

class Manager extends Employee {
    byte bonus;

    @Override
    public void work() {
        System.out.println("监工");
    }


}