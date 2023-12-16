package com.example.patterns.creational.singleton;

/**
 * @author tuan.nguyen3
 */
public class LazingSingletonMain {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(() -> {
                MySingleton singleton = MySingleton.getInstanceLazyLoading();
                singleton.print();
            });
            thread.start();
        }
    }
}
