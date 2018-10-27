package com.itheima04;

/**
 * 斐波那契数列
 */

public class Test02 {
    public static void main(String[] args) {
        int[] arr = new int[20];

        arr[0] = 1;
        arr[1] = 1;

        for (int mon = 2; mon < arr.length; mon++) {
            arr[mon] = arr[mon - 1] + arr[mon-2];
        }

        for (int item: arr) {
            System.out.println(item);
        }

    }
}
