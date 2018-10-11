package com.itheima_04;

import java.sql.SQLOutput;

/**
 * &&, ||  是&, |的短路运算
 * */

public class OperatorDemo2 {
    public static void main(String[] args) {
        int a = 3;
        int b = 4;
        int c = 5;

        // &&  有false则false   &与&&用法一样
        System.out.println((a > b) && (b < c));

        // ||  有true则true     |与||用法一样
        System.out.println((a > b) || (b < c));

        // 区别, &&和||都是短路运算
        int x = 10;
        int y = 20;

        System.out.println((x++ > 10) && (y++ > 20));

        System.out.println("x: " + x);
        System.out.println("y: " + y);

        System.out.println((++x > 10) || (++y >20));

        System.out.println("x: " + x);
        System.out.println("y: " + y);

    }
}
