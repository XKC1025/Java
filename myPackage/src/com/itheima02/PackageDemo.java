package com.itheima02;

import com.sun.xml.internal.bind.v2.runtime.reflect.Lister;

/**
 * 权限修饰符:
 *      public:     当前类, 同包下, 不同包下的类
 *      default     当前类, 同包下不同的类
 *      private     当前类,
 *      protected   当前类, 同包下不同的类
 *
 *      default:   当前包下
 *      protected: 子类对象
 */

public class PackageDemo {
    public void publicMethod() {
        System.out.println("publicMethod");
    }

    void defaultMethod() {
        System.out.println("defaultMethod");
    }

    private void privateMethod() {
        System.out.println("privateMethod");
    }

    protected void protectedcMethod() {
        System.out.println("protectedMethod");
    }

    public static void main(String[] args) {
        PackageDemo packageDemo = new PackageDemo();

        packageDemo.publicMethod();
        packageDemo.defaultMethod();
        packageDemo.privateMethod();
        packageDemo.protectedcMethod();

    }

}
