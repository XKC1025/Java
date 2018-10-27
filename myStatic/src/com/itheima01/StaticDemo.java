package com.itheima01;

/**
 * static修饰的成员变量, 多个实例共享这个成员变量, 相当于类变量
 *
 * static修电视的成员方法, 所有的实例共享, 与实例变量无关
 *
 * static修饰的成员, 可以不用实例化, 直接  类名.成员  调用
 *
 * 静态方法的加载优先于实例对象, 和类对象一起加载, 加载到方法区
 *
 */

public class StaticDemo {
    public static void main(String[] args) {
        Person person = new Person();

        person.name = "XKC";
        person.age = 22;
        person.school = "NJIT";

        person.say();

        Person p2 = new Person();
        p2.name = "ZJ";
        p2.age = 22;
//        p2.school = "NJIT";

        p2.say();

        Person.speak();
    }
}

class Person {
    String name;
    int age;
    // 多个成员变量共享这个成员变量, 相当于类变量
    static String school;

    public static void speak() {
        System.out.println("---");
    }

    public void say() {
        System.out.println(name + "---" + school);
    }
}

