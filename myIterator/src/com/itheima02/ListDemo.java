package com.itheima02;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    public static void main(String[] args) {
        // 列表
        List<String> list = new ArrayList<>();

        list.add(0, "Hello");
        list.add(0, "World");
        list.add(0, "I love java");

        System.out.println(list);
        System.out.println(list.get(2));

        for (String str: list) {
            System.out.println(str);
        }

        // 删除指定元素, 并返回删除的对象
        System.out.println(list.remove(0));

        // 修改指定元素, 并返回修改之前的值
        System.out.println(list.set(0, "测试"));
        System.out.println(list);
    }
}
