package com.itheima06;

/**
 * 二维数组： 本质上元素是一维数组的数组
 * 定义格式：
 *      A.数据类型[][] 数组名;
 *      B.数据类型 数组名[][];
 *      C.数据类型[] 数组名[];
 *
 * 初始化：
 *      动态初始化:   数据类型[][] 数组名 = new 数据类型[m][n];
 *                   m表示的是二维数组中的一维数组的个数, n表示的一维数组元素的个数
 *
 *      静态初始化：   数据类型[][] 数组名 = new 数据类型[][]{{val1, ...}, {val2,...}, ....};
 *                   数据类型[][] 数组名 = {{val1, ...}, {val2,...}, ....}
 *
 */

public class ArrayArrayDemo {
    public static void main(String[] args) {
        int m = 10;
        int n = 10;
        int[][] a = new int[m][n];

        for (int i = 1; i < a.length; i++) {
            for (int j = 1; j < a[i].length; j++) {
                a[i][j] = i * j;
                System.out.print(a[i][j]);
                System.out.print(' ');
            }
            System.out.println();
        }


        int[][] arr = {{1, 2, 3}, {4, 5, 6, }, {7, 8, 9, }};

        System.out.println(arr);    // [[I@677327b6   '[['表示二维数组指针
        System.out.println(arr[0]); // [I@14ae5a5     '[' 表示一维数组指针

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]);
                System.out.print(' ');
            }

        }


    }

}
