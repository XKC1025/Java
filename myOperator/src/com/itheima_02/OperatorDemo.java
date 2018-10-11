package com.itheima_02;

/**
 * 赋值运算符：
 *      =
 *
 * 拓展运算符：
 *      +=
 *      -=
 *      *=
 *      /=
 *      %=
 *
 * */

public class OperatorDemo {
    public static void main(String[] args) {
        int a = 10;

        // +=赋值
        // 相当于  a = (a的数据类型)(a + 20)
        a += 20;

        System.out.println("a: " + a);

        // 拓展运算符, 隐含了强制类型转换
        // 整数默认int类型, 和short类型运算, int被强制转换成short类型
        short s = 1;

        s += 2;
        System.out.println("s: " + s);

    }
}
