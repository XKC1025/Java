package com.itheima05;

public class ExtendsDemo4 {
    public static void main(String[] args) {
        NewPhone newPhone = new NewPhone();

        newPhone.call();
    }
}

class Phone {
    void call() {
        System.out.println("打电话");
    }
}

class NewPhone extends Phone {
    // @注解, 校验标记重写父类的方法
    // 子类重写方法的权限, 必须大于等于父类的权限
    @Override
    public void call() {
        System.out.println("视频 ");
        // 调用父类的方法
        super.call();
    }
}
