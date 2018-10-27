package com.itheima04;

import java.util.Date;

public class DateDemo {
    public static void main(String[] args) {
        Date date = new Date();
        System.out.println(date);  // Sat Oct 20 18:23:34 CST 2018

//        date.setTime(System.currentTimeMillis());
        System.out.println(date.getTime());

        Date date1 = new Date(3600000);

        System.out.println(date1.toLocaleString());


    }
}
