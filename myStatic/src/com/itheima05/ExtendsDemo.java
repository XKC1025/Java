package com.itheima05;

/**
 * 继承: 多个类有共同的成员变量和成员方法, 抽取到父类, 多个类继承父类
 *
 * extends
 *
 *
 */

public class ExtendsDemo {
    public static void main(String[] args) {
        Dota dota = new Dota();
        dota.start();
        dota.stop();

        LOL lol = new LOL();
        lol.start();
    }
}

class Game {
    String name;
    double version;  //版本号
    String agent;

    public void start() {
        System.out.println("启动游戏");
    }

    public void stop() {
        System.out.println("游戏结束");
    }
}

class Dota extends Game {
    public void play() {
        System.out.println("Dota");
    }

    public void stop() {
        System.out.println("Data stop");
    }

}

class LOL extends Game {
    public void play() {
        System.out.println("LOL");
    }

    public void start() {
        System.out.println("LOL start");
    }

}