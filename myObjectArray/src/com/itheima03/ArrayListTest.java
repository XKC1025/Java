package com.itheima03;

import java.util.ArrayList;

public class ArrayListTest {
    public static void main(String[] args) {
        ArrayList<String> string = new ArrayList<String>();

        string.add("张无忌");
        string.add("曾阿牛");
        string.add("张翠山");

        for (String str: string) {
            if (str.startsWith("张")) {
                System.out.println(str);
            }
        }
    }
}
