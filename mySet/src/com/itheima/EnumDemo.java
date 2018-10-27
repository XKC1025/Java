package com.itheima;

public class EnumDemo {
    public static void main(String[] args) {
        for (Enum e: Enum.values()) {
            System.out.println(e + "--->" + e.ordinal());
        }
    }
}

enum Enum {
    NOT, MILD, MEDIUM, HOT, FLAMING
}
