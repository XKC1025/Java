package com.itheima03;

public class ArrayTest {
    public static void main(String[] args) {
        int[] arr = new int[10];
        System.out.println(arr);

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i;
            System.out.println(arr[i]);
        }

        System.out.println(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
