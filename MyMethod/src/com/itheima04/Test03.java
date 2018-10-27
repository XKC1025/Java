package com.itheima04;

public class Test03 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};

        reverse(arr);

        for (int item: arr) {
            System.out.println(item);
        }
    }

    // 引用类型的数据, 直接改变堆对象中的值, 所以返回值就是void
    public static void reverse(int[] arr) {
        for (int start = 0, end = arr.length - 1; start <= end; start++, end--) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
        }
    }
}
