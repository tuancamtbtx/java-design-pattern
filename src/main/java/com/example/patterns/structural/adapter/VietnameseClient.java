package com.example.patterns.structural.adapter;

/**
 * @author tuan.nguyen3
 */
public class VietnameseClient {
    public static void main(String[] args) {
        VietnameseTarget client = new TranslatorAdapter(new JapaneseAdaptee());
        client.send("Xin chào");
    }
}
