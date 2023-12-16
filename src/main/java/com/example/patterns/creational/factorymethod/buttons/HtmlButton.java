package com.example.patterns.creational.factorymethod.buttons;

/**
 * @author tuan.nguyen3
 */
public class HtmlButton implements Button {
    @Override
    public void render() {
        System.out.println("<button>Test Button</button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! button says - 'Hello World!' ");
    }
}
