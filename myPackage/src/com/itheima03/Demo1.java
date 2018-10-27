package com.itheima03;

import com.itheima02.PackageDemo;

public class Demo1 extends PackageDemo {
    public void func() {
        super.publicMethod();
        super.protectedcMethod();
    }

    public static void main(String[] args) {
        PackageDemo p = new PackageDemo();
//        p.defaultMethod();
//        p.privateMethod();
//        p.protectedcMethod();

        p.publicMethod();
    }
}
