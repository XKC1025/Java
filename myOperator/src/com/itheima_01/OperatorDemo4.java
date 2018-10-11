package com.itheima_01;

/***
 *   ++   --  运算
 *   单独使用放在变量的前面/后面结果一样
 *
 *   a++ 先参与运算再自增1
 *   --a 先自增1再参与运算
 */


public class OperatorDemo4 {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("a:" + a);


        // ++运算
        int b = a++;
        System.out.println("a:" + a + "     b:" + b);

        // --运算
        int c = --a;
        System.out.println("a:" + c);

    }

}
