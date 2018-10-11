package com.itheima;

import java.util.Scanner;

public class myScanner_2 {
    public static void main(String[] args) {
        int num_0;
        int num_1;

        Scanner scan = new Scanner(System.in);

        System.out.println("请输入第一个数据: ");
        num_0 = scan.nextInt();

        System.out.println("请输入第二个数据: ");
        num_1 = scan.nextInt();

        boolean bool = (num_0 == num_1);
        System.out.println(bool);

    }
}
