package com.itheima;

/**
 * 从键盘获得输入数据, JDK提供的类: Scanner
 *
 * 在一个类中: package > import > class
 *
 * 获取的步骤：
 *      1.导入包   import java.util.Scanner
 *      2.创建对象 Scanner scan = new Scanner(System.in);
 *      3.接收数据 obj.method()   int i = scan.nextInt();
 *
 *
 */

import java.util.Scanner;

public class myScanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("请输入第一个数字: ");
        int sc_0 = scan.nextInt();

        System.out.println("请输入第二个数字: ");
        int sc_1 = scan.nextInt();

        int result;
        result = sc_0 + sc_1;

        System.out.println(result);

    }
}
