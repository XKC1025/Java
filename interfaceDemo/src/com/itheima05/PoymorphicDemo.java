package com.itheima05;

/**
 *
 * 多态: 一个对象的多种形态
 *
 * 前提条件:
 *      1.子父类的继承关系
 *      2.方法的重写
 *      3.父类引用指向子类对象
 *
 *
 * 动态绑定:
 *      运行期间: 调用的方法, 根据其具体的类型, 小动物喜欢吃啥--->这个小动物是猫--->吃鱼  自动找到具体的实例对象
 *      编译期间
 */

public class PoymorphicDemo {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.eat();

        // 父类引用: Animal animal
        // 指向:     =
        // 子类对象: new Cat()
        Animal animal = new Cat();  // 子类实例, 也是父类的一个实例
        animal.eat();
    }
}

class Animal {
    public void eat() {
        System.out.println("吃东西");
    }
}

class Cat extends Animal {
    @Override
    public void eat() {
        System.out.println("猫吃鱼");
    }
}
