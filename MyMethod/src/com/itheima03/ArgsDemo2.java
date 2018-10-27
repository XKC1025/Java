package com.itheima03;

/**
 * 如果参数的数据类型是引用数据类型:
 *     形式参数的改变, 直接影响到实际参数的改变
 *
 *     实参和形参都是指向的同一个内存区域的堆对象
 */

public class ArgsDemo2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        System.out.println(arr);  // [I@677327b6

        change(arr);

        System.out.println("=================");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        printArr(arr);
    }

    public static void change(int[] arr) {
        // 对于引用类型, 传递的是地址值
        System.out.println(arr);   // [I@677327b6

        for (int j = 0; j < arr.length; j++) {
            if ((arr[j] % 2) == 0) {
                arr[j] *= 2;
            }
        }
    }

    public static void printArr(int[] array) {
        System.out.print('[');

        for (int k = 0; k < array.length; k++) {
            if (k == (array.length - 1)) {
                System.out.println(array[k] + "]");
            } else {
                System.out.print(array[k] + ", ");
            }
        }
    }
}
