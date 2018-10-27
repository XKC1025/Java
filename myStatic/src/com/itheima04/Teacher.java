package com.itheima04;

public class Teacher {
    private String name;
    private String age;

    public Teacher() {
        // 先执行构造代码块, 再执行构造方法内部语句
        System.out.println("无参空构造");
    }

    public Teacher(String name, String age) {
        System.out.println("有参数构造");
        this.name = name;
        this.age = age;
    }

    {
        for (int i = 0; i < 5; i++) {
            System.out.println("XKC");
        }
    }

    // 静态代码块
    // 在类加载的时候, 默认执行
    // 只会执行一次
    // 加载类时初始化, 加载驱动
    static {
        System.out.println("静态代码块");
    }
}
