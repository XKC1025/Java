package com.itheima02;

import com.sun.xml.internal.bind.annotation.OverrideAnnotationOf;

public class Sporter {
    public static void main(String[] args) {
        BasketballPlayer basketballPlayer = new BasketballPlayer();
        basketballPlayer.name = "XKC";
        basketballPlayer.age = 22;
        basketballPlayer.gender = "男";
        basketballPlayer.eat();
        basketballPlayer.sleep();
        basketballPlayer.speak();
        basketballPlayer.study();


        PingPangCocah pingPangCocah = new PingPangCocah();
        pingPangCocah.name = "ZJ";
        pingPangCocah.age = 22;
        pingPangCocah.gender = "女";
        pingPangCocah.eat();
        pingPangCocah.sleep();
        pingPangCocah.teach();


    }

}


class Person {
    String name;
    int age;
    String gender;

    public Person() {

    }

    public Person(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public void eat() {
        System.out.println("吃饭");
    }

    public void sleep() {
        System.out.println("睡觉");
    }

}

interface SpeakEnglish {
    public abstract void speak();
}

abstract class Player extends Person {
    public abstract void study();

}

abstract class Cocah extends Person {
    public abstract void teach();
}

class BasketballPlayer extends Player implements SpeakEnglish {
    @Override
    public void study() {
        System.out.println("学习扣球");
    }

    @Override
    public void speak() {
        System.out.println("说英语");
    }
}

class PingPangPlayer extends Player {
    @Override
    public void study() {
        System.out.println("学习抽球");
    }
}

class BasketBallCocah extends Cocah implements SpeakEnglish {
    @Override
    public void teach() {
        System.out.println("教扣球");
    }

    @Override
    public void speak() {
        System.out.println("说英语");
    }
}

class PingPangCocah extends Cocah {
    @Override
    public void teach() {
        System.out.println("教抽球");
    }
}