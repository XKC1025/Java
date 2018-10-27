package com.itheima05;

public class IntToString {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        StringBuilder builder = new StringBuilder();

        for (int item: arr) {
            builder.append(item);
        }

        System.out.println(builder.toString());
    }
}
