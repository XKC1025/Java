package com.itheima02;

public class StringDemo {
    public static void main(String[] args) {
        // 字符串是特殊的引用数据类型
        // 输出对象名就是输出值, 而不是输出地址
        String s1 = new String("Hello");
        System.out.println(s1);

        // 字符数组转字符串
        char[] chs = {'H', 'e', 'l', 'l', 'o'};
        String s2 = new String(chs);
        System.out.println(s2);

        String s3 = new String(chs, 1, 2);
        System.out.println(s3);

    }
}
