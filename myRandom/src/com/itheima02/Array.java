package com.itheima02;

/**
 * 数组： 存储多个变量, 容器
 *       多个变量的类型必须一致
 *
 * 定义格式： A.数据类型[] 数组名;
 *           B.数据类型 数组名[];
 *
 *           区别： int[] arr;   定义一个int类型的数组, 数组名是arr
 *                 int arr[];   定义一个int类型的变量, 变量名是arr数组
 *
 *
 *           数组的初始化:
 *                  初始化, 为数组在内存中开辟空间, 并为数组中的每个元素赋予初始值
 *                  1.动态初始化 只给出长度, 由系统给出初始化值
 *                  2.静态初始化 给出初始化值, 由系统决定长度
 *
 *           动态初始化格式： 数据类型[] 数组名 = new 数据类型[数组长度];
 */

public class Array {
    public static void main(String[] args) {
        // 动态初始化, 初始化值默认0
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i]++;
            System.out.println(arr[i]);
        }
        // [I@677327b6   数组的内存地址  [代表数组
        System.out.println(arr);

        // 静态初始化
        int[] arr2 = {1, 2, 3, 4, 5, 6, 7};

        for (int j = 0; j < 7; j++) {
            arr2[j] -= 10;
            System.out.println(arr2[j]);
        }
        System.out.println(arr2);



    }
}
