package com.itheima07;

/**
 * 包装类：
 *      基本数据类型, 只能进行简单的操作, 所以java封装基本数据类型, 为每种数据类型提供了包装类
 *      包装类就是封装了基本数据类型的类, 提供了更复杂的方法
 *
 * byte  ->  Byte
 * short ->  short
 * char  ->  Character
 * int   ->  Integer
 * long    ->  Long
 * float   ->  Float
 * double  ->  Double
 * boolean ->  Boolean
 *
 *
 * Integer:
 *      int    -> String
 *      String -> int
 */

public class IntegerDemo {
    public static void main(String[] args) {
        Integer integer = new Integer("22");
        System.out.println(integer.toString());

        int a = Integer.parseInt("+100");
        System.out.println(a);

        String b = Integer.toString(22);
        System.out.println(b + 10);
    }
}
