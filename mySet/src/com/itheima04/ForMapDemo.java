package com.itheima04;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 *
 * 遍历HashMap:
 *      1.map.keySet()  ->  map.get(K);
 *      2.泛型类
 *          class Entry<String, String> {
 *              K k;
 *              V v;
 *
 *              public Entry(K k, V v) {
 *                  this.k = k;
 *                  this.v = v;
 *              }
 *
 *              public K getKey() {
 *                  return k;
 *              }
 *
 *              public V getValue() {
 *                  return v;
 *              }
 *          }
 *
 *
 */

public class ForMapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            map.put("IT00" + i, "XKC00" + i);
        }

        // 遍历key, 获取value
        Set<String> set = map.keySet();
        for (String str: set) {
            System.out.println(map.get(str));
        }

        // Set<Map.Entry<K, V>>  entrySet()
        // 获取Map的内部类Entry, 获取每一个键值对
        Set<Map.Entry<String, String>> entrySet = map.entrySet();
        System.out.println(entrySet);

        for (Map.Entry<String ,String> entry: entrySet) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }


    }
}
