package com.example.patterns.creational.abstractfactory.buttons;

/**
 * @author tuan.nguyen3
 */
public class WindowButton implements IButton{
    @Override
    public void paint() {
        System.out.println("You have created WindowsButton.");
    }
}
