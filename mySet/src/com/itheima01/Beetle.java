package com.itheima01;


class Inspect {
    private int i = 9;
    protected int j;
    public Inspect() {
        System.out.println("i = " + i + ", " + "j = " + j);
        j = 39;
    }

    private static int x1 = printInit("Hello, world!");
    static int printInit(String s) {
        System.out.println(s);
        return 47;
    }
}

public class Beetle extends Inspect {
    private int k = printInit("Beetle.k initialized");
    public Beetle() {
        System.out.println(" k = " + k);
        System.out.println("j = " + j);
    }

    private static int x2 = printInit("static Beetle.x2 initialized");

    public static void main(String[] args) {
        System.out.println("Beetle constructor");
        Beetle beetle = new Beetle();
        Beetle beetle2 = new Beetle();

//        printInit("123");

    }
}
