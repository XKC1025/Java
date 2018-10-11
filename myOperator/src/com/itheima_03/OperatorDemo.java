package com.itheima_03;

/**
 * 关系运算符：
 * ==, !=, >, >=, <, <=   运算的结果是boolean类型
 */

public class OperatorDemo {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 10;

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a != b);
        System.out.println(a > b);
        System.out.println(a <= b);

        // 注意： 赋值运算
        System.out.println(a = b);
    }
}
