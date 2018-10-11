package com.itheima04;

/**
 * 数组静态初始化
 *  数据类型[] 数组名 = new 数据类型[]{val1, val2, val3, .....}
 *
 *  简单格式：　　数据类型[] 数组名　= {val1, val2, val3, .....}
 *  本质上也是创建堆内存对象
 *
 */

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        int[] arr2 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }

        System.out.println(arr);
        System.out.println(arr2);



    }
}
