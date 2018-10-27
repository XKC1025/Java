package com.itheima04;

public class ForTest4 {
    public static void main(String[] args) {
        int x;
        int y;
        int z;
        int count = 0;

        for (int i = 100; i <= 999; i++) {
            x = i % 10;
            y = (i / 10) % 10;
            z = i / 100;

            boolean result = (i == x * x * x + y * y * y + z * z * z);

            if (result) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println(count);
    }
}
