package com.ljx.singleton.type1;

/**
 * @Author: ljx
 * @Date: 2023/12/2 10:52
 */
public class SingletonTest01 {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
    }
}

class Singleton {
    private Singleton() {
    }
    private final static Singleton instance = new Singleton();

    public static Singleton getInstance() {
        return instance;
    }
}
