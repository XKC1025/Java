package com.itheima05;

import java.util.Scanner;

public class HuiWenShu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);


        while (true) {
            System.out.println("请输入一个字符串: ");
            String str = scan.nextLine();
            func(str);
        }

    }

    public static void func(String str) {
        StringBuilder builder = new StringBuilder();
        String new_str = builder.append(str).reverse().toString();
        if (str.equals(new_str)) {
            System.out.println("回文数");
        } else {
            System.out.println("非回文数");
        }

    }
}
