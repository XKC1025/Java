package com.itheima01;

class B {
    public void a() {
        b();
    }

    public void b() {
        System.out.println("BBB");
    }
}

public class Demo extends B{
    @Override
    public void b() {
        System.out.println("1111");
    }

    public static void main(String[] args) {
        B b = new Demo();
        b.a();
    }
}
