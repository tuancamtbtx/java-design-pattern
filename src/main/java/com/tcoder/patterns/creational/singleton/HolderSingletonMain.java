package com.tcoder.patterns.creational.singleton;

/**
 * @author tuan.nguyen3
 */
public class HolderSingletonMain {
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            Thread thread = new Thread(() -> {
                MySingleton singleton = MySingleton.getInstanceHolder();
                singleton.print();
            });
            thread.start();
        }
    }
}
