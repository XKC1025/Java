package com.itheima_04;

/**
 * 逻辑运算符, 用于连接关系运算符
 * &, |, ^, !
 * &&, ||,
 */

public class OperatorDemo {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;

        // &  有false则false
        System.out.println((a > b) & (b < c));

        // |  有true则true
        System.out.println((a > b) | (b < c));

        // ^  相同为false, 不同为true
        System.out.println((a > b) ^ (b < c));

        // !  取反
        System.out.println(!(a > b));
        System.out.println(!!(a > b));

    }
}
