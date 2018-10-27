package com.itheima04;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ForMapDemo2 {
    public static void main(String[] args) {
        // 自定义对象作为key
        HashMap<Student, String> map = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            map.put(new Student("IT00" + 1, 22), "XKC00" + 1);
        }

        // 遍历
        for (Map.Entry<Student, String> entry: map.entrySet()) {
            System.out.println(entry.getKey().getName() + entry.getKey().getAge() + ": " +entry.getValue());
        }


    }
}
