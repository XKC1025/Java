package com.itheima01;

import java.util.*;

//import com.itheima02.PackageDemo0;

/**
 * 包：
 *      可以有多层结构
 *      不同包下的文件名可以重复
 *
 * 类的全名: 包名.类名
 *
 * 相同包和不同包下的类相互访问:
 *      1.相同包下的类, 直接使用
 *
 *
 *      不同包下的类, 使用类的全名 java.util.ArrayList array = new java.util.ArrayList();
 *                  需要导包     import java,util.ArrayList;
 *
 * import java.util.*;  导入的是这个包下的类, 没有导入子包下的类
 *
 */

public class PackageDemo0 {
    public static void main(String[] args) {
        Demo demo = new Demo();

        demo.func();
    }
}
