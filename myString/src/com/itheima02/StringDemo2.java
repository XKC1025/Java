package com.itheima02;

/**
 * String string = new String("Hello");  和  String string = "Hello";的区别
 * 通过构造方法创造出来的String对象, 放在堆内存
 * 直接赋值的String对象, 放在方法区的常量池
 *
 * == 的作用:
 *      1.比较数据类型的值
 *      2.比较引用数据类型的地址值
 */

public class StringDemo2 {
    public static void main(String[] args) {

        // new出来的String对象, 字符串的内容放在方法区的常量池内, 方便字符串的重复使用
        // 堆内存保存的是指向方法区字符串的内存地址
        // s1指向的是堆内存的地址
        String s1 = new String("Hello");

        // 方法区的常量池内的字符串直接赋值给s2
        // s2直接指向的是方法区的地址
        String s2 = "Hello";

        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s1 == s2);

        // s3直接指向的是方法区的常量池, 与s2的指向是同一个字符串
        String s3 = "Hello";
        System.out.println(s1 == s3);
        System.out.println(s2 == s3);

    }
}
