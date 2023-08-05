package com.tcoder.patterns.creational.singleton;

/**
 * Singleton is a creational design pattern, which ensures that only one object of its kind exists and provides a single point of access to it for any other code.
 * @author tuan.nguyen3
 */
public class Singleton {
    private static Singleton instance;
    public String value;
    private Singleton(String value) {
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
    public static Singleton getInstance(String value) {
        if (instance == null)
            instance = new Singleton(value);

        return instance;
    }

    /**
     * Thread-safe Singleton with lazy loading
     * @param value
     * @return
     */
    public static Singleton getInstanceLazyLoading(String value) {
        Singleton result = instance;
        if (result != null) {
            return result;
        }
        synchronized (Singleton.class) {
            if (instance == null) {
                instance = new Singleton(value);
            }
            return instance;
        }

    }
}
