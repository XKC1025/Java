package com.itheima04;

public class StringReverse {
    public static void main(String[] args) {
        String str = "ABCDEFG";

        reverse(str);
        reverse2(str);
        reverse3(str);
    }

    public static void reverse(String str) {
        char[] chs = str.toCharArray();
        char temp = ' ';

        for (int i = 0, j = str.length()-1; i <= j; i++, j--) {
            temp = chs[i];
            chs[i] = chs[j];
            chs[j] = temp;
        }

//        String s = "";
//
//        for (char ch: chs) {
//            s += ch;
//        }

        // 调用构造方法, 构造出String对象
        String s = new String(chs);

        System.out.println(s);
    }

    public static void reverse2(String str) {
        char[] chs = str.toCharArray();
        String s = "";

        for (int i = chs.length - 1; i >= 0; i--) {
            s += chs[i];
        }
        System.out.println(s);
    }

    public static void reverse3(String str) {
        String s = "";
        for (int j = str.length() - 1; j >= 0; j--) {
            s += str.charAt(j);
        }

        System.out.println(s);
    }
}
