package com.itheima03;

/**
 * 静态方法
 */

public class myArray {
    private myArray() {}

    // 最大的元素
    public static int getMax(int[] arr) {
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // 返回指定参数的索引值
    public static int getIndex(int[] arr, int item) {
        for (int i = 0; i < arr.length; i++) {
            if (item == arr[i]) {
                return i;
            }
        }

        return -1;
    }
}
