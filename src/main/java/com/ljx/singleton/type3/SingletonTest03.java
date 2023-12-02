package com.ljx.singleton.type3;

/**
 * @Author: ljx
 * @Date: 2023/12/2 10:52
 */
public class SingletonTest03 {
    public static void main(String[] args) {
        Singleton singleton1 = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton1 == singleton2);
    }
}

class Singleton {
    private static volatile Singleton singleton; // volatile可以防止指令重排，并且保证可见性
    private Singleton() {}
    public static Singleton getInstance() {
        if(singleton == null){
            synchronized (Singleton.class) {
                if(singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
