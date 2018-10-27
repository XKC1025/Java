package com.itheima05;

/**
 * 继承中, 创建子类对象, 首先调用子类的构造方法, 如果子类的构造方法中, 第一行代码没有调用父类的构造方法(super(String))
 * 就会默认调用父类的无参构造方法
 *
 * 第一行代码是 super(args);  就会调用指定的有参构造方法
 */

public class ExtendsDemo5 {
    public static void main(String[] args) {
        Er er = new Er();
    }
}

class Die {

    public Die() {
        System.out.println("父类无参构造");
    }

    public Die(String name) {
        System.out.println("父类有参构造");
    }

}

class Er extends Die {

    public Er() {
        // Er("XKC"), 调用的是子类的有参构造方法
        this("XKC");
        System.out.println("子类无参构造");
    }

    public Er(String name) {
        // 调用父类的无参构造方法
        super();
        System.out.println("子类有参构造");
    }

}
