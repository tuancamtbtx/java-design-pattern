package com.example.patterns.creational.singleton;

/**
 * Singleton is a creational design pattern, which ensures that only one object of its kind exists and provides a single point of access to it for any other code.
 * @author tuan.nguyen3
 */
public class MySingleton {
    private static MySingleton instance;
    public String value;

    private MySingleton(String value) {
        try {
            Thread.sleep(1000);
        }catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        this.value = value;
    }

    /**
        * Thread-safe Singleton without lazy loading
     * */
    public static synchronized MySingleton getInstance() {
        if (instance == null) {
            instance = new MySingleton("Without lazy loading");
        }
        return instance;
    }

    /**
     * Thread-safe Singleton with lazy loading
     * @return
     */
    public static MySingleton getInstanceLazyLoading() {
        MySingleton result = instance;

        if (result != null) {
            return result;
        }
        synchronized (MySingleton.class) {
            if (instance == null) {
                instance = new MySingleton("Lazy loading");
            }
            return instance;
        }
    }

    /**
     * Thread-safe Singleton with lazy loading and inner static class
     *
     * @return
     */
    public static MySingleton getInstanceHolder() {
        return Loader.INSTANCE;
    }

    public void print() {
        System.out.println("Thread " + Thread.currentThread().getName() + " is printing");

    }

    public static class Loader {
        static final MySingleton INSTANCE = new MySingleton("Instance Holder");
    }
}
