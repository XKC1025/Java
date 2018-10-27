package com.itheima01;

/**
 * 成员内部类:
 *      在类的成员位置, 和成员变量和成员方法相同的位置, 可以引用外部类的成员, 包括私有变量
 *      会有内部类单独的编译文件
 */

public class InnerDemo {
    public static void main(String[] args) {
        Outer outer = new Outer();

        outer.method();

        // 创建内部类的对象
        // 1.先创建外部类的对象  2.在外部类的对象上创建内部类对象
        Outer.Inner inner = (new Outer()).new Inner();
        inner.function();

    }
}

class Outer {
    private int num = 10;

    public void method() {
        Inner inner = new Inner();
        inner.function();
    }

    class Inner {
        public void function() {
            System.out.println(num);
        }
    }
}


