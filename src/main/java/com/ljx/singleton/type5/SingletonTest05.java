package com.ljx.singleton.type5;

/**
 * @Author: ljx
 * @Date: 2023/12/2 12:05
 */
public class SingletonTest05 {
    public static void main(String[] args) {
        Singleton instance = Singleton.INSTANCE;
        Singleton instance2 = Singleton.INSTANCE;
        System.out.println(instance == instance2);
        System.out.println(instance.hashCode());
        System.out.println(instance2.hashCode());
        instance.sayOk();
    }
}

enum Singleton {
    INSTANCE; // 属性
    public void sayOk() {
        System.out.println("ok");
    }
}
