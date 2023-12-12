package com.tcoder.patterns.creational.singleton;

import java.io.IOException;

/**
 * @author tuan.nguyen3
 */
public class SingletonMain {
    public static void main(String[] args) throws IOException {
        for (int i = 0; i < 5; i++) {
            Thread thread = new Thread(() -> {
                MySingleton singleton = MySingleton.getInstance();
                singleton.print();
            });
            thread.start();
        }
    }
}
