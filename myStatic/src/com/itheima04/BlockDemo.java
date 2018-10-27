package com.itheima04;

public class BlockDemo {
    static {
        System.out.println("BlockDemo静态代码块");
    }

    {
        System.out.println("BlockDemo构造代码块的执行");
    }

    public BlockDemo() {
        System.out.println("BlockDemo无参构造");
    }

    public static void main(String[] args) {
        System.out.println("BlockDemo主方法");

        // for 循环代码块
        for (int i = 0; i < 10; i++) {
            System.out.println("I love Java");
        }

        // 变量的作用域(生命周期)只在for循环代码块
        // System.out.println(i);

        // 构造代码块, 把重载的构造函数中重复的代码抽取出来
        // 放到一个代码块中, 每次创建实例都会默认执行
        // 首先执行构造代码块, 再执行构造方法内部语句
        Teacher t1 = new Teacher();
        Teacher t2 = new Teacher("XKC", "22");

        Coder coder = new Coder();
        Coder coder2 = new Coder();

    }
}

class Coder {
    static {
        System.out.println("静态代码块");
    }

    {
        System.out.println("构造代码块");
    }

    public Coder() {
        System.out.println("构造方法语句");
    }

}
