package com.itheima_01;
/**
 * 运算符:
 *      算数运算符 +-/*
 *      赋值运算符
 *      关系运算符
 *      逻辑运算符
 *      三元运算符
 *
 * 表达式
 *
 *
 *
 */

public class OperatorDemo {
    public static void main(String[] args){
        int a = 3;
        int b = 4;

        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        // 整数相除只能得到整数
        // 想要得到小数, 必须要有浮点数参与运算
        System.out.println((float)a / b);

    }

}
