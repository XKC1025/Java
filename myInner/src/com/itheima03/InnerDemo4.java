package com.itheima03;

/**
 * 局部内部类, 定义在函数体内
 *
 *
 * 匿名内部类:
 *      new CLASS/INTERFACE() {
 *
 *      };
 *
 *      创建继承的子类对象/实现的类对象
 *
 */

public class InnerDemo4 {
    public static void main(String[] args) {
        OuterDemoD  outerDemo = new OuterDemoD ();

        outerDemo.method();
        outerDemo.method2();
    }
}

interface Inter {
    void function();
}

class OuterDemoD {
    public void method() {
        // 匿名内部类
        new Inter() {
            @Override
            public void function() {
                System.out.println("function");
            }
        }.function();       //  匿名内部类调用方法
    }

    public void method2() {
        // 向上转型
        Inter inter = new Inter() {
            @Override
            public void function() {
                System.out.println("function2");
            }
        };

        inter.function();
        inter.function();

    }

}
