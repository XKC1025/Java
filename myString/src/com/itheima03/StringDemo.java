package com.itheima03;

public class StringDemo {
    public static void main(String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = "hello";

        // 字符串比较使用equals, 基本数据类型使用 ==
        // 引用数据类型使用 == 比较的是两个对象的内存地址
        System.out.println(s1.equals(s2));
        System.out.println(s1.equalsIgnoreCase(s3));

        System.out.println(s1.startsWith("H"));
        System.out.println(s1.startsWith("el", 1));
    }
}
