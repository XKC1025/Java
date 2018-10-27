package com.itheima01;

class C {
    void g() {

    }

    void f() {

    }
}

public class DEMO2  extends C {
    void g() {}
    void f() {}
    void u() {}

    public static void main(String[] args) {
        C a = new DEMO2();
        C b = new C();

        b = (C) a;

        b.g();
    }
}
