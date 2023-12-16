package com.example.patterns.creational.factorymethod.buttons;

/**
 * @author tuan.nguyen3
 */
public class WindowsButton implements Button {
    @Override
    public void render() {
        System.out.println("Windows Button");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Click! button says - 'Hello World!' ");
    }
}
