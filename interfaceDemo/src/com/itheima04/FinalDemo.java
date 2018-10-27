package com.itheima04;

/**
 * final: 修饰符, 修饰类&成员方法&成员变量
 *
 * 修饰类:      不能被继承, 没有子类
 * 修饰方法:    不能被重写
 * 修饰成员变量: 不能被修改, 常量  必须被初始化(显示初始化/构造函数初始化)
 */

public class FinalDemo {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.eat();

        Dog dog = new Dog();

        System.out.println(dog.NAME);

        // final变量是常量
        // dog.name = "XJ";
    }
}

// final修饰的类不能被继承, 不能有子类
/*final*/ class Animal {
    /*final*/ public void eat() {
        System.out.println("吃东西");
    }
}

class Dog extends Animal {
    @Override
    public void eat() {

    }

    final String NAME = "XKC";

}
