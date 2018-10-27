package com.itheima;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 * 遍历结合:
 *      1.toArray()转化成数组
 *      2.迭代器
 */

public class IteratorDemo {
    public static void main(String[] args) {
        Collection collection = new ArrayList();
        collection.add("Hello, ");
        collection.add("World!");
        collection.add("I love Java");

        // 迭代器对象
        Iterator iterator = collection.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());

        }

    }
}
