package com.ljx.singleton.type4;

/**
 * @Author: ljx
 * @Date: 2023/12/2 11:50
 */
public class SingletonTest04 {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
    }
}

class Singleton {
    private static Singleton instance;
    private Singleton() {}
    private static class SingletonInstance {
        private static final Singleton INSTANCE = new Singleton();
    }
    public static Singleton getInstance() {
        return SingletonInstance.INSTANCE;
    }
}