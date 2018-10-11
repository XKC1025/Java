package com.itheima_04;

/**
 * 三元运算符:  关系表达式?表达式1:表达式2
 * 关系表达式为真, 执行表达式1, 否则执行表达式2
 */

public class OperatorDemo3 {
    public static void main(String[] args) {
        int a = 100;
        int b = 20;
        int d;

        d = (a > b) ? a : b;

        System.out.println(d);

        int c = 500;
        int r;

        // 求三个数的最大值
        r = (((a > b) ? a : b) > c) ? ((a > b) ? a : b): c;
        System.out.println(r);
    }
}
