package com.itheima01;

class Cycle {
    public void func() {
        System.out.println("基类方法");
    }
}

class Unicycle extends Cycle {
    public void func() {
        System.out.println("Unicycle方法");
    }
}

class Bicycle extends Cycle {
    public void func() {
        System.out.println("Bicycle方法");
    }
}

class Tricycle extends Cycle {
    public void func() {
        System.out.println("Tricycle方法");
    }
}

public class DuoTai {
    public static void method(Cycle t) {
        t.func();
        System.out.println(t);
    }

    public static void main(String[] args) {
        Tricycle tricycle = new Tricycle();
        Bicycle bicycle = new Bicycle();
        method(tricycle);
        method(bicycle);
    }

}


