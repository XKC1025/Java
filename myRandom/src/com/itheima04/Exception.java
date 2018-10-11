package com.itheima04;

public class Exception {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

        // 数组索引越界异常
        // java.lang.ArrayIndexOutOfBoundsException: 8
        // System.out.println(arr[8]);
        System.out.println(arr[7]);

        // 引用类型：类 接口 数组, 可以有多个引用指向同一个对象
        // 常量： 空常量, null, 可以赋值给引用类型的
        arr = null;

        // java.lang.NullPointerException  空指针异常
        // 原因： 数组不再指向堆内存的数据了, 指向null
        System.out.println(arr[1]);
    }
}
