package com.itheima03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

/**
 * Connections 和 Collection的区别:
 *      Collection是集合体系的最顶层, 包含集合体系的共性List  Set
 *      Collections是工具类, 全都是静态方法, 不可创建对象, 用于操作Collection
 *
 */

public class CollectionsDemo {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            System.out.println(random.nextInt());
            list.add(i);
        }

        // 二分查找 binarySearch
        int index = Collections.binarySearch(list, 9);
        System.out.println(index);

        // copy
        List<String> src = new ArrayList<>();
        src.add("hello");
        src.add("world");
//        src.add("java");

        List<String> des = new ArrayList<>();
        des.add("aaa");
        des.add("BBB");
        des.add(null);
        // 用src列表覆盖des列表对应的位置, src不够的仍用des原来的数据
        // 目标列表至少等于源列表的长度
        Collections.copy(des, src);

        for (String str: des) {
            System.out.println(str);
        }

        // fill用指定对象填充指定列表
        List<String> list1 = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list1.add("String");
        }

        Collections.fill(list1, "string");
        list1.set(0, list1.get(0) + "aa");
        Collections.reverse(list1);
        for (String str: list1) {
            System.out.println(str);
        }

        // shuffle   随机排列
        List<Integer> list2 = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list2.add(i);
        }

        Collections.shuffle(list2);
        for (int item: list2) {
            System.out.println(item);
        }

        System.out.println(list2);

        // 对指定列表进行排序, 默认升序
        Collections.sort(list2);
        System.out.println(list2);

        // 把列表中两个元素进行交换
        Collections.swap(list2, 0, 19);
        System.out.println(list2);



    }
}
