package com.itheima03;

public class ArrayTest2 {
    public static void main(String[] args) {
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            System.out.println(arr[i]);
        }

        int[] arr2 = arr;

        for (int i = 0; i < arr.length; i++) {
            arr2[i] = i * 10;
            System.out.println(arr2[i]);
        }

        // arr2是arr的引用
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // 指向同一堆内存地址
        System.out.println(arr == arr2);

        int a = 10;
        int b = a;

        // 不可变对象, 改变值, 就是改变指向
        System.out.println(a);
        System.out.println(b);

        b = 100;
        System.out.println(a); // 10
        System.out.println(b); // 100
    }
}
