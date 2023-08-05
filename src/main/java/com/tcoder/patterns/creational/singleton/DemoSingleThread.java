package com.tcoder.patterns.creational.singleton;

/**
 * @author tuan.nguyen3
 */
public class DemoSingleThread {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance("Hello");
        Singleton anotherSingleton = Singleton.getInstance("World");
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }
}
