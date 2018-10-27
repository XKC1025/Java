package com.itheima03;

/**
 * 匿名对象:  没有变量引用的对象
 *
 * 匿名对象的应用场景, 当方法只调用一次的时候
 *
 * 匿名对象可以给成员变量, 可以赋值
 *
 * 匿名对象可以当做参数, 进行传递, 无法在传参之前做赋值操作
 *
 */

public class AnoymouseObjectDemo {
    public static void main(String[] args) {
        // 匿名对象
        // new Student();

        (new Student()).age = 22;

        method(new Student());
    }

    public static void method(Student s) {
        System.out.println(s.name);
    }
}

class Student {
    String name;
    int age;

    public void study() {
        System.out.println("学习");
    }
}
