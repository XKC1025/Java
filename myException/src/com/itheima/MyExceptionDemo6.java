package com.itheima;

/**
 * throws: 把异常抛出, 由方法调用者处理
 *
 * 自定义异常:
 *      throw exception   制造异常, 抛出异常对象
 *
 * 抛出的是编译时期异常, 必须在方法声明处声明 throws Exception
 * 抛出的是运行时期异常, 方法声明可不throws
 */

class Myexception extends RuntimeException {
    public Myexception() {super();}
    public Myexception(String message) {super(message);}
}

public class MyExceptionDemo6 {
    public static void checkScore(int score) {
        if (score > 200) {
            throw new Myexception("成绩大于200");
        }
        if (score < 0 || score > 100) {
            // 终止程序, 抛出异常对象
            throw new RuntimeException("非法成绩");
        }
        System.out.println("考试成绩符合要求");
    }

    public static void main(String[] args) {
        try {
            checkScore(1500);

        } catch(Myexception e) {
            System.out.println(e.getMessage());
        } catch(RuntimeException e) {
            System.out.println(e.getMessage());
        } catch(Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Programme Over");
    }
}
