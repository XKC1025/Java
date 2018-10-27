package com.itheima;

import java.io.FileWriter;
import java.io.IOException;

/**
 * 异常:
 *      1.编译时异常
 *      2.运行时异常
 *
 * 运行出现异常: 虚拟机会创建一个异常对象
 *
 * 异常体系结构:
 *      Throwable: 最顶层的class
 *
 *      Error:       出现的不能够被处理的严重问题
 *      Exception:   出现的可处理的异常问题
 *
 *
 * 异常处理方式:
 *     1.JVM处理, 把异常的类型/原因/位置信息在控制台输出, 同时终止程序
 *     2.捕获处理
 *     3.抛出异常
 *
 * 捕获处理:
 *      try ... catch ... finally
 *
 *      try {
 *          statement;
 *      } catch(ArithmeticException e) {         // 传递异常对象
 *          fix exception;
 *      }
 *
 * 抛出异常:
 *      不想处理异常&没能力处理异常, 选择抛出异常.   谁调用方法, 谁处理异常
 *      使用关键字throws, 在方法的声明处抛出异常
 *
 */

public class myException {
    public static void function() throws Exception {
        // 编译时异常
        FileWriter fileWriter = new FileWriter("a.txt");
    }

    // 主方法抛出异常, 虚拟机来处理异常
    public static void main(String[] args) throws Exception {
        try {
            // 运行时异常
            int res = 10 / 0;
            System.out.println(res);
            // 编译时异常
            // FileWriter fileWriter = new FileWriter("a.txt");
        } catch(ArithmeticException e) {
            System.out.println("除零错误");
        } finally {
            System.out.println("Finally");

        }

        function();
    }


}
