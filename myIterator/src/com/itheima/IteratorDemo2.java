package com.itheima;

import java.util.*;

public class IteratorDemo2 {
    public static void main(String[] args) {
        List list = new ArrayList();

        list.add("Hello, ");
        list.add("World!");
        list.add("I love ");
        list.add("java");



        ListIterator iterator2 = list.listIterator();

        while (iterator2.hasNext()) {
            String s = (String)iterator2.next();
            if (s.equals("java")) {
                // 迭代器添加元素, 同步集合
                iterator2.add("android");
            }
        }

        System.out.println(list);

    }
}
