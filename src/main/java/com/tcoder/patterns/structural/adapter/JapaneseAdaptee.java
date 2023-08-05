package com.tcoder.patterns.structural.adapter;

/**
 * @author tuan.nguyen3
 */
public class JapaneseAdaptee {
    public void receive(String words) {
        System.out.println("Retrieving words from Adapter ...: " + words);
    }
}
