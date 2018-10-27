package com.itheima01;

/**
 * 接口:  java不能多继承, 只能用接口实现多继承的特点, 处理继承单一的局限性
 *
 * 比抽象类还抽象, 接口中的抽象方法全是抽象方法
 *
 * 接口和类的关系：　实现  implements
 *
 * 格式：
 *      interface InterFace {
 *
 *      }
 *
 */

public class InterFaceDemo {
    public static void main(String[] args) {
        BillGates billGates = new BillGates();

        billGates.code();
    }
}

class Programmer {
    public void code() {
        System.out.println("写代码");
    }

}

class Boss {
    public void manage() {
        System.out.println("管理公司");
    }
}

class BillGates extends Programmer {

}
