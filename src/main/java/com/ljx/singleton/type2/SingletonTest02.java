package com.ljx.singleton.type2;

/**
 * @Author: ljx
 * @Date: 2023/12/2 10:52
 */
public class SingletonTest02 {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
    }
}

class Singleton {
    private Singleton() {}
    static { // 在静态代码块中创建单例对象
        instance = new Singleton();
    }
    private static Singleton instance;

    public static Singleton getInstance() {
        return instance;
    }
}
