package com.itheima_01;

public class OperatorDemo3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println(a + b);

        // 字符参与加法运算
        // char类型参与运算, 使用ascii码值运算
        // {'A': 65, 'a': 97, '0': 48}
        char c = 'A';
        System.out.println(a + c);  // 75

        // 字符串参与加法运算
        // 数值类型转化成String类型, 加法运算做字符串拼接
        String s = "ABC";
        float f = 100.001F;
        System.out.println(s + a + f);
        System.out.println(a + f + s); // 从左往右进行运算, a和f会进行数值相加
        System.out.println(a + s + f);
    }
}
