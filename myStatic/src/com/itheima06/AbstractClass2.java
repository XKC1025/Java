package com.itheima06;

/**
 * final: 修饰类&成员变量&成员方法  类不能被继承, 成员变量不能被修改(常量), 成员方法不能被重写
 *
 *
 * 抽象类的成员特点:
 *      1.成员变量  可以有成员变量和 final修饰的常量
 *      2.成员方法  可以有抽象方法&非抽象方法
 *      3.构造方法  可以有构造方法, 给抽象类成员变量进行初始化
 *
 *      构造方法是对象进行初始化, 而不是创建出对象实例
 *
 */

public class AbstractClass2 {
    public static void main(String[] args) {
        Dog2 dog = new Dog2();

        dog.barking();

        System.out.println(dog.name);
    }
}

abstract class Animal2 {
    int num = 22;
    final String name = "dog";

    public Animal2() {
        num = 18;
        System.out.println(num);
        System.out.println("抽象类构造方法");
    }
}

class Dog2 extends Animal2 {
    public void barking() {
        System.out.println("wang wang wnag");
    }
}
