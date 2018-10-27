package com.itheima;

/**
 * 处理多个异常
 *
 * 多个catch顺序:
 *      异常子类平级的顺序无所谓
 *      异常子类->父类(从上往下)递进关系
 */

public class MyExceptionDemo2 {
    public static void main(String[] args) {
        String string = null;
        try {
            // NullPointerException
//             System.out.println(string.length());
//
//            int[] arr = new int[10];
//            // ArrayIndexOutOfBoundsException
//            System.out.println(arr[10]);

            System.out.println(10 / 0);

        } catch(NullPointerException e) {
            System.out.println("NullPointerException");
        } catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException");
        } catch(Exception e) {
            System.out.println("未知错误");
        } finally {
            System.out.println("try1 Over!");
        }

//        try {
//            int[] arr = new int[10];
//            // ArrayIndexOutOfBoundsException
//            System.out.println(arr[10]);
//        } catch(ArrayIndexOutOfBoundsException e) {
//            System.out.println("ArrayIndexOutOfBoundsException");
//        } finally {
//            System.out.println("try2 Over!");
//        }

    }
}
