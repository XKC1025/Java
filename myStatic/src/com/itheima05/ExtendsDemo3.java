package com.itheima05;

/**
 * 继承的成员变量特点:
 *      1.子类只能继承父类的非私有成员
 *
 * 就近原则:
 *      使用最近的成员变量, 子类覆盖父类的成员变量
 *
 * super: 父类对象的引用, 只针对上一级父类
 *
 */

public class ExtendsDemo3 {
    public static void main(String[] args) {
        Son son = new Son();

        son.show();

        son.eat();
    }
}

class Grand {
    String age = "71";
}

class Dad extends Grand {
    // 子类只能继承父类非私有成员
    private String name = "Dad";

    String age = super.age;

    public void eat() {
        System.out.println("吃饭");
    }
}

class Son extends Dad {
    String name = "Son";
    String age = "22";

    public void show() {
        System.out.println(name);
        System.out.println(age);
        System.out.println(super.age);
    }

    // 重写方法
    // 重写父类的方法, 返回值等完全一样
    @Override
    public void eat() {
        System.out.println("吃两碗饭");
    }
}
