package com.itheima01;

/**
 *
 * set集合的特点:
 *      1.存储的无序
 *      2.不允许重复
 *      3.无索引
 */

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashDemo {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<>();

        hs.add("  ");

        Set<String> set = new HashSet<>();

        set.add("Hello");
        set.add("hello");
        set.add("java");

        Object[] objs = set.toArray();

        for (int i = 0; i < objs.length; i++) {
            System.out.println((String)objs[i]);
        }

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

        for (String str: set) {
            System.out.println(str);
        }
    }

}
