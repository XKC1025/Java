package com.itheima01;

/**
 * 类与类之间的关系:
 *      继承: 单一继承, 多层继承
 *
 * 类与接口的关系:
 *      实现: 多实现
 *
 * 接口与接口之间的关系:
 *      继承: 多继承, 不存在方法同名的问题   类必须实现所有接口中的抽象方法
 */

public class InterFaceDemo3 {
    public static void main(String[] args) {

    }

}

interface InterA {
    public abstract void method();

}

interface InterB {
    public abstract void function();

}

interface InterC extends InterB, InterA {

}

class Demo implements InterA, InterB {
    @Override
    public void method() {

    }

    @Override
    public void function() {

    }
}
