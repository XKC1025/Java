package com.itheima01;

/**
 * 接口不能实例化
 * 类与接口的关系: 一个类实现一个接口, 必须实现接口中所有的方法
 *
 * 接口中只能有抽象方法和常量
 *
 */

public class InterFaceDemo2 {
    public static void main(String[] args) {

    }
}


// 接口, 全部是抽象方法
// 默认 public abstract 修饰抽象方法
// 接口中的抽象方法只能是public abstract
// 默认使用　public static final　修饰, 就是常量, 必须有初始化值
interface Animal {
    public static final int num = 22;
    public abstract void eat();
}

// 类实现接口
// 类中没有实现, 就是抽象类　　类中全部重写实现就是类
class Cat implements Animal {
    @Override
    public void eat() {

    }
}