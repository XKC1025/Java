package com.itheima05;

/**
 * 支持单继承
 *
 * 支持多层继承
 */

public class ExtendsDemo2 {
    public static void main(String[] args) {

        LOL2 lol = new LOL2();
        lol.start();
    }
}

class Game2 {
    public void start() {
        System.out.println("游戏启动");

    }
}

class PCGame extends Game2 {
    public void update() {
        System.out.println("PCGame更新");
    }
}

class MobileGame extends Game2 {
    public void update() {
        System.out.println("MobileGame更新");
    }
}

class LOL2 extends PCGame {
}
