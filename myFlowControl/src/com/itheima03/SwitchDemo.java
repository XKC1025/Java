package com.itheima03;

/**
 * switch (表达式) {
 *     case value1:
 *          语句体1;
 *          break;
 *     case value2:
 *          语句体2;
 *          break;
 *      .....
 *     default:
 *          语句体n+1;
 *          break;
 *   }
 *
 * 表达式数据类型：byte, short, int, char, enum, String
 *
 * 执行流程：
 *      1.首先计算表达式的值
 *      2.依次与case后面的值进行比较
 *      3.匹配执行对应的语句体
 *      4.所有不匹配执行default
 *
 */

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("请输入一个数字: \n");
        int weekday = scan.nextInt();

        switch (weekday) {
            case 1:
                System.out.println("周一");
                break;
            case 2:
                System.out.println("周二");
                break;
            case 3:
                System.out.println("周三");
                break;
            case 4:
                System.out.println("周四");
                break;
            case 5:
                System.out.println("周五");
                break;
            case 6:
                System.out.println("周六");
                break;
            case 7:
                System.out.println("周七");
                break;
            default:
                System.out.println("输入有误");
                break;

        }
    }
}
