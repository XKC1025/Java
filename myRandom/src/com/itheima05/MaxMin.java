package com.itheima05;

public class MaxMin {
    public static void main(String[] args) {
        int[] arr = {-5, 0, 1, 6, 9, -545, 89, 15, 75};
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println(max);

        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println(min);
    }

}
