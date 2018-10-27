package com.itheima04;

import java.util.HashMap;
import java.util.Map;

/**
 * Map集合:
 *      Map<K, V>: 双链集合
 *      Collection是单链集合, 有不同的子体系(List & Set)
 *
 */

public class MapDemo {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        // put()
        map.put("IT001", "XKC");
        map.put("IT002", "ZJ");
        // 如果有之前的key, 重新添加将会返回oldValue
        // key不存在, 返回null
        System.out.println(map.put("IT002", "ZJ1"));
        System.out.println(map);

        // containsKey()  判断是否有指定的key
        System.out.println(map.containsKey("IT001"));

        // containsValue()  判断是否有指定的value
        System.out.println(map.containsValue("xukechen"));

        // remove(K)  返回删除对象的值, 没有返回null
        System.out.println(map.remove("IT001"));

        // size()
        System.out.println(map.size());

        // get()
        System.out.println(map.get("IT002"));

        // 清空map
        map.clear();

        // isEmpty();
        System.out.println(map.isEmpty());
    }
}
