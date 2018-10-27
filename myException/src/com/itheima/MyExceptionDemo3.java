package com.itheima;

public class MyExceptionDemo3 {
    public static void main(String[] args) {
        try {
            System.out.println(10 / 0);
        } catch(ArithmeticException e) {
            // String getMessage()   查看出错原因
            System.out.println(e.getMessage());

            // String toString()     查看错误类型&原因
            System.out.println(e.toString());

            // void printStackTrace()  查看错误类型&原因&位置
            e.printStackTrace();
        }

        System.out.println("Over");
    }
}
