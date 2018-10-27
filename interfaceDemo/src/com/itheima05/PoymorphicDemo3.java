package com.itheima05;

import com.sun.org.apache.xerces.internal.xs.AttributePSVI;

/**
 * 多态: 引用之间的转化
 *      向上转型和向下转型
 *      1.向上转型: 自动转型, 由小到大  子类型--->父类型
 *      2.向下转型: 强制转型, 由大到小  父类型--->子类型
 *
 */

public class PoymorphicDemo3 {
    public static void main(String[] args) {
        Animal2 animal2 = new Dog2();  // 自动向上转型
        // 多态
        animal2.eat();

        // 强制向下转型, 强制把父类型转换成子类型
        Dog2 dog = (Dog2)animal2;
        dog.swim();
        System.out.println(dog.name);
    }
}

class Animal2 {
    public void eat() {
        System.out.println("吃东西");
    }
}

class Dog2 extends Animal2 {
    String name = "ZJ";

    @Override
    public void eat() {
        System.out.println("啃骨头");
    }

    public void swim() {
        System.out.println("游泳");
    }
}
