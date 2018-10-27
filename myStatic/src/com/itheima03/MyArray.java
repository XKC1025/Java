package com.itheima03;

public class MyArray {
    public static void main(String[] args) {
        int[] arr = {1, 4, 5, 3, 5, 2, 4, 7, 89, 7, 4};

        int max = myArray.getMax(arr);

        int index = myArray.getIndex(arr, 89);

        System.out.println(max);
        System.out.println(index);
    }
}
