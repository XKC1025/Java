package com.itheima02;

import java.util.ArrayList;
import java.util.Objects;

/**
 * equals: 使用==来比较两个对象是否相等
 *
 * 基本数据类型比较值, 引用数据类型比较地址
 */

public class Equals extends Object {
    public static void main(String[] args) {
        Person p1 = new Person("XKC", 22);
        Person p2 = new Person("XKC", 22);

        System.out.println(p1.equals(new ArrayList()));
    }
}

class Person {
    String name;
    int age;

    public Person() {}

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return age + "";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return age == person.age &&
                Objects.equals(name, person.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
}

