package com.itheima01;

/**
 * String toString()  返回对象的字符串表示, 默认输出对象内存地址, 重写toString()方法, 定制输出内容
 * boolean equals()
 */

public class MyObject {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "XKC";
        s.age = 22;

        // 两种方法相等
        System.out.println(s.toString());  // com.itheima01.Student@677327b6
        System.out.println(s);              // com.itheima01.Student@677327b6
    }
}

class Student {
    String name;
    int age;

    //
    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
