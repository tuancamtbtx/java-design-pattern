package com.tcoder.patterns.creational.abstractfactory.checkbox;

/**
 * @author tuan.nguyen3
 */
public class WindowCheckbox implements ICheckbox{
    @Override
    public void paint() {
        System.out.println("You have created WindowsCheckbox.");
    }
}
