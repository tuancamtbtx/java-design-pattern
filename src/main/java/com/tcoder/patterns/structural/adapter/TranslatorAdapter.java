package com.tcoder.patterns.structural.adapter;

/**
 * @author tuan.nguyen3
 */
public class TranslatorAdapter implements VietnameseTarget {
    private JapaneseAdaptee adaptee;

    public TranslatorAdapter(JapaneseAdaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void send(String words) {
        System.out.println("Reading Words ...: " + words);
        System.out.println("Sending Words ...: " + words);
        String vietnameseWords = this.translate(words);
        System.out.println("Sending Words in Vietnamese ...: " + vietnameseWords);
        adaptee.receive(vietnameseWords);
    }

    private String translate(String vietnameseWords) {
        System.out.println("Translated!");
        return "こんにちは";
    }
}
