package com.itheima05;

/**
 *
 * this 和 super的区别:
 *      A.this当前对象的引用, 调用子类的成员变量&成员方法&其他构造方法
 *
 *      B.super子类对象的父类引用, 只是类, 不是实例对象
 *          调用父类的成员变量&成员方法
 */

public class ExtendsDemo6 {
    public static void main(String[] args) {
        B b = new B();

        b.function();

    }
}

class A {
    int num = 30;

    public A() {
        System.out.println("父类无参构造");
    }

    public A(int num) {
        System.out.println("父类有参构造");
    }

    public void method() {
        System.out.println("父类的方法");
        System.out.println(num);
    }
}

class B extends A {
//    int num = 10;

    public B() {
        this(50);
        System.out.println("子类无参构造");
    }

    public B(int num) {
        super(num);
        System.out.println("子类有参构造");
    }

    @Override
    public void method() {
        System.out.println("子类的方法");
    }

    public void function() {
        this.num = 100;
        System.out.println(num);

        this.method();

        super.num = 1000;
        super.method();
    }
}
