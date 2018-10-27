package com.itheima04;

import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // 没有break;  会继续执行下一条case, 直到遇到break;
        // case穿透
        while (true) {
            System.out.print("月份: ");

            switch (scan.nextInt()) {
                case 3: case 4: case 5:
                    System.out.println("春季");
                    break;
                case 6: case 7: case 8:
                    System.out.println("夏季");
                    break;
                case 9: case 10: case 11:
                    System.out.println("秋季");
                    break;
                case 12: case 1: case 2:
                    System.out.println("冬季");
                    break;
                default:
                    System.out.println("输入有误!");

        }

        }
    }
}
