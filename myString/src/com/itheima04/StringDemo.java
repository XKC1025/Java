package com.itheima04;

public class StringDemo {
    public static void main(String[] args) {
        String str = "Hello, World!";
        String ss = "hello world java";

        System.out.println(str.length());

        // 获取指定索引的字符, 不支持String[index]
        System.out.println(str.charAt(1));

        // 获取子字符串出现的索引, 没有返回 -1
        System.out.println(str.indexOf("eel"));

        // 截取子字符串, 默认取到末尾
        System.out.println(str.substring(2, 4));

        // 遍历字符串
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }

        // 统计大小写
        int upper = 0;
        int lower = 0;
        int num = 0;
        int other = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if ('A' <= ch && ch <= 'Z') {
                upper++;
            } else if ('a' <= ch && ch <= 'z') {
                lower++;
            } else if ('0' <= ch && ch <= '9') {
                num++;
            } else {
                other++;
            }
        }
        System.out.println(upper);
        System.out.println(lower);
        System.out.println(num);
        System.out.println(other);

        // 将字符串转换成字符数组, 可以使用索引进行取值
        char[] chs = str.toCharArray();

        for (char ch: chs) {
            System.out.println(ch);
        }

        // 转换大小写
        System.out.println(ss.toUpperCase());
        System.out.println(ss.toLowerCase());

        // 去除字符串两边的空格
        System.out.println("  hello, world  ".trim());

        // 按指定符号分割字符串, 分割成一个数组
        System.out.println("h e l l o, w o r l d ".split(" |,")[4]);


        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};

        String stringArr = intArrToString(arr);
        System.out.println(stringArr);

    }


    public static String intArrToString(int[] arr) {
        String s = "[";
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                s += arr[i];
                s += "]";
            } else {
                s += arr[i];
                s+= ", ";
            }
        }

        return s;
    }
}
