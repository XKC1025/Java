package com.itheima;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 集合: collection
 *
 * 集合的体系结构:  自顶向下学习
 *      collection: 包含集合的共性
 *      List:       列表
 *      ArrayList:  数组列表
 *
 */

public class CollectionDemo {
    public static void main(String[] args) {
        // 不限制类型, 可以保存任意对象的引用
        ArrayList array = new ArrayList();

        array.add(10);        // 自动装箱
        array.add("Hello, ");
        array.add("World!");

        for (int i = 0; i < array.size(); i++) {
//            System.out.println(array.get(i));
        }

        // 接口不可以创建对象, 可以指向实现类的对象
        // 多态
        Collection collec = new ArrayList();

        // boolean add(E e)
        // 允许重复, 永远返回true
        System.out.println(collec.add("hello"));
        System.out.println(collec.add("world"));

        System.out.println(collec);  // [hello, world]

        // void clear()
        // collec.clear();
        // System.out.println(collec);

        // boolean contains(Object obj)
        System.out.println(collec.contains("hello"));

        // boolean isEmpty()
        System.out.println(collec.isEmpty());

        // boolean remove(Object obj)
        System.out.println(collec.remove("helo"));

        // Object[] toArray()
        // 转化成数组, 可以使用objs[i]
        Object[] objs = collec.toArray();

        for (Object str: objs) {
            System.out.println(str);
        }
    }
}
