package com.itheima05;

/**
 * 格式化时间  date->string
 * 解析       string->date
 *
 */

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatDemo {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss");
        Date date = new Date();

        String s = simpleDateFormat.format(date);
        System.out.println(s);

        Date d = simpleDateFormat.parse("2018年10月20日 08:52:50");
        System.out.println(d.toLocaleString());
    }
}
