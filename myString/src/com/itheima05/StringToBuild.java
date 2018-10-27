package com.itheima05;

/**
 * StringBuilder 和 String 相互转化
 */

public class StringToBuild {
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        builder.append("Hello, ").append("World!");

        // StringBuilder转化成String
        String s = builder.toString();
        System.out.println(s);

        // String 转化成 StringBuilder
        String str = "Hello, World!";

        // 通过构造方法, String初始化StringBuilder
        StringBuilder ss = new StringBuilder(str);
        ss.append(" I love Java");

        System.out.println(ss.toString());
    }
}
