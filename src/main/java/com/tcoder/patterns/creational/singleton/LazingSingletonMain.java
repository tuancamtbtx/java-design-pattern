package com.tcoder.patterns.creational.singleton;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

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
