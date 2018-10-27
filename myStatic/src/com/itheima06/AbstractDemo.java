package com.itheima06;

/**
 *  abstract 修饰方法和类
 *
 *  抽象方法： 不同类的方法是相似的, 具体内容又不太一样, 只能抽取方法声明, 没有具体的方法体
 *
 *  抽象方法只能在抽象类中, 在子类中实现
 *  实现： implements, 抽象方法在子类中被重写
 *
 *  抽象类：
 *      有抽象方法的类一定是抽象类
 *      一个类继承抽象类, 一定要重写抽象方法, 非抽象方法可以不写, 否则继承的类也是抽象类
 *
 *      抽象类只能被继承, 不能实例化
 *
 *      抽象类中可以有非抽象方法
 *
 *      一个类继承了抽象类, 要么全部重写抽象方法, 要么本身也是抽象类
 *
 */

public class AbstractDemo {
}

abstract class Animal {
    // 抽象类必须要有抽象方法, 子类中必须要重写
    public abstract void eat();

    // 抽象类可以有非抽象方法, 子类中不一定要重写
    public void run() {
        System.out.println("RUN");
    }
}

class Cat extends Animal {
//    public void eat() {
//        System.out.println("鱼");
//    }

    // 抽象方法必须被实现
    @Override
    public void eat() {
        System.out.println("鱼");
    }
}

// 抽象类可以继承另外一个抽象类
abstract class Dog extends Animal {
//    public void eat() {
//        System.out.println("骨头");
//    }

    // 抽象方法不一定要被实现
//    @Override
//    public void eat() {
//        System.out.println("骨头");
//    }
}
