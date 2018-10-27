package com.itheima04;

import java.util.HashMap;
import java.util.Map;

public class MapDemo2 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();

        for (int i = 0; i < 10; i++) {
            map.put("IT00" + i, "XKC00" + i);
        }

        // Set<K> keySet()  返回所有的键集合
        System.out.println(map.keySet());

        // Collection<V> values()  返回所有的值集合
        System.out.println(map.values());
    }
}
