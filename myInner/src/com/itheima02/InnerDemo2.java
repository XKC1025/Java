package com.itheima02;

/**
 * 内部类的修饰符:
 *      public default protected private(只能在所在外部类中创建对象)
 *
 *      可以使用static修饰, 不用创建外部类对象就可以创建内部类对象
 *
 */

public class InnerDemo2 {
    public static void main(String[] args) {
        Outer2.Inner2 inner2 = new Outer2.Inner2();

//        inner2.function();
        Outer2.Inner2.function();
    }
}

class Outer2 {
    public void method() {

    }

    static class Inner2 {
        public static void function() {
            System.out.println("function");
        }
    }
}
