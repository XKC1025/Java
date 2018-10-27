package com.itheima02;

/**
 *
 * 1.静态方法可以调用静态变量
 * 2.静态方法可以调用静态方法
 * 3.静态方法不可以使用成员变量 / 调用非静态方法
 *
 * 静态方法只能调用静态的变量和方法
 *
 * 非静态方法可以调用非静态方法&变量和静态方法&变量
 *
 * 静态方法中没有this.
 *
 * static的优缺点:
 *          A.多个实例的共享数据提供单独的存储, 节省空间   可以直接被类名调用, 不需要在堆上创建实例对象
 *          B.访问有局限性, 只能访问静态
 *
 */

public class StaticDemo2 {
    public static void main(String[] args) {
        Student.school = "NJIT";
        Student.study();

        Student s = new Student();
        s.eat();
        s.sport();

        // Math, 工具类, 构造方法私有, 不能创建对象
        double PI = Math.PI;
    }
}

class Student {
    String name;
    String age;
    static String school;

    // 静态方法可以调用静态成员变量
    // 静态方法可以调用静态方法
    // 静态方法不可以调用非静态成员方法 / 调用非静态方法
    public static void study() {
        System.out.println(school);
        sleep();
    }

    public static void sleep() {
        System.out.println("Sleeping...");
    }

    public void eat() {
        System.out.println("eating...");
        sleep();
    }

    public void sport() {
        System.out.println("Sporting...");
        eat();
    }
}
